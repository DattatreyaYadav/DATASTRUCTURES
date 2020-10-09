package linkedList;
class Node14{
	int data;
	Node14 next;
	public Node14(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class DeleteAlternate {
	Node14 head;
	public void insert(int data)
	{
		Node14 node=new Node14(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
		    Node14 temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=node;
		}
	}
	public void print()
	{
		Node14 node=head;
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
	// method to display alternate nodes in a linked list
	public void del_alternate()
	{
		if(head==null)
		{
			return;
		}
		else {
			Node14 temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				if(temp.next==null)
				{
					return;
				}
				else
				{
					// delete the alternate node;
					temp.next=temp.next.next;
					temp=temp.next;
				}
			}
		}
	}
	public static void main(String[] args) {
		DeleteAlternate list= new DeleteAlternate();
		list.insert(11);
		list.insert(12);
	    list.insert(13);
		list.insert(14);
		list.insert(15);
	    list.insert(14);
	    list.insert(15);
	    list.print();
	    list.del_alternate();
	}
}
