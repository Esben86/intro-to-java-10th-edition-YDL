package ch14;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

/**
 * Chapter 14 Exercise 5:
 *
 *    (Characters around circle)
 *    Write a program that displays a string Welcome to Java around
 *    the circle, as shown in Figure 14.44b. Hint: You need to display
 *    each character in the right location with appropriate
 *    rotation using a loop.
 *
 */

public class Chapter_14_E05_CircleCharacters extends Application {

	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		String word = "Learning JavaFX";
				
		double radius = 100;
		double angle = 0;
		double rotate = 90;
		
		Point2D xy = new Point2D(120, 125);
		
		for (int i = 0; i < word.length(); i++, angle += 23, rotate += 23) {
			
			double x = xy.getX() + Math.cos(Math.toRadians(angle)) * radius;
			double y = xy.getY() + Math.sin(Math.toRadians(angle)) * radius;
			
			Text text = new Text("" + word.charAt(i));
			text.setX(x);
			text.setY(y);
			text.setRotate(rotate);
			text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
			text.setFill(getColor());
			
			pane.getChildren().add(text);
			
		}
		
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_14_5");
		primaryStage.show();
		
	}
	
	public Color getColor() {
		return new Color(Math.random(), Math.random(), Math.random(), 1);
	}

}
