package ch15;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Chapter 15 Exercise 7:
 *
 *      (Change color using a mouse)
 *      Write a program that displays the color of a circle as
 *      black when the mouse button is pressed and as white when
 *      the mouse button is released.
 *
 */

public class Chapter_15_E07_ChangeColor extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		
		// Create a circle
		Circle c1 = new Circle(125, 125, 50);
		c1.setStroke(Color.RED);
		c1.setFill(Color.WHITE);
		
		// Create handlers
		pane.setOnMousePressed(e -> {
			c1.setStroke(Color.BLUE);
		});
		
		pane.setOnMouseReleased(e -> {
			c1.setStroke(Color.RED);
		});
	
		
		// Add circle to pane
		pane.getChildren().add(c1);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_07");
		primaryStage.show();
	}

}
