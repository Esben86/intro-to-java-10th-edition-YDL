package ch15;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * Chapter 15 Exercise 5:
 *
 *      (Create a velocity calculator)
 *      Write a program that calculates velocity based on
 *      inputs of initial velocity, time and acceleration.
 *
 */

public class Chapter_15_E05_CalculateFinalVelocity extends Application {
	
	private TextField tfInitialVelocity = new TextField();
	private TextField tfAcceleration = new TextField();
	private TextField tfTime = new TextField();
	private TextField tfFinalVelocity = new TextField();
	private Button vCalculate = new Button("Calculate");
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		// Create a pane
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		pane.setHgap(5);
		pane.setVgap(5);
		
		// Add nodes to pane
		pane.add(new Label("Initial velocity"), 0, 0);
		pane.add(tfInitialVelocity, 1, 0);
		pane.add(new Label("Acceleration"), 0, 1);
		pane.add(tfAcceleration, 1, 1);
		pane.add(new Label("Time"), 0, 2);
		pane.add(tfTime, 1, 2);
		pane.add(new Label("Final velocity"), 0, 3);
		pane.add(tfFinalVelocity, 1, 3);
		pane.add(vCalculate, 1, 4);
		tfFinalVelocity.setEditable(false);
		
		// Create handler
		vCalculate.setOnAction(e -> {
			calculateVelocity();
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_05");
		primaryStage.show();
		
	}
	
	private void calculateVelocity() {
		
		double initialVelocity = Double.parseDouble(tfInitialVelocity.getText());
		double acceleration = Double.parseDouble(tfAcceleration.getText());
		double time = Double.parseDouble(tfTime.getText());
		
		double finalVelocity = initialVelocity + (acceleration * time);
		
		tfFinalVelocity.setText("" + finalVelocity);
		
	}

}
