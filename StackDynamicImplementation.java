import java.util.EmptyStackException;

public class StackDynamicImplementation {
	int size =  -1;
	int[] stackArray;
	
	public StackDynamicImplementation(int sizeOfArray) {
		this.stackArray = new int[sizeOfArray];
	}
	
	private void Push(int data) {
		if(size == stackArray.length-1) {
			IncreaseArraySizeAndCopy(data);
		}else {
			size++;
			stackArray[size] = data;
		}
	}
	
	private int Pop() {
		if(IsEmpty())
			throw new EmptyStackException();
		else {
			int temp = stackArray[size];
			size--;
			return temp;
		}
	}
	
	// returns top of the stack without removing it 
	private int Top() {
		if(size>0)
			return stackArray[size-1];
		else 
			throw new EmptyStackException();
	}
	
	private boolean IsFullStack() {
		if(size == stackArray.length) 
			return true;
		else
			return false;
	}
	
	private boolean IsEmpty() {
		return(size < 0);
	}
	   
	
	private void IncreaseArraySizeAndCopy(int data) {
		System.out.println(stackArray.length);
		int[] newStackArray = new int[2 * stackArray.length];
		for(int i=0; i<stackArray.length; i++) {
			newStackArray[i] = stackArray[i];
		}
		newStackArray[stackArray.length] = data;
		stackArray = newStackArray;
	}

	public static void main(String[] args) {
		StackDynamicImplementation stackDynamicImplementation = new StackDynamicImplementation(5);
		stackDynamicImplementation.Push(10);
		stackDynamicImplementation.Push(20);
		stackDynamicImplementation.Push(30);
		stackDynamicImplementation.Push(40);
		stackDynamicImplementation.Push(50);
		System.out.println(stackDynamicImplementation.Pop());
		System.out.println(stackDynamicImplementation.Pop());
		System.out.println(stackDynamicImplementation.Pop());
		System.out.println(stackDynamicImplementation.Pop());
		System.out.println(stackDynamicImplementation.Pop());
		
		stackDynamicImplementation.Push(10);
		
		System.out.println("Stack  "+stackDynamicImplementation.stackArray.length);
		

		
	}

}
