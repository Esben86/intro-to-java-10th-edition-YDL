package ch14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

/**
 * Chapter 14 Exercise 9:
 *
 *  (Create four fans)
 *  Write a program that places four fans in a GridPane with
 *  two rows and two columns, as shown in Figure 14.45b.
 *
 */

public class Chapter_14_E09_CreateFourTaiChis extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setHgap(5);
		pane.setVgap(5);
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				pane.add(new TaiChiPane(), j, i);
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_14_9");
		primaryStage.show();
		
	}

}
