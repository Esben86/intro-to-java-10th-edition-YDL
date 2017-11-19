package ch14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * Chapter 14 Exercise 12:
 *
 * (Display a bar chart)
 *
 * Write a program that uses a barh chart to display the percentages of the
 * overall market share represented by Apple, HTC, Samsung, and Others.
 *
 */

public class Chapter_14_E12_DisplayBarChart extends Application {
	
	static final int TOTAL_USERS = 200;
	
	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(15, 15, 5, 15));
		pane.setHgap(20);
		pane.setAlignment(Pos.BOTTOM_CENTER);
		
		String[] labels = {"Apple", "HTC", "Samsung", "Others"};
		int[] users = getUsers(TOTAL_USERS);
		
		for (int i = 0; i < users.length; i++) {
			
			VBox vBox = new VBox(5);
			vBox.setAlignment(Pos.BOTTOM_LEFT);
			double percent = (double) Math.round( ( (double)users[i] / TOTAL_USERS) * 100 );
			
			Text text = new Text(0, 0, labels[i] + " -- " + percent + "%");			
			vBox.getChildren().add(text);
			
			Rectangle bar = new Rectangle(100, percent * 3);
			bar.setStroke(Color.BLACK);
			bar.setFill(getColor());
			
			vBox.getChildren().add(bar);
			
			pane.add(vBox, i, 0);
			
		}
		
		Scene scene = new Scene(pane, 470, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_14_12");
		primaryStage.show();
			
	}
	
	public static int[] getUsers(int totalUsers) {
		
		int[] users = new int[4];
		
		for (int i = 0; i < totalUsers; i++) {
			int randomIndex = (int) (Math.random() * 4);
			users[randomIndex]++;	
		}
		return users;		
	}
	
	public Color getColor() {
		return new Color(Math.random(), Math.random(), Math.random(), 1);
	}

}
