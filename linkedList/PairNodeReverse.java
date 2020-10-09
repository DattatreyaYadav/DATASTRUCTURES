package linkedList;

class Node17{
	int data;
	Node17 next;
	public Node17(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class PairNodeReverse {
	Node17 head;
	public void insert(int data)
	{
		Node17 node=new Node17(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
		    Node17 temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=node;
		}
	}
	public void print()
	{
		Node17 node=head;
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
	public Node17 pairReverse(Node17 head)
	{
		Node17 newhead=null;
		if(head.next==null||head==null)
		{
			return head;
		}
//		there should not be anything between if and else block of code.
//		Node17 newhead=null;
		else{
			Node17 current=head;
			Node17 temp=null;
			
			while(current!=null && current.next!=null)
			{
				temp=current.next;
				current.next=temp.next;
				temp.next=current;
				if(newhead==null)
				{
					newhead=temp;
				}
				current=current.next;
				if(current.next!=null)
				{
					temp.next.next = current.next;
				}
				else {
					temp.next.next=current;
				}
				
			}
		}
		return newhead;
	}
	public Node17 reversepair(Node17 head)
	{
		Node17 temp=head;
		while(temp!=null && temp.next!=null)
		{
			int k =temp.data;
			temp.data=temp.next.data;
			temp.next.data=k;
			temp=temp.next.next;
		}
		return temp;
	}
	public static void main(String[] args) {
     PairNodeReverse list=new PairNodeReverse();
        list.insert(11);
		list.insert(12);
	    list.insert(13);
		list.insert(14);
		list.insert(15);
	    list.insert(14);
	    list.insert(15);   
	    list.print();
	    Node17 node=list.pairReverse();
	    while(node!=null)
	    {
	    	System.out.print(node.data+" ");
	    	node=node.next;
	    }
	    System.out.println();
	    
	    Node17 node1=list.reversepair();
	    while(node1!=null)
	    {
	    	System.out.print(node1.data+" ");
	    	node1=node1.next;
	    }
	    System.out.println();
	}
	private Node17 reversepair() {
		Node17 node=reversepair(head);
		return node;
	}
	private Node17 pairReverse() {
		Node17 node=pairReverse(head);
		return node;
	}
}
