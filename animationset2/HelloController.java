package com.example.animationset2;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ImageView myImage;
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        //translate
//        TranslateTransition translate=new TranslateTransition();
//        translate.setNode(myImage);
//        translate.setDuration(Duration.millis(1000));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setByX(250);
//        translate.setByY(-250);
//        translate.setAutoReverse(true);
//        translate.play();

        //rotate
//

        //Fade
       /* FadeTransition fade=new FadeTransition();
        fade.setNode(myImage);
        fade.setDuration(Duration.millis(500));
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
                */
        // scale
        ScaleTransition scale=new ScaleTransition();
        scale.setNode(myImage);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(TranslateTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(2.0);
        scale.setByY(2.0);
        scale.setAutoReverse(true);
        scale.play();


    }
}