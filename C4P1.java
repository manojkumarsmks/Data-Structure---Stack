//Check the balancing of the symbols 
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class C4P1 {
	
	// Push the open brackets into the stacks
	// Pop the open brackets if the closed onces are the pairs of open brackets
	// By the end the stack is empty 
    static Boolean isBalanced(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	Set<Character> openBrackets = new HashSet<Character>();
    	openBrackets.add('(');
    	openBrackets.add('{');
    	openBrackets.add('[');
    	
    	Set<Character> closedBrackets = new HashSet<Character>();
    	closedBrackets.add(')');
    	closedBrackets.add('}');
    	closedBrackets.add(']');
    	
    	Hashtable<Character, Character> pairs = new Hashtable<Character, Character>();
    	pairs.put(')', '(');
    	pairs.put(']', '[');
    	pairs.put('}', '{');
    	
    	char[] stringToCharArray = s.toCharArray();
    	
    	for (int i = 0; i < stringToCharArray.length; i++) {
			if(openBrackets.contains(stringToCharArray[i])) {
				stack.push(stringToCharArray[i]);
			}
			else {
				if(stack.isEmpty())
					return false;
				else {
					char temp = stack.pop();
					if(!(pairs.get(stringToCharArray[i]) == temp)) {
						return false;
					}
				}
			}
		}
    	
    	return stack.isEmpty();	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            boolean result = isBalanced(s);
            if(result)
            	System.out.println("YES");
            else 
            	System.out.println("NO");
        }
        in.close();
    }

}
