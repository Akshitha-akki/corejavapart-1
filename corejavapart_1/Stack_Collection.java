package corejavapart_1;

import java.util.Stack;
public class Stack_Collection 
{
	public static void main(String[] args) 
	{
		//String
		Stack<String> stack=new Stack<String>();
		//Empty
		System.out.println("Is stack is empty or not :"+stack.isEmpty());
		//Push
		stack.push("Apple");
		stack.push("Orange");
		stack.push("PineApple");
		stack.push("Mango");
		System.out.println("Stack : "+stack);
		//pop
		System.out.println(stack.pop());
		//Elements after the pop
		System.out.println("Stack after pop : "+stack);
		//peek
		System.out.println("Peek : "+stack.peek());
		//Search
		System.out.println("Searching of element in stack : "+stack.search("PineApple"));
		//isEmpty
		System.out.println("Is stack is empty or not :"+stack.isEmpty());
	}

}
