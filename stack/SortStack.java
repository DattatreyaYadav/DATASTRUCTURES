package stack;

import java.util.Stack;

public class SortStack {
	
	public static void main(String[] args) {
		Stack<Integer> data=new Stack<> ();
		data.push(4);
		data.push(1);
		data.push(2);
		data.push(9);
		data.push(3);
		data.push(8);
		Stack<Integer> temp=sortint(data);
		System.out.println("sorted array");
		while(!temp.isEmpty())
		{
			System.out.print(temp.pop()+" ");
		}
		System.out.println();
	}

	private static Stack<Integer> sortint(Stack<Integer> data) 
	{
		Stack<Integer> tempstack=new Stack<> ();
	    
		while(!data.isEmpty())
		{
			int temp=data.pop();
			while(!tempstack.isEmpty() && tempstack.peek()>temp)
			{
				data.push(tempstack.pop());
			}
			tempstack.push(temp);
		}
		return tempstack;
	}
}
