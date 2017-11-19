package ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 14:
 *
 *      (Display a rectanguloid)
 *      Write a program that displays a rectanguloid,
 *      as shown in Figure 14.47a. 
 *
 */

public class Chapter_14_E14_DisplayRectanguloid extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		getParalellograms(pane);
		getConnectingLines(pane);
		
		Scene scene = new Scene(pane, 230, 280);
		primaryStage.setTitle("Exercise_14_14");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void getParalellograms(Pane pane) {
		
		Polygon p1 = new Polygon(50, 50, 200, 50, 175, 100, 25, 100);
		p1.setStroke(Color.BLACK);
		p1.setFill(Color.WHITE);
		
		Polygon p2 = new Polygon(50, 200, 200, 200, 175, 250, 25, 250);
		p2.setStroke(Color.BLACK);
		p2.setFill(Color.WHITE);
		
		pane.getChildren().add(p1);
		pane.getChildren().add(p2);
		
	}
	
	private void getConnectingLines(Pane pane) {
		
		Line l1 = new Line(50, 50, 50, 200);
		Line l2 = new Line(200, 50, 200, 200);
		Line l3 = new Line(175, 100, 175, 250);
		Line l4 = new Line(25, 100, 25, 250);
		
		pane.getChildren().add(l1);
		pane.getChildren().add(l2);
		pane.getChildren().add(l3);
		pane.getChildren().add(l4);
		
	}

}
