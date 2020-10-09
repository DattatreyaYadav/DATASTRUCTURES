package stacksort;

public class sorting {
  Stack data=new Stack();
  int size=10;
  int top=-1;
  int array[]=new int[size];
 
//  int[] data2()
//  {
//	  int array2[]=new int[7];
//	  for(int i=0;i<array2.length;i++)
//	  {
//		  array2[i]=data.pop();
//	  }	
//	  return array2;
//  }
  int[] sortingdata()
  {
	  while(!data.isEmpty())
	  {
		  int temp=data.pop();
		  while(!isEmpty() && array[top]>temp)  
		  { 
			  push(pop());
		  }
		  push(temp);
	  }
	  return array;
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
