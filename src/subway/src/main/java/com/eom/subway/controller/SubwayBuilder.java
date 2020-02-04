package com.eom.subway.controller;

import com.eom.subway.common.SubwayException;
import com.eom.subway.model.Station;
import com.eom.subway.model.Subway;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SubwayBuilder {
    // 싱글톤 패턴으로 데이터 무결성을 만든다.
    private static SubwayBuilder singleton = null;

    public static SubwayBuilder getInstance() {
        if (SubwayBuilder.singleton == null) {
            SubwayBuilder.singleton = new SubwayBuilder();
        }
        return SubwayBuilder.singleton;
    }

    // builder 안에 있는 subway 클래스
    private Subway subway;

    private SubwayBuilder() {
        this.subway = new Subway();
    }

    // build 시 클래스 복제
    public Subway build() {
        return this.subway.clone();
    }

    // 역 링크정보 읽기
    public SubwayBuilder readFile(File subwayFile, File linkFile) throws SubwayException, IOException {
        // 프로퍼티 역 정보 취득
        readSubway(subwayFile);
        // 프로퍼티 링크 정보 취득
        readLink(linkFile);
        return this;
    }

    // 파일로부터 역 정보 읽기
    private void readSubway(File file) throws SubwayException, IOException {
        byte[] buffer = new byte[(int) file.length()];
        try (FileInputStream in = new FileInputStream(file)) {
            in.read(buffer, 0, buffer.length);
        }
        String data = new String(buffer);
        String[] lineBuffer = data.split("\n");
        // 데이터가 하나도 없으면 에러
        if (lineBuffer.length <= 0) {
            new IOException("document style wrong");
        }

        // 역을 클래스화
        for (String line : lineBuffer) {
            String[] buf = line.replace("\r", "").split(",");
            // 데이터 이상은 통과
            if (buf.length != 2) {
                continue;
            }
            // 파일 형식은 코드, 역명
            this.subway.addStation(buf[0], buf[1]);
        }
    }

    // 파일로부터 역 링크 읽기
    private void readLink(File file) throws IOException {
        byte[] buffer = new byte[(int) file.length()];
        try (FileInputStream in = new FileInputStream(file)) {
            in.read(buffer, 0, buffer.length);
        }
        String data = new String(buffer);
        String[] lineBuffer = data.split("\n");
        if (lineBuffer.length <= 0) {
            throw new IOException("document style wrong");
        }
        // 링크 만들기
        for (String line : lineBuffer) {
            String[] buf = line.replace("\r", "").split(",");
            // 데이터 이상은 통과
            if (buf.length != 3) {
                continue;
            }

            if ("n".equals(buf[0])) {   // buf[1]의 다음 역은 buf[2]
                setNextStation(buf[1], buf[2]);
            } else if ("p".equals(buf[0])) {    // buf[1]의 이전 역은 buf[2]
                setPrevStation(buf[1], buf[2]);
            }
        }
    }

    /*
     * 이전 역 세팅
     * @param point 기준 역 정보
     * @param prev  이전 역 정보
     */
    public SubwayBuilder setPrevStation(Station point, Station prev) {
        point.addPrev(prev);
        prev.addNext(point);
        return this;
    }

    /*
     * 이전 역 세팅(다형성)
     * @param pointCode 기준 역 코드
     * @param prevCode  이전 역 코드
     */
    private SubwayBuilder setPrevStation(String pointCode, String prevCode) {
        Station point = this.subway.getStation(pointCode);
        Station prev = this.subway.getStation(prevCode);
        setPrevStation(point, prev);
        return this;
    }

    /*
     * 다음 역 세팅
     * @param point 기준 역 정보
     * @param next  다음 역 정보
     */
    public SubwayBuilder setNextStation(Station point, Station next) {
        point.addNext(next);
        next.addPrev(point);
        return this;
    }

    /*
     * 다음 역 세팅(다형성)
     * @param pointCode 기준 역 코드
     * @param nextCode  다음 역 코드
     */
    private SubwayBuilder setNextStation(String pointCode, String nextCode) {
        Station point = this.subway.getStation(pointCode);
        Station next = this.subway.getStation(nextCode);
        setNextStation(point, next);
        return this;
    }

}
