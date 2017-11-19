package ch10;
import java.awt.geom.Line2D;

public class Triangle2D {
	
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	public Triangle2D() {
		this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
	}
	
	public Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.p1 = new MyPoint(x1, y1);
		this.p2 = new MyPoint(x2, y2);
		this.p3 = new MyPoint(x3, y3);	
	}
	
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;	
	}
	
	public MyPoint getP1() {
		return p1;
	}
	
	public MyPoint getP2() {
		return p2;
	}
	
	public MyPoint getP3() {
		return p3;
	}
	
	public void setP1(double x, double y) {
		this.p1 = new MyPoint(x, y);
	}
	
	public void setP2(double x, double y) {
		this.p2 = new MyPoint(x, y);
	}
	
	public void setP3(double x, double y) {
		this.p3 = new MyPoint(x, y);
	}
	
	public double getPerimeter() {
		
		double s1 = p1.distance(p2);
		double s2 = p2.distance(p3);
		double s3 = p3.distance(p1);
		
		return (s1 + s2 + s3);
	}
	
	public double getArea() {
		
		double s1 = p1.distance(p2);
		double s2 = p2.distance(p3);
		double s3 = p3.distance(p1);
		double s = (s1 + s2 + s3) / 2.0;
		
		return Math.sqrt(s * (s - s1 ) * (s - s2) * (s - s3));
		
	}
	
	public static double calcArea(MyPoint p1, MyPoint p2, MyPoint p3) {
		
		double s1 = p1.distance(p2);
		double s2 = p2.distance(p3);
		double s3 = p3.distance(p1);
		double s = (s1 + s2 + s3) / 2.0;
		
		return Math.sqrt(s * (s - s1 ) * (s - s2) * (s - s3));
		
	}
	
	public boolean contains(MyPoint p) {
		
		double subArea1 = calcArea(this.getP1(), this.getP2(), p);
		double subArea2 = calcArea(this.getP2(), this.getP3(), p);
		double subArea3 = calcArea(this.getP1(), this.getP3(), p);

		double totalArea = (subArea1 + subArea2 + subArea3);
		double triangleArea = this.getArea();
		
		double precisionMargin = 0.00000005;
		
		return Math.abs(triangleArea - totalArea) <= precisionMargin;
		
	}
	
	public boolean overlaps(Triangle2D t) {
		
		MyPoint[] triangle1 = getTrianglePoints();
		MyPoint[] triangle2 = t.getTrianglePoints();
		
		for (int i = 0; i < 3; i++) {
			int maxI = (i + 1) % 3;
			for (int j = 0; j < 3; j++) {
				int maxJ = (j + 1) % 3;
				
				Line2D lineFromTriangle1 = new Line2D.Double(triangle1[i].getX(), triangle1[i].getY(),
															 triangle1[maxI].getX(), triangle1[maxI].getY());
				Line2D lineFromTriangle2 = new Line2D.Double(triangle2[i].getX(), triangle2[i].getY(),
						 									 triangle2[maxJ].getX(), triangle2[maxJ].getY());
				
				if (lineFromTriangle1.intersectsLine(lineFromTriangle2)) 
					return true;		 
			}	
		}
		return false;	
	}
	
	public boolean contains(Triangle2D t) {
		
		if (!this.contains(t.p1))
			return false;
		
		MyPoint[] triangle1 = getTrianglePoints();
		MyPoint[] triangle2 = t.getTrianglePoints();
		
		for (int i = 0; i < 3; i++) {
			int maxI = (i + 1) % 3;
			for (int j = 0; j < 3; j++) {
				int maxJ = (j + 1) % 3;
				
				Line2D lineFromTriangle1 = new Line2D.Double(triangle1[i].getX(), triangle1[i].getY(),
															 triangle1[maxI].getX(), triangle1[maxI].getY());
				Line2D lineFromTriangle2 = new Line2D.Double(triangle2[i].getX(), triangle2[i].getY(),
						 									 triangle2[maxJ].getX(), triangle2[maxJ].getY());
				
				if (lineFromTriangle1.intersectsLine(lineFromTriangle2)) 
					return false;		 
			}	
		}
		return true;
	}
	
	private MyPoint[] getTrianglePoints() {
		
		MyPoint[] trianglePoints = new MyPoint[3];
		trianglePoints[0] = p1;
		trianglePoints[1] = p2;
		trianglePoints[2] = p3;
		
		return trianglePoints;
		
	}

}
