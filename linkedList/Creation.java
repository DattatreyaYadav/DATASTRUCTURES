package linkedList;

class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Linked{
    Node head;
	public void insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
		    Node temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=node;
		}
	}
	public void print()
	{
		Node node=head;
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
	}
}
public class Creation{
	public static void main(String[] args) 
	{
	  Linked list=new Linked();
	  list.insert(12);
	  list.insert(13);
	  list.insert(14);
	  list.insert(15);
	  
	  list.insert(14);
	  list.insert(15);
	  list.print();
	}

}
