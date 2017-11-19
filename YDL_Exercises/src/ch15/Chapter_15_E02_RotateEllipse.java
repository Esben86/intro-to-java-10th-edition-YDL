package ch15;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Chapter 15 Exercise :
 *
 *      (Rotate an ellipse)
 *      Write a program that rotates an ellipse 15 degrees
 *      right when the Rotate button is clicked,
 *      as shown in Figure 15.24b.
 *
 * Created by Luiz Arantes Sa on 9/15/14.
 */

public class Chapter_15_E02_RotateEllipse extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		// Create pane
		BorderPane borderPane = new BorderPane();
		
		// Create ellipse
		Ellipse ellipse = new Ellipse(150, 100, 100, 50);
		ellipse.setFill(Color.WHITE);
		ellipse.setStroke(Color.BLACK);
		
		// Create button
		Button rotate = new Button("Rotate");
						
		// Create handler for rotation
		rotate.setOnAction((ActionEvent e) -> {
			ellipse.setRotate(ellipse.getRotate() + 15);
		});
		
		// Add nodes to pane
		borderPane.setCenter(ellipse);
		borderPane.setBottom(rotate);
		BorderPane.setAlignment(ellipse, Pos.CENTER);
		BorderPane.setAlignment(rotate, Pos.CENTER);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 250, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_02");
		primaryStage.show();
		
	}
	
}
