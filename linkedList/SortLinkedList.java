package linkedList;

import java.util.Scanner;

class Node13{
	int data;
	  Node13 next;
	  public Node13(int data)
	  {
		  this.data=data;
		  this.next=null;
	  }
}
class sorting{
	
	Node13 head=null;
    public void insert(int data)
    {
    	Node13 node=new Node13(data);
    	if(head==null)
    	{
          node.next=head;
          head=node;
    	}
    	else
    	{
    		Node13 temp=head;
    		while(temp.next!=null)
    		{
    			temp=temp.next;
    		}
    		temp.next=node;
    	}
    }
    
    public void sort()
    {
    	if(head==null) {
    		System.out.println("linked list is empty ");
    		return;
    	}
    	else{
    		Node13 current=head,index=null;
    		int temp;
    		while(current!=null)
    		{
    			index=current.next;
    			while(index!=null)
    			{
    				if(current.data>index.data)
    				{
    					temp=current.data;
    					current.data=index.data;
    					index.data=temp;
    				}
    				index=index.next;
    			}
    			current=current.next;
    		}
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
    		Node13 temp=head;
    		while(temp!=null)
    		{
    			System.out.print(temp.data+" ");
    			temp=temp.next;
    		}
    		System.out.println();
    	}
    }

}
public class SortLinkedList {

	public static void main(String[] args) {
		sorting value=new sorting();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of linkedlist");
		int size=scan.nextInt();
		System.out.println("enter values in to the linkedlist");
		for(int i=0;i<size;i++)
		{
			value.insert(scan.nextInt());
		}
		System.out.println("linked list before sorting ");
		value.print();
		value.sort();
		System.out.println("linked list after sorting ");
		value.print();
		scan.close();
	}

}
