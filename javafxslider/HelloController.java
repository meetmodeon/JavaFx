package com.example.javafxslider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private Slider mySlider;
    int myTemperature;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                myTemperature=(int) mySlider.getValue();
                myLabel.setText(Integer.toString(myTemperature)+ "'C");

            }
        });
    }
}