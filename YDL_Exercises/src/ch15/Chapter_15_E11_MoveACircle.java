package ch15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Chapter 15 Exercise 11:
 *
 *      (Move a circle using keys)
 *      Write a program that moves a circle up, down, left, or right using the arrow keys.
 *
 */

public class Chapter_15_E11_MoveACircle extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	public void start(Stage primaryStage) {
		
		double width = 400, height = 400;
		double centerX = width / 2;
		double centerY = height / 2;
		
		
		// Create a pane
		Pane pane = new Pane();
		Circle circle = new Circle(centerX, centerY, 25);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);
		
		// Create handler
		pane.setOnKeyPressed(e -> {
			
			switch(e.getCode()) {
			
			case UP: circle.setCenterY(circle.getCenterY() > 0 ? circle.getCenterY() - 10 : circle.getCenterY()); break;
			
			case DOWN: circle.setCenterY(circle.getCenterY() < pane.getHeight() ? 
					   circle.getCenterY() + 10 : circle.getCenterY()); break;
			
			case LEFT: circle.setCenterX(circle.getCenterX() > 0 ? circle.getCenterX() - 10 : circle.getCenterX()); break;
			
			case RIGHT: circle.setCenterX(circle.getCenterX() < pane.getWidth() ? 
					    circle.getCenterX() + 10 : circle.getCenterX()); break;
			
			}
		});
				
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 350, 350);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_11");
		primaryStage.show();
		pane.requestFocus();
	}

}
