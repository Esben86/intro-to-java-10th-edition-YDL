package ch15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

/**
 * Chapter 15 Exercise 8:
 *
 *      (Display the mouse position)
 *      Write two programs, such that one displays the mouse position
 *      when the mouse button is clicked (see Figure 15.26a) and the
 *      other displays the mouse position when the mouse button is pressed
 *      and ceases to display it when the mouse button is released.
 *
 */

public class Chapter_15_E08_DisplayMousePosition2 extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	public void start(Stage primaryStage) {
		// Create a pane 
		Pane pane = new Pane();
		
		// Create textfield with coordinates
		Text coordinates = new Text(20, 20, "(X, Y)");
		
		// Create handler that displays x and y coors when mouse is clicked
		pane.setOnMousePressed(e -> {
			coordinates.setX(e.getX());
			coordinates.setY(e.getY());
			coordinates.setText("(" + e.getX() + " , " + e.getY() + ")");
		});
		
		pane.setOnMouseReleased(e -> {
			coordinates.setText("");
		});
		
		// Add text to pane
		pane.getChildren().add(coordinates);
				
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_E08");
		primaryStage.show();
		
	}

}
