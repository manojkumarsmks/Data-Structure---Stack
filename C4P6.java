// How to Design a stack such that getMinimium should be O(1)
// Time Complexity is O(1)
// Space Complexity is O(n)
import java.util.EmptyStackException;
import java.util.Stack;

public class C4P6 {
	Stack<Integer> mainStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	
	public void Push(int data) {
		mainStack.push(data);
		
		if(minStack.isEmpty())
			minStack.push(data);
		else {
			if(data <= minStack.peek()) 
				minStack.push(data);
			else 
				minStack.pop();
		}
	}
	
	public int Pop() {
		if(!mainStack.isEmpty()) {
			minStack.pop();
			return mainStack.pop();
		}
		throw new EmptyStackException();
	}
	
}
