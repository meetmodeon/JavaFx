package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Stage stage=new Stage();
        Group root=new Group();
        Scene scene=new Scene(root, Color.BLACK);

       Image icon=new Image("C:\JavaFx\demo\src\triton.png");
        stage.getIcons().add(icon);
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setTitle("Stage Demo Program w00t w00t");
        stage.setResizable(false);
       stage.setX(50);
       stage.setY(50);
        stage.setFullScreen(true);
        //To set exit full screen combination

        stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");;
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        //*****Scene concept*****//

        Group root=new Group();
        Scene scene=new Scene(root,600,600,Color.LIGHTSKYBLUE);
        Stage stage=new Stage();

        Text text=new Text();
        text.setText("WOOOOA!!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.GREEN);

        Line line=new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(500);
        line.setStartY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        //Rectangle Shape

        Rectangle rectangle=new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(200);
        rectangle.setHeight(100);
        rectangle.setFill(Color.YELLOW);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.RED);

        //Polygon To create triangle

        Polygon triangle=new Polygon();
        triangle.getPoints().setAll(200.0,200.0,300.0,300.0,200.0,300.0);
        triangle.setFill(Color.YELLOWGREEN);

        //Create Circle
        Circle circle=new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        //Add image in my project

        Image image=new Image("C:\\JavaFx\\demo\\src\\triton.png");
        ImageView imageView=new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();

    }
}
