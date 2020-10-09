package linkedList;

import java.util.HashSet;
import java.util.Scanner;

class Node6
{ 
   int data;
   Node6 next;
   public Node6(int data)
   {
	   this.data=data;
	   this.next=null;
   }
}
public class RemoveDuplicate {

	static Node6 head=null;
	public static void insert(int data)
	{
	    Node6 node=new Node6(data);
	    if(head==null)
	    {
	      node.next=head;
	      head=node;
	    }
	    else
	    {
	    	Node6 temp=head;
	    	while(temp.next!=null)
	    	{
	    		temp=temp.next;
	    	}
	    	temp.next=node;
	    }    
	}
	public static void print(Node6 head)
	{
		Node6 node=head;
		if(node==null)
		{
			System.out.println("linked list is empty");
			return;
		}
		else
		{
		   while(node.next!=null)
		   {
			   System.out.print(node.data+" ");
			   node=node.next;
		   }
		   System.out.print(node.data);
		}
		System.out.println();
	}
	public static Node6 removeDuplicate(Node6 node)
	{
		Node6 current=head;
		Node6 previous=null;
		HashSet<Integer> hs=new HashSet<>();
		if(head==null)
		{
			return null;
		}
		while(current!=null)
		{
			if(!hs.contains(current.data))
			{
				hs.add(current.data);
				previous=current;
			}
			else
			{
				previous.next=current.next;
			}
			current=current.next;
		}
		return head;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of elements");
		int elements=scan.nextInt();
		System.out.println("enter elements in to the linkedlist");
		while(elements>0)
		{
		 int a =scan.nextInt();
		 insert(a);
		 elements--;
		}
		System.out.println("elements in the linkedlist");
		print(head);
		System.out.println("linked list with unique elemtents");
		print(removeDuplicate(head));
		scan.close();
	}
}
