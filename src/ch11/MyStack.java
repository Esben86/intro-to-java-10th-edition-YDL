package ch11;

public class MyStack extends java.util.ArrayList<Object> {
	
	public MyStack() {	
	}
	
	public Object peek() {
		return get(size() - 1);
	}
	
	public Object pop() {
		Object o = get(size() - 1);
		remove(size() - 1);
		return o;
	}
	
	public void push(Object o) {
		add(o);
	}
	
	@Override
	public String toString() {
		return "stack: " + super.toString(); 
	}
	

}
