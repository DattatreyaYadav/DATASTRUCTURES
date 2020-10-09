package linkedList;
class Node5
{
	int data;
	Node5 next;
	public Node5(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class middle
{
	Node5 head=null;
	void insert(int data)
	{
		Node5 node=new Node5(data);
		if(head==null)
		{
			node.next=head;
			head=node;
		}
		else
		{
			Node5 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public void print()
	{
		Node5 node=head;
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
	public int midle()
	{
		if(head==null)
		{
			System.out.println("linked list is empty ");
			return 0;
		}
		else
		{
			Node5 fast=head;
			Node5 slow=head;
			while(fast.next!=null)
			{
				if(fast.next.next!=null)
				{
					slow=slow.next;
					fast=fast.next.next;
				}
				else
				{
					slow=slow.next;
					fast=fast.next;
				}
			}
			return slow.data;
		}
	}
	public int midelement()
	{
		if(head==null)
		{
			System.out.println("linked list is empty ");
			return 0;
		}
		int count=0;
		Node5 temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			count++;
		}
		count=count/2;
		if(count==1)
		{
			return head.data;
		}
		for(int i=0;i<count;i++)
		{
			head=head.next;
		}
		return head.data;
	}
}

public class MiddleElement {
	public static void main(String[] args) {
		middle data=new middle();
		data.insert(1);
		data.insert(2);
		data.insert(3);
		data.insert(4);
		data.insert(5);
		data.insert(6);
		data.insert(7);
		System.out.println("middle element :"+data.midle());
        data.print();
        System.out.println("middle element :"+data.midelement());
        
        
        
	}
}
