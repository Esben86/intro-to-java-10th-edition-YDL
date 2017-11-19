package ch15;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;

/**
 * Chapter 15 Exercise 9:
 *
 *      (Draw lines using the arrow keys)
 *      Write a program that draws line segments using the arrow keys.
 *      The line starts from the center of the pane and draws toward east,
 *      north, west, or south when the right-arrow key, up-arrow key,
 *      left- arrow key, or down-arrow key is pressed,
 *      as shown in Figure 15.26b.
 *
 */

public class Chapter_15_E09_DrawArrowKeys extends Application {
	
	Pane pane = new Pane();
	double width = 300;
	double height = 300;
	double xCoor = width / 2;
	double yCoor = height / 2;
	
	public static void main(String[] args) {
		
		launch(args);

	}
	
	public void start(Stage primaryStage) {
				
		pane.setOnKeyPressed(e-> {
			
			switch (e.getCode()){
				
			case UP: pane.getChildren().add(new Polyline(xCoor, yCoor, xCoor, yCoor - 10));
					 yCoor -= 10; break;
			case DOWN: pane.getChildren().add(new Polyline(xCoor, yCoor, xCoor, yCoor + 10));
			 		   yCoor += 10; break;
			case LEFT: pane.getChildren().add(new Polyline(xCoor, yCoor, xCoor - 10, yCoor));
			 		   xCoor -= 10; break;
			case RIGHT: pane.getChildren().add(new Polyline(xCoor, yCoor, xCoor + 10, yCoor));
	 		 		    xCoor += 10; 
			
			}	
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, width, height);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_09");
		primaryStage.show();
		pane.requestFocus();
		
	}

}
