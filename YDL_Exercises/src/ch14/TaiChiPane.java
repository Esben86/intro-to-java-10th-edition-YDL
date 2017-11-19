package ch14;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class TaiChiPane extends StackPane {
	
	private Pane outerCircle = new Pane();
	private Pane midCircles = new Pane();
	private Pane dots = new Pane();
	
	private Arc mainWhite = new Arc(100, 100, 100, 100, 90, 180);
	private Arc mainBlack = new Arc(100, 100, 100, 100, 270, 180);
	private Arc midWhite = new Arc(100, 50, 50, 50, 270, 180);
	private Arc midBlack = new Arc(100, 150, 50, 50, 90, 180);
	private Circle whiteDot = new Circle(100, 155, 15);
	private Circle blackDot = new Circle(100, 45, 15);
	
	
	public TaiChiPane() {
		
		mainWhite.setStroke(Color.BLACK);
		mainWhite.setFill(Color.WHITE);
		mainBlack.setStroke(Color.BLACK);
		mainBlack.setFill(Color.BLACK);
		outerCircle.getChildren().addAll(mainWhite, mainBlack);
		
		midWhite.setStroke(Color.BLACK);
		midWhite.setFill(Color.WHITE);
		mainBlack.setStroke(Color.BLACK);
		mainBlack.setFill(Color.BLACK);
		midCircles.getChildren().addAll(midWhite, midBlack);
		
		whiteDot.setFill(Color.WHITE);
		blackDot.setFill(Color.BLACK);
		dots.getChildren().addAll(whiteDot, blackDot);
		
		getChildren().addAll(outerCircle, midCircles, dots);
		
		
	}

}
