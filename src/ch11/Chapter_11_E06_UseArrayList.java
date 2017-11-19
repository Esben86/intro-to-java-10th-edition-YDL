package ch11;
import java.util.ArrayList;

public class Chapter_11_E06_UseArrayList {

	public static void main(String[] args) {
		
		ArrayList<Object> oList = new ArrayList<>();
		
		oList.add(new Loan());
		oList.add(new Circle2D());
		oList.add(new MyDate());
		oList.add(new String("String"));
		
		for (Object x: oList)
			System.out.println(x + "\n");

	}

}
