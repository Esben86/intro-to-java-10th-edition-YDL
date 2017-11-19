package ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 11:
 *
 *  (Paint a smiley face)
 *  Write a program that paints a smiley face, as shown in
 *  Figure 14.46a.
 */

public class Chapter_14_E11_PrintFace extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		// Create face border
		Circle c1 = new Circle(200, 200, 100);
		c1.setFill(Color.WHITE);
		c1.setStroke(Color.BLACK);
		pane.getChildren().add(c1);
		
		// Create left eye border
		Ellipse e1 = new Ellipse(160, 165, 30, 25);
		e1.setFill(Color.WHITE);
		e1.setStroke(Color.BLACK);
		pane.getChildren().add(e1);
		
		// Create right eye border
		Ellipse e2 = new Ellipse(240, 165, 30, 25);
		e2.setFill(Color.WHITE);
		e2.setStroke(Color.BLACK);
		pane.getChildren().add(e2);
		
		// Create left eye fill
		Circle c2 = new Circle(160, 165, 15);
		c2.setFill(Color.BLACK);
		pane.getChildren().add(c2);
		
		// Create right eye fill
		Circle c3 = new Circle(240, 165, 15);
		c3.setFill(Color.BLACK);
		pane.getChildren().add(c3);
		
		// Create mouth
		Arc arc = new Arc(200, 255, 55, 15, 180, 180);
		arc.setStroke(Color.BLACK);
		arc.setFill(Color.WHITE);
		pane.getChildren().add(arc);
		
		// Create nose
		Line l1 = new Line(200, 200, 225, 235);
		Line l2 = new Line(180, 235, 225, 235);
		pane.getChildren().add(l1);
		pane.getChildren().add(l2);
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Exercise_14_11");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
