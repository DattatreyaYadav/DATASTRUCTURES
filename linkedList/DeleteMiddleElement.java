package linkedList;
class Node20{
	int data;
	Node20 next;
	public Node20(int data) {
		this.data=data;
		this.next=null;
	}
}

public class DeleteMiddleElement {
	static Node20 head;
	public void insert(int data)
	{
		Node20 node=new Node20(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
		    Node20 temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=node;
		}
	}
	public void print()
	{
		Node20 node=head;
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
	
	// method to delete middle element;
	public Node20 deleteMiddle(Node20 head)
	{
		if(head==null)
		{
			return null;
		}
		else {
			Node20 slow=head,fast=head,prev=head;
			while(fast!=null && fast.next!=null)
			{
				prev=slow;
				slow=slow.next;
				fast=fast.next.next;
			}
			
			prev.next=slow.next;
			slow.next=null;
		   return prev;
		}
	}
	public static void main(String[] args) {
		    DeleteMiddleElement list= new  DeleteMiddleElement();
		    list.insert(11);
			list.insert(12);
		    list.insert(13);
			list.insert(14);
			list.insert(15);
		    list.insert(14);
		    list.insert(15);   
		    list.print();
		    list.deleteMiddle(head); 
		    list.print();
	}
}
