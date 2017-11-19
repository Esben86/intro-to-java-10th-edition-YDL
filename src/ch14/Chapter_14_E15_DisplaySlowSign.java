package ch14;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 15:
 *
 *  (Display a STOP sign)
 *  Write a program that displays a STOP sign, as shown
 *  in Figure 14.47b. The octagon is in red and the sign is in white.
 *  (Hint: Place an octagon and a text in a stack pane.)
 *
 */

public class Chapter_14_E15_DisplaySlowSign extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	public void start(Stage primaryStage) {
		
		StackPane pane = new StackPane();
		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.RED);
		polygon.setRotate(22.5);
		ObservableList<Double> list = polygon.getPoints();
		
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
			list.add(centerY + radius * Math.sin(2 * i * Math.PI / 8));
		}
		
		Text text = new Text(centerX, centerY, "SLOW");
		text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 40));
		text.setFill(Color.WHITE);
		pane.getChildren().add(text);
		
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		primaryStage.setTitle("Exercise_14_15");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}
