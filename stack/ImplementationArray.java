package stack;

public class ImplementationArray {

	static int max=10;
	   static int top=-1;
	   static int array[]=new int[max];
	   
	 static void push(int data)
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
	static int peek()
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
 static int pop()
  {
 	 if(top<=-1)
 	 {
			 System.out.println("stack is underflow");
			 return 0;
		 } 
 	 else
 	 {
 		
 		 int x=array[top];
 		 top--;
 		 return x;
 	 }	 
  }
 static boolean isEmpty()
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
 static int size()
  {
 	 int x=top;
 	 x++;
 	 return x;
  }
 static void display()
  {
 	 for(int i =0;i<size();i++)
 	 {
 		 System.out.print(array[i]+" ");
 	 }
 	 System.out.println();
  }
	 
	public static void main(String[] args) 
	{
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		System.out.println("elements after pushing into the stack");
		display();
		System.out.println("stack size:");
		System.out.println(size());
		System.out.println(pop());
		System.out.println("elements after poping out of  the stack");
		display();
		System.out.println("stack size:");
		System.out.println(size());	
	}
}

/*
 elements after pushing into the stack
10 20 30 40 50 
stack size:
5
50
elements after poping out of  the stack
10 20 30 40 
stack size:
4
 */
