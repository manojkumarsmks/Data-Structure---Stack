// Given an array of character  formed with a's and b's. The String is marked with special character 'X' which represents the middle of the list
// Check if the string is a palindrome or not 
import java.util.Stack;

public class C4P8 {
	
	//Using stack Problem 10
	//Push till you reach X
	//Pop stack and compare with the  rest of the string
	public static void IsPalindrome(String S) {
		Stack <Character> stack = new Stack<Character>();
		char[] sArray = S.toCharArray();
		int index = 0;
		while(sArray[index] != 'X') {
			stack.push(sArray[index]);
			index++;
		}
		index++;
		while(index != sArray.length) {
			if(stack.pop() != sArray[index]) {
				System.out.println("Is Not a Palindrome");
				break;
			}
			index++;
		}
		
		if(stack.isEmpty())
			System.out.println("Is a Palindrome");
	}
	
	//Just using Index
	// start index is zero
	// end index is length of the string
	// compare and increment/decrement the index till the start index is >= end index 
	public static void IsPalindromIndex(String s) {
		int start_Index = 0, end_Index = s.length()-1;
		char[] sArray = s.toCharArray();
		while((start_Index < end_Index) && (sArray[start_Index] == sArray[end_Index])) {
			start_Index++;
			end_Index--;
		}
		
		if(start_Index < end_Index)
			System.out.println("Not a Palindrome");
		else 
			System.out.println("Is a Palindrome");
	}

	public static void main(String[] args) {
		String S = "abccba";
		//IsPalindrome(S);
		IsPalindromIndex(S);

	}

}
