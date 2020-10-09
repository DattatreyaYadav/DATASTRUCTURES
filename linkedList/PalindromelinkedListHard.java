package linkedList;
class Node18{
	int data;
	Node18 next;
	public Node18(int data)
	{
		this.data=data;
		this.next=null;
	}
}

public class PalindromelinkedListHard {
	static Node18 head;
	public void insert(int data)
	{
		Node18 node=new Node18(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
		    Node18 temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=node;
		}
	}
	public void print()
	{
		Node18 node=head;
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
	public Node18 getMiddle(Node18 node)
	{
		Node18 fast=node;
		Node18 slow=node;
		while(fast!=null)
		{
			fast=fast.next;
			while(fast!=null && fast.next!=null)
			{
				fast=fast.next;
				slow=slow.next;
			}
		}
		return slow;
	}
	public boolean isPalinndrome(Node18 head)
	{
		Node18 middle=getMiddle(head);
		Node18 newhead=middle.next;
		middle.next=null;
		
		Node18 reversehead= reverse(newhead);
		while(head!=null && reversehead!=null)
		{
			if(head.data==reversehead.data)
			{
				head=head.next;
				reversehead=reversehead.next;
				continue; 
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public Node18 reverse(Node18 node){
		Node18 previous=null;
		Node18 nextnode=null;
		Node18 current=node;
		while(current!=null)
		{
			nextnode=current.next;
			current.next=previous;
			previous=current;
			current=nextnode;
		}
		return previous;
	}
	public static void main(String[] args) {
		PalindromelinkedListHard list=new PalindromelinkedListHard();
		list.insert(11);
		list.insert(12);
	    list.insert(13);
		list.insert(14);
		list.insert(13);
	    list.insert(12);
	    list.insert(11);
        list.print();
        boolean result=list.isPalinndrome(head);
        if(result)
        {
        	System.out.println("palindrome");
        }
        else {
        	System.out.println("not a palindrome");
        }
	}
}
