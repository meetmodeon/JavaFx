package com.example.loginform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button login;
    @FXML
    private Label wronglogin;

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userlogIn(ActionEvent event)throws IOException{
        checkLogin();
    }
    private void checkLogin() throws IOException{
        HelloApplication m=new HelloApplication();
        if(username.getText().toString().equals("meetyadav@gmail.com")&& password.getText().toString().equals("Lumad&786"))
        {
            wronglogin.setText("Successfull!");
            m.changeScene("afterlogin.fxml");


        } else if (username.getText().toString().isEmpty() && password.getText().toString().isEmpty()) {
            wronglogin.setText("Please enter your data");

        }
        else {
            wronglogin.setText("Wrong username or password");
        }
    }

    }