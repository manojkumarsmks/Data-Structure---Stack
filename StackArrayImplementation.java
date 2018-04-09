import java.util.EmptyStackException;

public class StackArrayImplementation {
	int size = 0;
	int[] stackArray;
	
	//Create an array of desired length
	public StackArrayImplementation(int size) {
		this.stackArray = new int[size]; 
	}
	
	public int Size() {
		return size;
	}
	
	//push the element into the the array, size variables acts as a pointer
	public void Push(int data) {
		System.out.println("Size "+size);
		if(size == stackArray.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		else {
			stackArray[size] = data;
			size++;
		}
	} 
	
	//Similar to Push, size variables guides us
	public int  Pop() {
		if(size == 0) {
			throw new EmptyStackException();
		}
		else {
			int temp = stackArray[size-1];
			size--; 
			return temp;
		}
	}
	
	
	// returns top of the stack without removing it 
	public int Top() {
		if(size>0)
			return stackArray[size-1];
		else 
			throw new EmptyStackException();
	}
	
	public boolean IsEmptyStack() {
		if(size == 0)
			return true;
		else 
			return false;
	}
	
	public boolean IsFullStack() {
		if(size == stackArray.length) 
			return true;
		else
			return false;
	}
	
	

	public static void main(String[] args) {
		StackArrayImplementation stack = new StackArrayImplementation(5);
		System.out.println(stack.IsEmptyStack());
		stack.Push(10);
		stack.Push(20);
		stack.Push(30);
		stack.Push(40);
		stack.Push(50);
		System.out.println(stack.Pop());
		stack.Push(70);
		
		System.out.println(stack.Top());
		
		System.out.println(stack.IsEmptyStack());
		//System.out.println(stack.Pop());

	}

}
