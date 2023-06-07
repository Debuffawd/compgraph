package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Group root = new Group(); // making the root of all scene's objects
        Scene scene = new Scene (root, 800, 500);

        scene.setFill(Color.RED); // set the color of scene

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                200.0, 280.0,
                230.0, 200.0,
                400.0, 190.0,
                440.0, 290.0,
                320.0, 350.0,
        });
        polygon.setFill(Color.BLUE);
        root.getChildren().add(polygon);

        Line line = new Line(320.0, 500.0, 320.0, 353.0);
        line.setStroke(Color.YELLOW);
        line.setStrokeWidth(10.0);
        root.getChildren().add(line);

        Polygon triangle1 = new Polygon();
        triangle1.getPoints().addAll(new Double[]{
                200.0, 280.0,
                230.0, 200.0,
                90.0, 210.0 });
        triangle1.setFill(Color.YELLOW);
        root.getChildren().add(triangle1);

        Polygon triangle2 = new Polygon();
        triangle2.getPoints().addAll(new Double[]{
                230.0, 200.0,
                400.0, 190.0,
                310.0, 50.0 });
        triangle2.setFill(Color.YELLOW);
        root.getChildren().add(triangle2);

        Polygon triangle3 = new Polygon();
        triangle3.getPoints().addAll(new Double[]{
                400.0, 190.0,
                440.0, 290.0,
                600.0, 195.0 });
        triangle3.setFill(Color.YELLOW);
        root.getChildren().add(triangle3);


        Polygon triangle4 = new Polygon();
        triangle4.getPoints().addAll(new Double[]{
                440.0, 290.0,
                320.0, 350.0,
                500.0, 450.0 });
        triangle4.setFill(Color.YELLOW);
        root.getChildren().add(triangle4);

        Polygon triangle5 = new Polygon();
        triangle5.getPoints().addAll(new Double[]{
                200.0, 280.0,
                320.0, 350.0,
                150.0, 420.0 });
        triangle5.setFill(Color.YELLOW);
        root.getChildren().add(triangle5);

        primaryStage.setScene(scene);
        primaryStage.show(); // show the scene
    }

    public static void main(String[] args) {
        launch();
    }
}