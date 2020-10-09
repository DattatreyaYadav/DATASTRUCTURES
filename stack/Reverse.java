package stack;
class Stack1
{
	  int max=10;
	  int top=-1;
	  int array[]=new int[max];
	  int array1[]=new int[max];
	   
	  void push(int data)
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
      int [] reverseStack()
      {
    	   for(int i=0;i<array.length;i++)
    	   {
    		   array1[i]=pop();
    	   }
    	   return array1;
      }
      int pop()
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

public class Reverse {
	public static void main(String[] args) {
		Stack1 data=new Stack1();
		data.push(10);
		data.push(20);
		data.push(30);
		data.push(40); 
		data.push(50);
		data.push(60);
        System.out.println("reverse stack : ");
        int result[]=data.reverseStack();
        for(int i=0;i<result.length;i++)
        {
        	System.out.print(result[i]+" ");
        }
        System.out.println();
	}
}
