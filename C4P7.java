// Find the Minimum stack with better Space Complexity that C4P6
// Time Complexity O(1)
// Space Complexity O(n) based on where minimum is encountered
import java.util.EmptyStackException;
import java.util.Stack;

public class C4P7 {
	
	Stack <Integer> mainStack = new Stack<Integer>();
	Stack <Integer> minStack = new Stack<Integer>();
	
	public void Push(int data) {
		mainStack.push(data);
		
		if(minStack.isEmpty())
			minStack.push(data);
		else {
			if(mainStack.peek() < data)
				minStack.push(data);
		}
	}
	
	public int Pop() {
		
		if(!mainStack.isEmpty()) {
			if(mainStack.peek() == minStack.peek()) {
				minStack.pop();
				return mainStack.pop();
			}
			return mainStack.pop();
		}
		
		throw new EmptyStackException();
	}
	
}
