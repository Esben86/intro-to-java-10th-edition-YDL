package ch14;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

/**
 * Chapter 14 Exercise 13:
 * 
 * (Display a pie chart)
 *      
 * Write a program that uses a pie chart to display the percentages of the 
 * overall market share represented by Apple, HTC, Samsung, and Others.     
 * 
 */

public class Chapter_14_E13_DisplayPieChart extends Application {
	
	private static final int CENTER_X = 200, CENTER_Y = 200, X_RADIUS = 100, Y_RADIUS = 100;
	private static Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
	private static double[] percent = {0.26, 0.26, 0.28, 0.20};
	private static String[] labels = {"Apple", "HTC", "Samsung", "Others"};
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		drawPieChart(pane);
		addTextLabels(pane);
		
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_14_13");
		primaryStage.show();
		
	}
	
	public static Color getColor() {
		return new Color(Math.random(), Math.random(), Math.random(), 1);
	}
	
	public static void drawPieChart(Pane pane) {
		
		double angle = 90;
		
		for (int i = 0; i < percent.length; i++) {
			
			double arcLength = percent[i] * 360;
			
			Arc arc = new Arc(CENTER_X, CENTER_Y, X_RADIUS, Y_RADIUS, angle, arcLength);
			arc.setStroke(Color.BLACK);
			arc.setFill(colors[i]);
			arc.setType(ArcType.ROUND);
			angle += arcLength;
			
			pane.getChildren().add(arc);
			
		}
	}
	
	public static void addTextLabels(Pane pane) {
		
		double textAngle = 90;
		
		for (int i = 0; i < labels.length; i++) {
			
			double arcLength = percent[i] * 360;
			
			double x = CENTER_X + X_RADIUS * Math.cos(Math.toRadians(textAngle * -1));
			double y = CENTER_Y + Y_RADIUS * Math.sin(Math.toRadians(textAngle * -1));
			
			Text text = new Text(x, y, labels[i] + " -- " + Math.round( percent[i] * 100 ) + "%");
		
			textAngle += arcLength;
			
			pane.getChildren().add(text);
			
		}
		
	}
	

}
