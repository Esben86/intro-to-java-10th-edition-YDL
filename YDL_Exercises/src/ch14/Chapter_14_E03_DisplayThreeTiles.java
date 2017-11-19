package ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import java.util.ArrayList;

/**
 * Chapter 14 Exercise 3:
 *
 *      (Display three tiles)
 *      Write a program that displays three tiles randomly selected from
 *      tiles of 32, as shown in Figure 14.43c. The Tien-Gow image files are
 *      named 1.png, 2.png,....36.png and stored in the image/tiengow directory.
 *      All three tiles are distinct and selected randomly.
 *
 */

public class Chapter_14_E03_DisplayThreeTiles extends Application {

	public static void main(String[] args) {
		
		Application.launch(args);

	}
	
	public void start(Stage primaryStage) {
		
		// Create an arraylist to store number values
		ArrayList<Integer> tileNumbers = new ArrayList<>();
		for (int i = 1; i <= 36; i++)
			tileNumbers.add(i);
		java.util.Collections.shuffle(tileNumbers);
		
		// Create a pane to hold the images
		GridPane pane = new GridPane();	
		pane.setHgap(2);
		
		// Add images to pane
		for (int i = 0; i <= 2; i++) {
			pane.add(new ImageView(new Image("file:image\\tiengow\\" + tileNumbers.get(i) + ".png")), i, 0);
		}
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_03");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}