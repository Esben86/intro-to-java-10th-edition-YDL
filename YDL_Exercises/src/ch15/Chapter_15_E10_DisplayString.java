package ch15;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * Chapter 15 Exercise 10:
 * (Enter and display a string)
 * Write a program that receives a string from the keyboard and displays
 * it on a pane. The Enter key signals the end of a string.
 * Whenever a new string is entered, it is displayed on the pane.
 * Created by Luiz Arantes Sa on 9/15/14.
 */

public class Chapter_15_E10_DisplayString extends Application {
	
	private static TextField tfString = new TextField();
	
	public static void main(String[] args) {
		
		launch(args);

	}
	
	public void start(Stage primaryStage) {
		// Create a pane
		VBox vBox = new VBox();
		HBox hBox = new HBox();
		Pane pane = new Pane();
		
		vBox.getChildren().addAll(hBox, pane);
				
		// Create a button to display typed String
		Button btDisplay = new Button("Display String");
		
		// Create label and text
		Label laString = new Label("Enter string: ");
		hBox.getChildren().addAll(laString, tfString);
		
		// Create a handler	
		tfString.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				pane.getChildren().clear();
				Text text = new Text(35, 100, tfString.getText());
				text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 40));	
				pane.getChildren().add(text);
				tfString.clear();
			}
		});
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(vBox, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_10");
		primaryStage.show();
		tfString.requestFocus();
		
	}
	
}
