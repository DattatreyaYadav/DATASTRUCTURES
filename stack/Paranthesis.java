package stack;

import java.util.Scanner;
class Stack
{
	int max;
	int top=-1;
	char array[];
	public Stack(int max)
	{
		this.max=max;
		array=new char[max];
	}
	void push(char data)
	{

		   if(top>=max)
		   {
			   System.out.println("overflow");
			   return ;
		   }
		   else
		   {
			   top++;
			   array[top]=data;
		   }
		
	}
	char peek()
	{
	   if(top<=-1)
	   {
		   System.out.println("error");
		   return 0;
	   }
	   else
	   {
		   char data= array[top];
		   return data;
	   }
	}
	void pop()
	{
		if(top<=-1)
		   {
			   System.out.println("underflow");
			   return;
		   }
		else
		{
		    @SuppressWarnings("unused")
			char data=array[top];
			top--;
		}
	}
	boolean isEmpty()
	{
		if(top<=-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Paranthesis 
{
  public static void main(String args[])
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter a string in the form of expression : ");
	  String s=scan.nextLine().toLowerCase().trim();
	  int length=s.length();
	  boolean isBalanced=true;
	  Stack data=new Stack(length);
	  
	  for(int i =0;i<length;i++)
	  {
		  char ch=s.charAt(i);
		  if(ch>=97&&ch<=122 || ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'||ch==' ')
		  {
			  continue;
		  }
		  else
		  {
			  if(ch=='('||ch=='['||ch=='{')
			  {
				  data.push(ch);
				  continue;
			  }
		  }
		  if(data.isEmpty())
		  {
			isBalanced=false;
			break;
		  }
		  else if(ch==')')
		  {
			  if(data.peek()=='(')
			  {
				  data.pop();
			  }
			  else
			  {
				isBalanced=false;
			    break;  
			  }
		  }
		  else if(ch=='}')
		  {
			  if(data.peek()=='{')
			  {
				  data.pop();
			  }
			  else
			  {
				isBalanced=false;
			    break;  
			  }
		  }
		  else if(ch==']')
		  {
			  if(data.peek()=='[')
			  {
				  data.pop();
			  }
			  else
			  {
				isBalanced=false;
			    break;  
			  }
		  }
	  }
	  if(!data.isEmpty())
	  {
		  isBalanced=false;
	  }
	  if(isBalanced)
	  {
		  System.out.println("enter string has balanced parenthesis");
	  }
	  else
	  {
		  System.out.println("enter string has no balanced parenthesis");
	  }
	  
	  scan.close();
  }
}
