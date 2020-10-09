package stack;

import java.util.Scanner;

class Stack3
{
  int max=10;
  int top=-1;
  char array[]=new char[max];

   void push(char data)
    {
	 if(top>max-1)
	 {
		 System.out.println("stack is over flow");
		  return;
	 }
	 else
	 {
		 top++;
		 array[top]=data;
	 }
     }
   int peek()
   {
	 if(top<=-1)
	 {
		 System.out.println("stack is underflow");
		 return 0;
	 }
	 else
	 {
		 int x=array[top];
		 return x;
	 }
   }
   char pop()
   {
	 if(top<=-1)
	 {
		 System.out.println("stack is underflow");
		 return '\u0000';
	 } 
	 else
	 {
		
		 char x=array[top];
		 top--;
		 return x;
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
   int size()
   {
	 int x=top;
	 x++;
	 return x;
    }
    void display()
    {
	 for(int i =0;i<size();i++)
	 {
		 System.out.print(array[i]+" ");
	 }
	 System.out.println();
    }
   }
 class implementation
 {
	 Stack3 data=new Stack3();
	 public boolean check(String s)
	 {
		 for(int i=0;i<s.length();i++)
		 {
			 char c=s.charAt(i);
			 switch(c) 
			 {
			 case '(':
			 case '{':
			 case '[':
				 data.push(c);
				 break;
			 case ')':
			 case '}':
			 case ']':
				 if(!data.isEmpty())
				 {
					 char ch=data.pop();
					 if(ch=='(' && c!=')' ||
					    ch=='{' && c!='}' ||
					    ch=='[' && c!=']')
					 {
						 System.out.println(" not valid bracket :"+ c);
						 return false;
					 }
				 }
				 else
				 {
					 System.out.println("not valid brackets");
					 return false;
				 }
			   }
			 if(!data.isEmpty())
			 {
				 System.out.println("invalid");
				 return false;
			 }
		 }
		 return true;
	 }
 }
 class DelimiterMatching
 {
	public static void main(String[] args) 
	{
		implementation data=new implementation();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=scan.nextLine();
		
		boolean result= data.check(s);
		if(result)
		{
          System.out.println("valid");
		}
		else
		{
			System.out.println("not valid");
		}
		scan.close();
	}

}
