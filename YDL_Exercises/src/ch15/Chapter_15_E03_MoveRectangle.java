package ch15;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Chapter 15 Exercise 3:
 *
 *     (Move the rectangle)
 *      Write a program that moves the rectangle in a pane.
 *      You should define a pane class for displaying the rectangle and provide
 *      the methods for moving the ball left, right, up, and down, as shown
 *      in Figure 15.24c. Check the bound- ary to prevent the rectangle
 *      from moving out of sight completely.
 *
 */

public class Chapter_15_E03_MoveRectangle extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		// Create a pane
		BorderPane pane = new BorderPane();
		RectanglePane rPane = new RectanglePane();
		HBox hBox = new HBox(5);
		hBox.setPadding(new Insets(5, 5, 5, 5));
		hBox.setAlignment(Pos.CENTER);
				
		// Create buttons
		Button left = new Button("Left");
		Button right = new Button("Right");
		Button up = new Button("Up");
		Button down = new Button("Down");
		
		// Create handlers
		left.setOnAction(e -> {
			rPane.moveLeft();
		});
		
		right.setOnAction(e -> {
			rPane.moveRight();
		});
		
		up.setOnAction(e -> {
			rPane.moveUp();
		});
		
		down.setOnAction(e -> {
			rPane.moveDown();
		});
		
		// Add nodes to panes
		hBox.getChildren().addAll(left, right, up, down);
		pane.setCenter(rPane);
		pane.setBottom(hBox);
		BorderPane.setAlignment(rPane, Pos.CENTER);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_03");
		primaryStage.show();
		
	}

}
