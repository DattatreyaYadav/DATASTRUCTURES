package stack;

import java.util.Scanner;
class stackinfix
{
	int top=-1;
	int max;
	char array[];
	public stackinfix(int max)
	{
		this.max=max;
		array=new char[max];
	}
	
	void push(char data)
	{
	  if(top>max-1)
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

	char pop()
	{
		  if(top<=-1)
		  {
			  System.out.println("stack is overflow");
			  return '\u0000';
		  }
		  else
		  {
			  char data=array[top];
			  top--;
			  return data;
		  }	
	}
	char peek()
	{
		if(top<=-1)
		  {
			  System.out.println("stack is overflow");
			  return '\u0000';
		  }
		  else
		  {
			  char data=array[top];
			  return data;
		  }	
	}
	boolean isEmpty()
	{
		if(top>=0)
		{
		   return false;	
		}
		else
		{
		   return true;
		}
	}
}
class conversion
{
	public String infixPostfix(String s)
	{
		stackinfix stack=new stackinfix(s.length());
		String output="";
		char temp;
		for(int i=0;i<s.length();i++)
		{
			temp=s.charAt(i);
			if((temp>=97 && temp<=122)||(temp>=48 &&temp<=57))
			{
				output=output+temp;
			}
			else if(temp=='(') 
			{
				stack.push(temp);
			}
			else if(temp==')')
			{
				while(!stack.isEmpty()&&stack.peek()!='(')
				{
					output=output+stack.pop();
				}
				if(stack.isEmpty())
				{
			        return "expression is invalid";
			    }
				else
				{
					stack.pop();
				}
			}
			else
			{
				while(!stack.isEmpty()&&(precedence(temp)<=precedence(stack.peek())))
				{
					output=output+stack.pop();
				}
				stack.push(temp);
			}
		}
		while(!stack.isEmpty())
		{
			output=output+stack.pop();
		}
		return output;
	}
	public int precedence(char c)
	{
		switch(c)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
}
public class InfixtoPostfix {

	public static void main(String[] args) 
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter the String :");
	 String s=scan.nextLine().toLowerCase().trim();
	 conversion data=new conversion();
	 String output=data.infixPostfix(s);
     System.out.println(output);
     scan.close();
	}
}

/*
  enter the String :
(a+b*(c^d-e)^(f+g*h)-i)
abcd^e-fgh*+^*+i-
*/
