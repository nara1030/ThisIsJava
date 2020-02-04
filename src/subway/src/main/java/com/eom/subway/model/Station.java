package com.eom.subway.model;

import java.util.ArrayList;

public class Station {
    // 이전 역(복수 가능; 환승역)
    private final ArrayList<Station> prev;
    // 다음 역(복수 가능; 환승역)
    private final ArrayList<Station> next;
    // 역코드
    private String code = null;
    // 역이름
    private String name = null;

    public Station() {
        prev = new ArrayList<>();
        next = new ArrayList<>();
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Station getPrev(int index) {
        return this.prev.get(index);
    }

    public void addPrev(Station station) {
        if (!this.next.contains(station)) {
            this.prev.add(station);
        }
    }

    public Station getNext(int index) {
        return this.next.get(index);
    }

    public void addNext(Station station) {
        if (!this.next.contains(station)) {
            this.next.add(station);
        }
    }

    public String toString() {
        return "[CODE]: " + code + ", [NAME]: " + name;
    }

    public int getPrevCount() {
        return this.prev.size();
    }

    public int getNextCount() {
        return this.next.size();
    }
}
