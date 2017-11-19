package ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Chapter 14 Exercise 17:
 *
 *      (Game: hangman)
 *      Write a program that displays a drawing for the popular hangman game,
 *      as shown in Figure 14.48a.
 */

public class Chapter_14_E17_Hangman extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		
		// Create foot
		Arc foot = new Arc(75, 280, 50, 20, 0, 180);
		foot.setStroke(Color.BLACK);
		foot.setFill(Color.WHITE);
		pane.getChildren().add(foot);
		
		// Create vertical pole
		Line vPole = new Line(75, 50, 75, 260);
		pane.getChildren().add(vPole);
		
		// Create horisontal pole
		Line hPole = new Line(75, 50, 175, 50);
		pane.getChildren().add(hPole);
		
		// Create rope
		Line rope = new Line(175, 50, 175, 75);
		pane.getChildren().add(rope);
		
		// Create head
		Circle head = new Circle(175, 100, 25);
		head.setStroke(Color.BLACK);
		head.setFill(Color.WHITE);
		pane.getChildren().add(head);
		
		// Create body
		Line body = new Line(175, 125, 175, 175);
		pane.getChildren().add(body);
		
		// Create left arm
		Line lArm = new Line(115, 170, 158, 120);
		pane.getChildren().add(lArm);
		
		// Create left arm
		Line rArm = new Line(193, 119, 235, 170);
		pane.getChildren().add(rArm);
		
		// Create left leg
		Line lLeg = new Line(175, 175, 125, 225);
		pane.getChildren().add(lLeg);
		
		// Create right leg
		Line rLeg = new Line(175, 175, 225, 225);
		pane.getChildren().add(rLeg);
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Exercise_14_17");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
