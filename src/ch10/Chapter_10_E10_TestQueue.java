package ch10;

public class Chapter_10_E10_TestQueue {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		for (int i = 1; i <= 20; i++)
			q.enqueue(i);
		
		
		while (!q.empty())
			System.out.print(q.dequeue() + " ");
		

	}

}
