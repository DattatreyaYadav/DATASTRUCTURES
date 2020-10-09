
// write a java code to remove duplicates from an unsorted linked list

package linkedList;

import java.util.Scanner;

class Node12
{
  int data;
  Node12 next;
  public Node12(int data)
  {
	  this.data=data;
	  this.next=null;
  }
}
class Duplicate{
	Node12 head=null;
    public void insert(int data)
    {
    	Node12 node=new Node12(data);
    	if(head==null)
    	{
          node.next=head;
          head=node;
    	}
    	else
    	{
    		Node12 temp=head;
    		while(temp.next!=null)
    		{
    			temp=temp.next;
    		}
    		temp.next=node;
    	}
    }
    public void delete()
    {
       Node12 ptr1=null,ptr2=null;
       ptr1=head;
       while(ptr1!=null && ptr1.next!=null)
       {
    	   ptr2=ptr1;
    	   while(ptr2.next!=null)
    	   {
    		   if(ptr1.data==ptr2.next.data)
    		   { 
    			   ptr2.next=ptr2.next.next;
    			   System.gc();
    		   }
    		   else
    		   {
    			   ptr2=ptr2.next;
    		   }
    	   }
    	   ptr1=ptr1.next;
       }
    }
    
    void print()
    {
    	if(head==null)
    	{
    		System.out.println("linked list is empty ");
    		return;
    	}
    	else {
    		Node12 temp=head;
    		while(temp!=null)
    		{
    			System.out.print(temp.data+" ");
    			temp=temp.next;
    		}
    		System.out.println();
    	}
    }
}
public class DeleteDuplicate {

	public static void main(String[] args) {
		Duplicate value=new Duplicate();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of linkedlist");
		int size=scan.nextInt();
		System.out.println("enter values in to the linkedlist");
		for(int i=0;i<size;i++)
		{
			value.insert(scan.nextInt());
		}
		value.print();
		value.delete();
		value.print();
		scan.close();
	}

}
