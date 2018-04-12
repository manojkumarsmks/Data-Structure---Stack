// Use the built-in Stack class to implement a new class MaxStack with a method getMax()
// that returns the largest element in the stack. getMax() should not remove the item. 

import java.util.EmptyStackException;
import java.util.Stack;

public class GetMax {
	
	Stack<Integer> mainStack = new Stack<Integer>();
	Stack<Integer> maxStack = new Stack<Integer>();
	
	// Push to the main stack
	// Push to maxstack only if the top of the maxstack is less than the data 
	public void Push(int data) {
		mainStack.push(data);
		
		if(maxStack.isEmpty())
			maxStack.push(data);
		else if(maxStack.peek() < data)
			maxStack.push(data);
	}
	
	//Pop only if the maxStack popped data is equal to the top of the maxStack 
	public void Pop() {
		
		if(!mainStack.isEmpty()) {
			if(mainStack.peek() == maxStack.peek()) {
				mainStack.pop();
				maxStack.pop();
			}
			else {
				mainStack.pop();
			}
		}
		else {
			throw new EmptyStackException();
		}

	}
	public static void main(String[] args) {
		
		GetMax getMax = new GetMax();
		getMax.Push(10);
		getMax.Push(12);
		getMax.Push(8);
		getMax.Push(14);
		getMax.Push(11);
		getMax.Push(11);
		getMax.Push(9);
		
		getMax.Pop();
		System.out.println(getMax.mainStack.peek() + "  MAIN");
		System.out.println(getMax.maxStack.peek() + "  MAX");
		
		getMax.Pop();
		System.out.println(getMax.mainStack.peek() + "  MAIN");
		System.out.println(getMax.maxStack.peek() + "  MAX");

		getMax.Pop();
		System.out.println(getMax.mainStack.peek() + "  MAIN");
		System.out.println(getMax.maxStack.peek() + "  MAX");
		
		getMax.Pop();
		System.out.println(getMax.mainStack.peek() + "  MAIN");
		System.out.println(getMax.maxStack.peek() + "  MAX");
		
		getMax.Pop();
		System.out.println(getMax.mainStack.peek() + "  MAIN");
		System.out.println(getMax.maxStack.peek() + "  MAX");
		
		
		getMax.Pop();
		System.out.println(getMax.mainStack.peek() + "  MAIN");
		System.out.println(getMax.maxStack.peek() + "  MAX");
		
		
		getMax.Pop();
		System.out.println(getMax.mainStack.peek() + "  MAIN");
		System.out.println(getMax.maxStack.peek() + "  MAX");
		
		  
	}

}
