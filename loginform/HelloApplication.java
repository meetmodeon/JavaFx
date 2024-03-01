package com.example.loginform;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        stg=stage;
        stage.setResizable(false);
       Parent root=FXMLLoader.load(getClass().getResource("hello-view.fxml"));
       Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void changeScene(String fxml)throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(root);

    }

    public static void main(String[] args) {
        launch();
    }
}