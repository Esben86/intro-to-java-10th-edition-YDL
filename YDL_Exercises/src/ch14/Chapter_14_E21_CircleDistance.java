package ch14;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 21:
 *
 *      (Two circles and their distance)
 *      Write a program that draws two filled circles with radius 15 pixels,
 *      centered at random locations, with a line connecting the two circles.
 *      The distance between the two centers is displayed on the line,
 *      as shown in Figure 14.49b.
 *
 */

public class Chapter_14_E21_CircleDistance extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		// Create a pane
		Pane pane = new Pane();
		pane.setPadding(new Insets(50, 50, 50, 50));
		
		// Create circle 1
		Circle c1 = new Circle(getCoordinate(), getCoordinate(), 15);
		pane.getChildren().add(c1);
		
		// Create circle 2
		Circle c2 = new Circle(getCoordinate(), getCoordinate(), 15);
		pane.getChildren().add(c2);
		
		// Create a connecting line
		Line line = new Line(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
		pane.getChildren().add(line);
		
		// Create distance text
		double textXCoor = 3 + (Math.abs(c1.getCenterX() + c2.getCenterX())) / 2;
		double textYCoor = -3 + (Math.abs(c1.getCenterY() + c2.getCenterY())) / 2;
		double distance = getDistance(c1.getCenterX(), c1.getCenterY(), c2.getCenterX(), c2.getCenterY());
		Text text = new Text(textXCoor, textYCoor, new Double(distance).toString());
		pane.getChildren().add(text);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Exercise_14_21");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static double getCoordinate() {
		return (Math.random() * 360);
	}
	
	public static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}