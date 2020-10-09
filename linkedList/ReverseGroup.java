package linkedList;
class Node21{
	int data;
	Node21 next;
	public Node21(int data) {
		this.data=data;
		this.next=null;
	}
}
public class ReverseGroup {
	static Node21 head;
	public void insert(int data)
	{
		Node21 node=new Node21(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
		    Node21 temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=node;
		}
	}
	public void print()
	{
		Node21 node=head;
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
	// method to reverse in groups 
	public Node21 groupReverse(Node21 head,int number)
	{
		Node21 current=head;
		Node21 prev=null,ahead=null;
		int count=0;
		while(count++<number && current!=null)
		{
			ahead=current.next;
			current.next=prev;
			prev=current;
			current=ahead;
		}
		head.next= (current!=null)? groupReverse(ahead,number):null;
		return prev;
	}
	public static void main(String[] args) {
		ReverseGroup list=new ReverseGroup();
		list.insert(11);
		list.insert(12);
	    list.insert(13);
		list.insert(14);
		list.insert(15);
	    list.insert(14);
	    list.insert(15);   
	    list.print();
	    list.groupReverse(head,2);
	    list.print();
	}
}
