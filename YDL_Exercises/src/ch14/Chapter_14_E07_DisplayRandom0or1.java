package ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 7:
 *
 *      (Display random 0 or 1)
 *      Write a program that displays a 10-by-10 square matrix,
 *      as shown in Figure 14.45a. Each element in the matrix is 0 or 1,
 *      randomly generated. Display each number centered in a text field.
 *      Use TextField’s setText method to set value 0 or 1 as a string.
 *
 */


public class Chapter_14_E07_DisplayRandom0or1 extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				pane.add(new TextField(String.valueOf((int) (Math.random() * 2))), j, i);
			}
		}
		
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Exercise_14_07");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
