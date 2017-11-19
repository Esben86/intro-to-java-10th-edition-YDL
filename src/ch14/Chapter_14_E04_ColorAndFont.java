package ch14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 4:
 * (Color and font)
 * Write a program that displays five texts vertically,
 * as shown in Figure 14.44a. Set a random color and opacity for each text
 * and set the font of each text to Times Roman, bold, italic, and 24 pixels.
 * 
 */

public class Chapter_14_E04_ColorAndFont extends Application {

	public static void main(String[] args) {
				
		Application.launch(args);
		
	}
	
	public void start(Stage primaryStage) {
		
		// Crate a pane to hold the labels
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(30, 0, 0, 0));
		
		// Create labels for text
		Label[] labels = new Label[5];
		for (int i = 0; i < 5; i++) {
			labels[i] = new Label("JavaFX");
			labels[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 24));
			labels[i].setTextFill(getRandomColor());
			labels[i].setRotate(90);
			pane.add(labels[i], i, 0);
		}
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 100);
		primaryStage.setTitle("Exercise_14_04");
		primaryStage.setScene(scene);
		primaryStage.show();
			
	}
	
	public static Color getRandomColor() {
		return new Color(Math.random(), Math.random(), Math.random(), Math.random());
	}

}
