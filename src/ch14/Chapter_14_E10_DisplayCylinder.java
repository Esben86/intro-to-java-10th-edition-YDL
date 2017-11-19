package ch14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

/**
 * Chapter 14 Exercise 10:
 *
 *      (Display a cylinder)
 *      Write a program that draws a cylinder, as shown in Figure 14.45b.
 *      You can use the following method to set the dashed stroke for an arc:
 *      Display a random matrix
 *
 *      arc.getStrokeDashArray().addAll(6.0, 21.0);
 *
 */

public class Chapter_14_E10_DisplayCylinder extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		Ellipse e1 = new Ellipse(200, 100, 100, 40);
		e1.setStroke(Color.BLACK);
		e1.setFill(Color.WHITE);
		pane.getChildren().add(e1);
		
		Line l1 = new Line(100, 100, 100, 350);
		pane.getChildren().add(l1);
		
		Line l2 = new Line(300, 100, 300, 350);
		pane.getChildren().add(l2);
		
		Arc solidArc = new Arc(200, 350, 100, 50, 180, 180);
		solidArc.setStroke(Color.BLACK);
		solidArc.setFill(Color.WHITE);
		pane.getChildren().add(solidArc);
		
		Arc dashedArc = new Arc(200, 350, 100, 50, 0, 180);
		dashedArc.setStroke(Color.BLACK);
		dashedArc.setFill(Color.WHITE);
		dashedArc.getStrokeDashArray().addAll(6.0, 21.0);
		pane.getChildren().add(dashedArc);
		
		Scene scene = new Scene(pane, 400, 500);
		primaryStage.setTitle("Exercise_14_10");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
