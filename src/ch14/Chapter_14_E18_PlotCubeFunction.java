package ch14;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;

/**
 * Chapter 14 Exercise 18:
 *
 *      (Plot the cube function)
 *      Write a program that draws a diagram for the function
 *      f(x) = x³ (see Figure 14.48b).
 *
 */

public class Chapter_14_E18_PlotCubeFunction extends Application {
	
	private static double WIDTH = 400;
	private static double HEIGHT = 250;
	private static double CENTER = WIDTH / 2;
	
	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		addPolyline(pane);
		addXAxis(pane);
		addYAxis(pane);
		
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_14_18");
		primaryStage.show();
		
	}
	
	public void addPolyline(Pane pane) {
		
		Polyline polyline = new Polyline();
		polyline.setStroke(Color.BLACK);
		ObservableList<Double> list = polyline.getPoints();
		double scaleFactor = 0.00125;
		for (int x = -100; x <= 100; x++) {
			list.add(x + CENTER);
			list.add(CENTER - scaleFactor * Math.pow(x, 3));
		}
			
		pane.getChildren().add(polyline);
		
	}
	
	public void addXAxis(Pane pane) {
		
		double axisMargin = WIDTH * 0.95;
		
		Line xAxis = new Line(WIDTH - axisMargin, CENTER, axisMargin, CENTER);
		xAxis.endXProperty().bind(pane.widthProperty().subtract(20));
		
		Line upperArrow = new Line(0, CENTER, 0, CENTER - 5);
		upperArrow.startXProperty().bind(pane.widthProperty().subtract(20));
		upperArrow.endXProperty().bind(pane.widthProperty().subtract(40));
		
		Line lowerArrow = new Line(0, CENTER, 0, CENTER + 5);
		lowerArrow.startXProperty().bind(pane.widthProperty().subtract(20));
		lowerArrow.endXProperty().bind(pane.widthProperty().subtract(40));
		
		Text xLabel = new Text(WIDTH, CENTER - 15, "X");
		xLabel.xProperty().bind(pane.widthProperty().subtract(20));
	
		pane.getChildren().addAll(xAxis, upperArrow, lowerArrow, xLabel);
		
	}
	
	public void addYAxis(Pane pane) {
		
		double axisMargin = HEIGHT * 0.95;
		
		Line yAxis = new Line(CENTER, HEIGHT - axisMargin, CENTER, HEIGHT);
		Line leftArrow = new Line(CENTER, HEIGHT - axisMargin, CENTER - 5, HEIGHT - axisMargin + 20);
		Line rightArrow = new Line(CENTER, HEIGHT - axisMargin, CENTER + 5, HEIGHT - axisMargin + 20);
		Text yLabel = new Text(CENTER + 10, 15, "Y");
		
		yAxis.endYProperty().bind(pane.heightProperty());
		
		pane.getChildren().addAll(yAxis, leftArrow, rightArrow, yLabel);
		
	}
	

}
