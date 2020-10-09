package stack;

import java.util.Stack;

public class DeleteEven {
	static void delete(Stack<Integer> data)
	{
		Stack<Integer> temp =new Stack<>();
		while(!data.isEmpty())
		{
			int val=data.pop();
			if(val%2==1)
			{
				temp.push(val);
			}
		}
		while(!temp.isEmpty())
		{
			data.push(temp.pop());
		}
		
		printstack(data);
	}
	
	private static void printstack(Stack<Integer> data)
	{
       while(!data.isEmpty())
       {
    	   System.out.print(data.pop()+" ");
       }
       System.out.println();
	}

	public static void main(String[] args) {
		Stack <Integer> data=new Stack<> ();
		data.push(16);
		data.push(15);
		data.push(14);
		data.push(13);
		data.push(11);
		data.push(10);
		delete(data);
	}

}
