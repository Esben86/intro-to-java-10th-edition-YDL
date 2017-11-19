package ch14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 22:
 *
 *      (Connect two circles) Write a program that draws two circles
 *      with radius 15 pixels, centered at random locations, with a
 *      line connecting the two circles. The line should not cross inside the circles,
 *      as shown in Figure 14.49c.
 *
 */

public class Chapter_14_E22_ConnectTwoCircles extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		// Create a pane
		Pane pane = new Pane();
		pane.setPadding(new Insets(50, 50, 50, 50));
		
		// Create circle 1
		Circle c1 = new Circle(getCoordinate(), getCoordinate(), 15);
		c1.setFill(Color.WHITE);
		c1.setStroke(Color.BLACK);
		
		// Create circle 2
		Circle c2 = new Circle(getCoordinate(), getCoordinate(), 15);
		c2.setFill(Color.WHITE);
		c2.setStroke(Color.BLACK);
		
		// Create a connecting line
		Line line = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
		pane.getChildren().add(line);
		
		// Add circles after line so the connecting line stops at the right place
		pane.getChildren().add(c1);
		pane.getChildren().add(c2);
		
		// Add numbers for each circle
		Text t1 = new Text(c1.getCenterX(), c1.getCenterY(), "1");
		Text t2 = new Text(c2.getCenterX(), c2.getCenterY(), "2");
		pane.getChildren().addAll(t1, t2);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Exercise_14_21");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static double getCoordinate() {
		return (Math.random() * 360);
	}
	
}
