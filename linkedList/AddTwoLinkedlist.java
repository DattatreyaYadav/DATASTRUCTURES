package linkedList;
class Node19{
	int data;
	Node19 next;
	public Node19(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class AddTwoLinkedlist {
	static Node19 head;

	public void insert(Node19 node)
	{
		if(head==null)
		{
			head=node;
		}
		else
		{
		    Node19 temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=node;
		}
	}
	public void print(Node19 node)
	{		
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
	private static Node19 reverseLinkedlist(Node19 node) {
		Node19 current=node;
		Node19 nextnode=null;
		Node19 previous=null;
		if(node==null || node.next==null)
		{
			return node;
		}
		else {
			while(current!=null)
			{
				nextnode=current.next;
				current.next=previous;
				previous=current;
				current=nextnode;
			}
		}
		return previous;
	}
	public Node19 addTwoNumbers(Node19 temp1,Node19 temp2)
	{
		int carry=0;
		int sum=0;
		int iterations=0;
		Node19 newhead=null;
		Node19 tempnode=null;
		while(temp1!=null || temp2!=null)
		{
			iterations=iterations+1;
			sum=carry;
			if(temp1!=null)
			{
				sum=sum+temp1.data;
				temp1=temp1.next;
			}
			if(temp2!=null)
			{
				sum=sum+temp2.data;
				temp2=temp2.next;
			}
			carry=sum/10;
			sum=sum%10;
			if(iterations==1) {
				tempnode=new Node19(sum);
				newhead=tempnode;
			}
			else {
				Node19 node=new Node19(sum);
				tempnode.next=node;
				tempnode=tempnode.next;
			}
		}
		if(carry!=0)
		{
			Node19 node=new Node19(carry);
			tempnode.next=node;
			tempnode=tempnode.next;
		}
		return newhead;
	}
	public static void main(String[] args) {
		AddTwoLinkedlist list=new AddTwoLinkedlist();
		Node19 head1=new Node19(5);
        list.insert(head1);
        list.insert(new Node19(6));
        list.insert(new Node19(7));
        list.insert(new Node19(1));
        list.insert(new Node19(2));
        System.out.print("number 1: ");
        list.print(head1);
        System.out.println();
        head=null;
        Node19 head2=new Node19(6);
        list.insert(head2);
        list.insert(new Node19(3));
        list.insert(new Node19(5));
        list.insert(new Node19(9));
        System.out.print("number 2: ");
        list.print(head2);
        System.out.println();
        head1=reverseLinkedlist(head1);
        head2=reverseLinkedlist(head2);
        Node19 result=list.addTwoNumbers(head1,head2);
        result=reverseLinkedlist(result);
        System.out.print("sum : ");
        list.print(result);
	}	
}
