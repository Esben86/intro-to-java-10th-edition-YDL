package ch15;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 * Chapter 15 Exercise 4:
 *
 *      (Create a simple bmi calculator)
 *      Write a program to perform bmi calculation.
 *
 */

public class Chapter_15_E04_CalculateBMI extends Application {
	
	private TextField tfHeight = new TextField();
	private TextField tfWeight = new TextField();
	private TextField tfBMI = new TextField();
	private Button btCalculate = new Button("Calculate");
	
	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		// Create pane and hbox
		BorderPane pane = new BorderPane();
		HBox hBox = new HBox(5);
		hBox.setPadding(new Insets(5, 5, 5, 5));
		pane.setCenter(hBox);
		pane.setBottom(btCalculate);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		BorderPane.setAlignment(btCalculate, Pos.CENTER);
		
		// Add nodes
		hBox.getChildren().add(new Label("Height"));
		hBox.getChildren().add(tfHeight);
		hBox.getChildren().add(new Label("Weight"));
		hBox.getChildren().add(tfWeight);
		hBox.getChildren().add(new Label("BMI"));
		hBox.getChildren().add(tfBMI);
		tfBMI.setEditable(false);
		
		// Create handler
		btCalculate.setOnAction(e -> {
			calculateBMI();
		});		
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_4");
		primaryStage.show();
		
	}
	
	private void calculateBMI() {
				
		double height = Double.parseDouble(tfHeight.getText());
		double weight = Double.parseDouble(tfWeight.getText());
		
		double bmi = weight / Math.pow(height, 2);
		
		tfBMI.setText("" + bmi);
		
	}

}
