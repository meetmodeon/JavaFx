package com.example.progressbar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.DoubleBinaryOperator;

public class HelloController implements Initializable {

    @FXML
    private ProgressBar myProgressBar;

    @FXML
    private Button myButton;

    @FXML
    private Label myLabel;

   BigDecimal progress=new BigDecimal(String.format("%.2f",0.0));

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //TODO Auto-generated method stub
        myProgressBar.setStyle("-fx-accent: #00FF00");
    }
    public void increamentProgress() {
        if (progress.doubleValue() < 1) {
            progress =new BigDecimal(String.format("%.2f",progress.doubleValue()+0.1));
            myProgressBar.setProgress(progress.doubleValue());
            myLabel.setText(Integer.toString((int) Math.round(progress.doubleValue() * 100)) + "%");

        }
    }




  }