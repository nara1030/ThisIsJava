package com.eom.ex04;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox();                     // HBox 컨테이너 생성
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);

        TextField textField = new TextField();      // TextField 컨트롤 생성
        textField.setPrefWidth(200);

        Button button = new Button();               // Button 컨트롤 생성
        button.setText("확인");

        // Generic 설정 안해줌
        ObservableList list = hBox.getChildren();   // HBox의 ObservableList 얻기
        list.add(textField);
        list.add(button);

        Scene scene = new Scene(hBox);

        primaryStage.setTitle("AppMain");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
