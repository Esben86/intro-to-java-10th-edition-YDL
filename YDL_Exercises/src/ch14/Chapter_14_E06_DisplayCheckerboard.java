package ch14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Chapter 14 Exercise 6:
 *
 * (Game: display a checkerboard)
 * Write a program that displays a checkerboard in which each
 * white and black cell is a MyRec2 with a fill color black or white,
 * as shown in Figure 14.44c.
 *
 */

public class Chapter_14_E06_DisplayCheckerboard extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				
				Rectangle r = new Rectangle(15, 15);
				r.setStroke(Color.BLACK);
				Color fill;
				
				fill = ( (i % 2 == 0) ^ (j % 2 != 0) ) ? Color.WHITE : Color.BLACK;
				r.setFill(fill);
				
				pane.add(r, j, i);
				
			}
		}
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_14_6");
		primaryStage.show();
	}

}
