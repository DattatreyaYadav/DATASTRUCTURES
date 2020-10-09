package stack;

import java.util.Scanner;

class stack4
{
	int top=-1;
	int maximum=top;
	int size;
	int array[];
	public stack4(int size){
		this.size=size;
		array=new int[size];	
	}
	
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
			if(top==0)
			{
				array[top]=data;
				maximum=top;
			}
			else
			{
				if(data<array[maximum])
				{
					array[top]=array[maximum];
					array[maximum]=data;
					maximum=top;
				}
				else 
				{
					array[top]=data;
					maximum=top;
				}
			}
		}
	}
	
    public int max() 
    {
    	if(top==-1)
    	{
    		System.out.println("stack is underflow");
    		return 0;
    	}
    	else 
    	{
    		return array[top];
    	}
    }
}
public class MaximumElement 
{
	public static void main(String[] args) 
	{
	  Scanner scan =new Scanner(System.in);
	  System.out.println("enter the size of the stack ");
	  int size= scan.nextInt();
	  stack4 value=new stack4(size);
	  System.out.println("enter elements in to the stack");
	  for(int i =0;i<size;i++)
	  {
		  value.push(scan.nextInt());
	  }
	  System.out.println("the maximum element of stack is :"); 
	  System.out.println(value.max());
	  scan.close();
	}
}

/*
output ::

enter the size of the stack 
6
enter elements in to the stack
8
2
4
7
1
9
the maximum element of stack is :
9

*/