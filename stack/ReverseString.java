package stack;
import java.util.Scanner;

class Stackdata
{
	int max;
	int top=-1;
	char array[];
	public Stackdata(int max)
	{
		this.max=max;
		array=new char[max];
	}
	void push(char data)
	{
		if(top>max-1)
		{
			System.out.println("stack overflow");
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
			 System.out.println("stack is underflow");
			 return 0;
		  } 
	     else
	     {
		 char x=array[top];
		 top--;
		 return x;
	   }	 
  }
	
}
public class ReverseString {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string: ");
		String s=scan.nextLine();
		Stackdata data=new Stackdata(s.length());
		for(int i=0;i<s.length();i++)
		{
			data.push(s.charAt(i));
		}
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			temp=temp+data.pop();
		}
		System.out.println("reverse order for the input String ");
		System.out.println(temp);
		scan.close();
	}
}



/*
enter string: 
dattatreya yadav
reverse order for the input String 
vaday ayertattad
*/
