package com.eom.subway.model;

import com.eom.subway.common.SubwayException;

import java.util.ArrayList;

/*
 * 지하철 노선 탐색 알고리즘
 */
// 역정보 리스트
public class Subway extends ArrayList<Station> implements Cloneable {
    private static final long serialVersionUID = 1L;

    public Subway() {
    }

    /*
     * 역추가(다형성)
     * @param code 역 코드
     * @param name 역 이름
     */
    public void addStation(String code, String name) throws SubwayException {
        Station station = new Station();
        station.setCode(code);
        station.setName(name);
        addStation(station);
    }

    public final boolean add(Station station) {
        throw new RuntimeException("More not supported");
    }

    /*
     * 역추가(다형성)
     * @param station 역 클래스
     */
    public void addStation(Station station) throws SubwayException {
        // 역코드 중복 시 에러
        if (getStation(station.getCode()) != null) {
            throw new SubwayException("same code");
        }
        super.add(station);
    }

    /*
     * 코드로 역 찾기
     * @param code
     */
    public Station getStation(String code) {
        for (Station station : this) {
            if (station.getCode().equals(code)) {
                return station;
            }
        }
        return null;
    }

    public String toString() {
        String ret = "";
        for (Station station : this) {
            ret += station.toString() + "\r\n";
        }
        return ret;
    }

    @Override
    public Subway clone() {
        try {
            return (Subway) super.clone();
        } catch (Throwable e) {
            return null;
        }
    }
}
