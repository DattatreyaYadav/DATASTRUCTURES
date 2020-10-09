package doubleLinkedList;
class Node3{
	int data;
	Node3 previous;
	Node3 next;
	public Node3(int data)
	{
		this.data=data;
	    this.previous=null;
	    this.next=null;
	}
}

public class Reverse {
	
	static Node3 head;
	
	public void insert(int data)
	{
		Node3 node=new Node3(data);
		if(head==null)
		{
			node.next=head;
			head=node;
		}
		else{
			Node3 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			node.previous=temp;
			temp.next=node;
		}
	}
	
	public Node3 reverse(Node3 head)
	{
		if(head==null||head==null)
		{
			return head;
		}
		else
		{
			Node3 curr=head;
			Node3 temp=null;
			while(curr!=null)
			{
				//here temp stores the address of previous pointer address
				temp=curr.previous;
				// curr.previous points to next node address
				curr.previous=curr.next;
				//nodes next points to previous node address
				curr.next=temp;
				// here curr.previous contains the address of next node;
				curr=curr.previous;
			}
			if(temp.next!=null)
			{
				temp=temp.previous;
			}
			return temp;
		}
	}
	public void print(Node3 head)
	{
		if(head==null)
		{
			System.out.println("doubled linked list is empty");
			return;
		}
		else {
			Node3 temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Reverse val=new Reverse();
		val.insert(1);
		val.insert(2);
		val.insert(1);
		val.insert(4);
		val.insert(2);
		val.insert(3);
		val.insert(7);
		val.print(head);
		
		Node3 node=val.reverse(head);
		val.print(node);
	}
}
