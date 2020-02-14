package com.eom.ex01;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {
    // intellij Override 단축키: ctrl + i
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();    // 윈도우(javafx.stage.Stage) 보여주기
    }

    public static void main(String[] args) {
        launch(args);
    }
}
