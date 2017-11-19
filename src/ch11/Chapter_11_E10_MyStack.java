package ch11;

public class Chapter_11_E10_MyStack {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("String 1");
		stack.push("String 2");
		stack.push("String 3");
		stack.push("String 4");
		stack.push("String 5");
		
		for (int i = stack.size(); i > 0; i--) {
			System.out.println(stack.pop());
		}

	}

}
