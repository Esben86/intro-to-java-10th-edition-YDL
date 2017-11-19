package ch15;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Chapter 15 Exercise 1:
 *
 *  (Pick four tiles)
 *  Write a program that lets the user click the Refresh button
 *  to display four tiles from the tiengow set, as shown in Figure 15.24a.
 *  (See the hint in Programming Exercise 14.3 on how to obtain four random tiles.)
 *
 */

public class Chapter_15_E01_PickFourTiles extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}
	
	@Override
	public void start(Stage primaryStage) {
		
		VBox vBox = new VBox();
		vBox.setAlignment(Pos.CENTER);
		vBox.setPadding(new Insets(5, 5, 5, 5));
		
		HBox hBox = new HBox(5);
		hBox.setAlignment(Pos.CENTER);
		hBox.setPadding(new Insets(5, 5, 5 , 5));
		
		Button refresh = new Button("Refresh");
		//refresh.setAlignment(Pos.BOTTOM_CENTER);
		
		refresh.setOnAction((ActionEvent e) -> {
			addImages(hBox);
		});
		
		vBox.getChildren().addAll(hBox, refresh);
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(vBox, 630, 380);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Exercise_15_01");
		primaryStage.show();
		
	}
	
	public static void addImages(HBox hBox) {
		hBox.getChildren().clear();
		
		// Create an arraylist to store number values
		ArrayList<Integer> tileNumbers = new ArrayList<>();
		for (int i = 1; i <= 36; i++)
			tileNumbers.add(i);
		java.util.Collections.shuffle(tileNumbers);
		
		// Add images to the pane
		for (int i = 0; i <= 3; i++) {
			hBox.getChildren().add(new ImageView(new Image("file:image\\tiengow\\" + tileNumbers.get(i) + ".png")));
		}
	}

}
