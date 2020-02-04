package com.eom.subway.controller;

import com.eom.subway.common.SubwayException;
import com.eom.subway.model.Station;
import com.eom.subway.model.Subway;

import java.util.ArrayList;
import java.util.Stack;

public class SubwayController {
    private Subway subway;

    public SubwayController(Subway subway) {
        this.subway = subway;
    }

    /*
     * 역 탐색
     * @param start 출발 역 코드
     * @param end   도착 역 코드
     * @return 노선 출력
     */
    public String search(String start, String end) throws SubwayException {
        Station startStation = this.subway.getStation(start);
        Station endStation = this.subway.getStation(end);
        return search(startStation, endStation);
    }

    /*
     * 역 탐색(다형성)
     * @param start 출발 역 정보
     * @param end   도착 역 정보
     * @return 노선 출력
     */
    private String search(Station start, Station end) throws SubwayException {
        // 모든 탐색 정보
        ArrayList<ArrayList<Station>> list = new ArrayList<>();
        // 탐색용 버퍼
        Stack<Station> buffer = new Stack<>();
        // 역 코드로 역을 탐색(없으면 에러 발생)
        if (this.subway.getStation(start.getCode()) == null) {
            throw new SubwayException("Not Station");
        }
        if (this.subway.getStation(end.getCode()) == null) {
            throw new SubwayException("Not Station");
        }
        // 경로 탐색
        nodeExplorer(start, end, buffer, list);
        // 출력
        String ret = "";
        int index = 0;
        int size = 999999;
        // 최단 탐색
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() < size) {
                size = list.get(i).size();
                index = i;
            }
        }
        // 모든 경로를 출력
        for (ArrayList<Station> item : list) {
            ret += print(item);
        }
        ret += "\r\n\r\n";
        // 최단 경로를 출력
        ret += "Best root\r\n";
        ret += print(list.get(index));
        return ret;
    }

    private String print(ArrayList<Station> item) {
        StringBuffer sb = new StringBuffer();
        sb.append("Size: " + item.size() + "**");
        for (Station station : item) {
            if (sb.length() > 0) {
                sb.append("->");
            }
            sb.append(station.toString());
        }
        sb.append("\r\n");
        return sb.toString();
    }

    /*
     * 노드 탐색(재귀적)
     * @param point  현재 탐색 역
     * @param end    종착 역
     * @param buffer 버퍼
     * @param list   노드리스트
     */
    private boolean nodeExplorer(Station point, Station end, Stack<Station> buffer, ArrayList<ArrayList<Station>> list) {
        // 탐색역과 종착역이 같으면 도착
        if (point == end) {
            // 탐색 노드 선언
            ArrayList<Station> root = new ArrayList<>();
            // 노드 담기
            for (Station station : buffer) {
                root.add(station);
            }
            // 마지막역 담기
            root.add(point);
            // 리스트 추가
            list.add(root);
            return true;
        }
        // 현재 역 없으면 재탐색
        if (point == null) {
            return false;
        }
        // 버퍼에 현재 역 담기
        buffer.push(point);
        // 현재 역의 이전 역 개수만큼
        for (int i = 0; i < point.getPrevCount(); i++) {
            // 버퍼에 현재 역이 있으면 돌아가기(지나간 역을 다시 지나가면 무의미)
            // 예) 종각에서 시청을 갔는데 시청에서 다시 종각을 가면 무의미
            if (buffer.contains(point.getPrev(i))) {
                continue;
            }
            // 없으면 이전 역으로 이동
            if (!nodeExplorer(point.getPrev(i), end, buffer, list)) {
                // 재탐색이 되면 현재 역은 경로 아님
                if (buffer.size() > 0) {
                    buffer.pop();
                }
            }
        }
        // 현재 역의 다음 역 개수만큼
        for (int i = 0; i < point.getNextCount(); i++) {
            // 버퍼에 현재 역이 있으면 돌아가기
            if (buffer.contains(point.getNext(i))) {
                continue;
            }
            if (!nodeExplorer(point.getNext(i), end, buffer, list)) {
                // 재탐색이 되면 현재 역은 경로 아님
                buffer.pop();
            }
        }
        // 재탐색
        return false;
    }
}
