package ch15;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * Chapter 15 Exercise 6:
 *
 *      Alternate two messages)
 *      Write a program to display the text Java is fun and Java is powerful
 *      alternately with a mouse click.
 *
 */

public class Chapter_15_E06_AlternateTwoMessages extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();
		
		// Create text
		Text t1 = new Text(100, 100, "Welcome to Java");
		t1.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 40));
		t1.setFill(Color.BLACK);
		Text t2 = new Text(100, 100, "Learning JavaFX");
		t2.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 40));
		t2.setFill(Color.BLACK);
		
		pane.getChildren().add(t1);
		
		// Create handlers for switch thext
		pane.setOnMousePressed(e -> {
			pane.getChildren().clear();
			pane.getChildren().add(t2);
		});
		
		pane.setOnMouseReleased(e -> {
			pane.getChildren().clear();
			pane.getChildren().add(t1);
		});
		
		// Create a scene and placte in in the stage
		Scene scene = new Scene(pane, 500, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_06");
		primaryStage.show();
	}

}
