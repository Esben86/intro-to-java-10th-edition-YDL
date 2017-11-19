package ch10;

public class Queue {
	
	double[] elements;
	private final int DEFAULT_CAPACITY = 8;
	private int size = 0;
	
	public Queue() {
		this.elements = new double[DEFAULT_CAPACITY];
	}
	
	public void enqueue(double v) {
		
		if (elements.length == size) {
			double[] temp = new double[size * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}
	
	public double dequeue() {
		
		double retrievedElement = elements[0];
		
		int index = 0;
		size--;
		while (index <= size - 1) {
			elements[index] = elements[++index];
		}
		return retrievedElement;
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	

}
