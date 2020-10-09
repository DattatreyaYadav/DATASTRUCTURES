package stacksort;

public class Stack{
	int top=-1;
    int size=7;
    int array[]=new int[size];
	 void push(int data)
	{
		if(top==size-1)
		{
			System.out.println("stack is overflow");
			return;
		}
		else 
		{
			top++;
			array[top]=data;
		}
	}
	 int pop()
	{
		if(top==-1)
		{
		System.out.println("stack is underflow");
		return 0;
		}
		else
		{
		   int value=array[top];
		   top--;
		   return value;
		}
	}
    boolean isEmpty()
	{
		return top==-1;
	}
    int peek()
	{
	   return array[top];
	}
	
}

