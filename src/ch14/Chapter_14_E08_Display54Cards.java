package ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 8:
 *
 *      (Display 54 cards)
 *      Expand Exercise 14.3 to display all 54 cards (including two jokers),
 *      nine per row. The image files are jokers and are named 53.jpg and 54.jpg.
 *
 */

public class Chapter_14_E08_Display54Cards extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
		}
	
	@Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();	
		
		int cardCount = 1;
		
		for (int i = 0; i < 6; i++) { 
			for (int j = 0; j < 9; j++) {
				pane.add(new ImageView(new Image("file:image\\card\\" + (cardCount++) + ".png")), j, i);
			}	
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
