package ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Chapter 14 Exercise 1:
 *
 *      (Display images)
 *      Write a program that displays four images in a grid pane,
 *      as shown in Figure 14.43a.
 *
 */


public class Chapter_14_E01_DisplayImages extends Application {

	public static void main(String[] args) {
		
		Application.launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		// Create a pane to hold the imageviews
		GridPane pane = new GridPane();
								
		// Add images to the pane
		pane.add(new ImageView(new Image("file:image\\uk.gif")), 0, 0);
		pane.add(new ImageView(new Image("file:image\\ca.gif")), 1, 0);
		pane.add(new ImageView(new Image("file:image\\china.gif")), 0, 1);
		pane.add(new ImageView(new Image("file:image\\us.gif")), 1, 1);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_01"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show();
		
		
	}

}
