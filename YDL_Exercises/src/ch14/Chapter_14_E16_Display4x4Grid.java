package ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 16:
 *
 *      (Display a 4 * 4 grid)
 *      Write a program that displays a 4 * 4 grid, as shown in Figure 14.47c.
 *      Use red color for vertical lines and blue for horizontals.
 *      The lines are automatically resized when the window is resized.
 *
 */

public class Chapter_14_E16_Display4x4Grid extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		addHorizontalLines(pane);
		addVerticalLines(pane);
		
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise_14_16");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void addHorizontalLines(Pane pane) {
		
		for (double i = 0.25; i < 1; i += 0.25) {
			Line line = new Line();
			line.setStroke(Color.BLUE);
			line.startXProperty().bind(pane.layoutXProperty());
			line.endXProperty().bind(pane.widthProperty());
			line.startYProperty().bind(pane.heightProperty().multiply(i));
			line.endYProperty().bind(pane.heightProperty().multiply(i));
			pane.getChildren().add(line);	
		}		
	}
	
	private void addVerticalLines(Pane pane) {
		
		for (double i = 0.25; i < 1; i += 0.25) {
			Line line = new Line();
			line.setStroke(Color.RED);
			line.startXProperty().bind(pane.widthProperty().multiply(i));
			line.endXProperty().bind(pane.widthProperty().multiply(i));
			line.startYProperty().bind(pane.layoutYProperty());
			line.endYProperty().bind(pane.heightProperty());		
			pane.getChildren().add(line);	
		}		
	}

}
