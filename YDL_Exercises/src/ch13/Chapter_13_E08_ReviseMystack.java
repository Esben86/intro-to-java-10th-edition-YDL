package ch13;

/**
 * Chapter 13 Exercise 8:
 *      (Revise the MyStack class)
 *      Rewrite the MyStack class in Listing 11.10
 *      to perform a deep copy of the list field.
 *
 */

public class Chapter_13_E08_ReviseMystack {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		MyStack stack1 = new MyStack();
		stack1.push(new Integer(1));
		stack1.push(new Integer(2));
		stack1.push(new Integer(3));
		stack1.push(new Integer(4));
		
		System.out.println("Stack1 before popping:");
		System.out.println(stack1);
		MyStack stack2 = (MyStack)stack1.clone();
		
		stack1.pop();
		
		MyStack stack3 = (MyStack)stack2.clone();
		
		stack1.pop();
		stack1.pop();
		stack3.pop();
		
		System.out.println("Stack1:");
		System.out.println(stack1);
		System.out.println("Stack2:");
		System.out.println(stack2);
		System.out.println("Stack3:");
		System.out.println(stack3);
		
		System.out.println("stack1 == stack2 is " + (stack1 == stack2));
		System.out.println(stack1.equals(stack2));

	}

}
