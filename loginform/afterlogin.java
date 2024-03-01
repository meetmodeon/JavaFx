package com.example.loginform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class afterlogin {
    @FXML
    private Button logout;
    public void userlogout(ActionEvent event) throws IOException{
        HelloApplication m=new HelloApplication();
        m.changeScene("hello-view.fxml");
    }
}
