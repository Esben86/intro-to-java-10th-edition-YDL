package ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Chapter 14 Exercise 2:
 *
 *      (Tic-tac-toe board)
 *      Write a program that displays a tic-tac-toe board,
 *      as shown in Figure 14.43b. A cell may be X, O, or empty.
 *      What to display at each cell is randomly decided.
 *      The X and O are images in the files x.gif and o.gif.
 *
 */

public class Chapter_14_E02_TicTacToeBoard extends Application {

	public static void main(String[] args) {
		
		Application.launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		// Create a pane to hold the images
		GridPane pane = new GridPane();
		
		// Add images to the pane
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				String xo = "";
				// Pick a number blank(0), x(1), or o(2)
				int random = (int)(Math.random() * 3);
				if (random != 0) {
					xo = ((random == 1) ? "x" : "o");
					pane.add(new ImageView(new Image("file:image\\" + xo + ".gif")), j, i);
				}	
			}
		}
		// Create a scene and place in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_14_02");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
