package com.eom.subway;

import com.eom.subway.common.SubwayException;
import com.eom.subway.controller.SubwayBuilder;
import com.eom.subway.controller.SubwayController;
import com.eom.subway.model.Subway;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        // 빌더 생성
        try {
            SubwayBuilder builder = SubwayBuilder.getInstance().readFile(new File(path + "/station.txt"), new File(path + "/link.txt"));
            Subway subway = builder.build();
            // 검색을 위한 컨트롤러 생성
            SubwayController controller = new SubwayController(subway);
            // 의정부 북부에서 교대의 최단 노선 찾기
            String ret = controller.search("1", "91");
            System.out.println(ret);
        } catch (SubwayException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
