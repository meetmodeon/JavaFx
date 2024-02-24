package com.example.choicebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoiceBox;
    private String[] food={"Pizza","Sushi","Ramen"};

    @Override
    public void initialize(URL arg0, ResourceBundle args1) {
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::getFood);
    }
    public void getFood(ActionEvent event){
        String myFood=myChoiceBox.getValue();
        myLabel.setText(myFood);
    }
}