package doubleLinkedList;
class Node{
	int data;
	Node next;
	Node previous;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
		this.previous=null;
	}
}

class DoubleLinkedList
{
	Node head,tail;
	public void insert(int data)
	{
		Node node=new Node(data);
		
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			node.previous=tail;
			tail=node;
			tail.next=null;
		}
	}
	
	public void insertStart(int data)
	{
        Node node=new Node(data);
		
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			head.previous=node;
			node.next=head;
			head=node;
		}
	}
	
    public void insertAt(int data,int index)
	{
        Node node=new Node(data);
        
        if(index<=-1)
        {
        	System.out.println("invalid index position");
        	return;
        }
		if(index==0||head==null)
		{
			head=node;
			tail=node;
		}

		 Node temp=head;
          	
		 for(int i=0;i<index-1;i++)
		 {
		
			 temp=temp.next;
		 }
		 temp.next.previous=node;
		 node.next=temp.next;
		 temp.next=node;
		 node.previous=temp;
		 temp=node;
	}
    
	public void insertEnd(int data)
	{
        Node node=new Node(data);
		
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			tail.next=node;
			node.previous=tail;
			tail=node;
			tail.next=null;
		}
		
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("Double linkedlist is empty ");
			return;
		}
		else
		{
			System.out.println("elements of double linked list");
			Node temp=head;
		    while(temp!=null)
		    {
		    	System.out.print(temp.data+" ");
		    	temp=temp.next;
		    }
		    System.out.println();
		}
	}
}
public class Implementation
{
	public static void main(String[] args) 
	{
		DoubleLinkedList data=new DoubleLinkedList();
		data.insert(10);
		data.insert(20);
		data.insert(30);
		data.insert(40);
		data.insert(50);
		
		data.display();
		
		data.insertStart(22);
		data.insertStart(11);
		data.display();
		
		data.insertEnd(66);
		data.insertEnd(77);
		data.display();
		
		data.insertAt(3,37);
		data.display();
	}

}
