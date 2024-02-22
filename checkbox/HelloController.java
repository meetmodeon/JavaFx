package com.example.checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private CheckBox myCheckBox;
    @FXML
    private Label myLabel;
    @FXML
    private ImageView myImage;

    Image myImages1=new Image(getClass().getResourceAsStream("On.png"));
    Image myImages2=new Image(getClass().getResourceAsStream("Off.png"));

    public void change(ActionEvent event){
        if(myCheckBox.isSelected()){
            myLabel.setText("ON");
            myImage.setImage(myImages1);
        }
        else {
           myLabel.setText("OFF");
           myImage.setImage(myImages2);
        }
    }


}