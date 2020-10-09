package linkedList;



class Node16{
	int data;
	Node16 next;
	public Node16(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class RotateLinkedlist {
	static Node16 head;
	public void insert(int data)
	{
		Node16 node=new Node16(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
		    Node16 temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=node;
		}
	}
	public void print()
	{
		Node16 node=head;
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
	public void rotate(int number,Node16 head)
	{
		// here we are taking two pointers and pointing to head 
				Node16 start=head;
				Node16 temp=head;
				while(temp.next!=null)
				{
					//we transfered one pointer to end of list
					temp=temp.next;
				}
				
				while(number-->0)
				{
					// for each rotation we shifted head and last pointer 
					// and removed connection between pointer and head;
					head=start.next;
					temp.next=start;
					start.next=null;
					temp=start;
					start=head;
				}
				while(head!=null)
				{
					System.out.print(head.data+" ");
					head=head.next;
				}
	}
	public static void main(String[] args) {
		RotateLinkedlist list= new RotateLinkedlist();
		list.insert(11);
		list.insert(12);
	    list.insert(13);
		list.insert(14);
		list.insert(15);
	    list.insert(14);
	    list.insert(15);
	    list.print();
	    list.rotate(4,head);
//	    list.print();

	}
}
