package doubleLinkedList;
class Node2{
	int data;
	Node2 previous;
	Node2 next;
	public Node2(int data)
	{
		this.data=data;
	    this.previous=null;
	    this.next=null;
	}
}

class rotate{
	Node2 head;
	public void insert(int data)
	{
		Node2 node=new Node2(data);
		if(head==null)
		{
			node.next=head;
			head=node;
		}
		else{
			Node2 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			node.previous=temp;
			temp.next=node;
		}
	}
	
	public void rotateNode(int number)
	{
		// here we are taking two pointers and pointing to head 
		Node2 start=head;
		Node2 temp=head;
		while(temp.next!=null)
		{
			//we transfered one pointer to end of list
			temp=temp.next;
		}
		int c=0;
		while(c<number)
		{
			// for each rotation we shifted head and last pointer 
			// and removed connection between pointer and head;
			head=start.next;
			head.previous=null;
			start.next=null;
			temp.next=start;
			start.previous=temp;
			temp=start;
			start=head;
			c++;
		}
		start.previous=null;
	}
	public void print()
	{
		if(head==null)
		{
			System.out.println("doubled linked list is empty");
			return;
		}
		else {
			Node2 temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
}
public class RotateNTimes {

	public static void main(String[] args) {
		rotate val = new rotate();
		val.insert(1);
		val.insert(2);
		val.insert(1);
		val.insert(4);
		val.insert(2);
		val.insert(3);
		val.insert(3);
		val.rotateNode(3);
		val.print();

	}
}
