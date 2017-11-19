package ch15;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanglePane extends Pane {
	
	private Rectangle r = new Rectangle(175, 175, 50, 50);
	
	public RectanglePane() {
		r.setFill(Color.WHITE);
		r.setStroke(Color.BLACK);
		getChildren().add(r);
	}
	
	public void moveLeft() {
		r.setX(r.getX() > 0 ? (r.getX() - 10) : r.getX());
	}
	
	public void moveRight() {
		r.setX(r.getX() < (this.getWidth() - r.getWidth()) ? (r.getX() + 10) : r.getX());
	}
	
	public void moveUp() {
		r.setY(r.getY() > 0 ? (r.getY() - 10) : r.getY());
	}
	
	public void moveDown() {
		r.setY(r.getY() < this.getHeight() - r.getHeight() ? (r.getY() + 10) : r.getY());
	}

}
