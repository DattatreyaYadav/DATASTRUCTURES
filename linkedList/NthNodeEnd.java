package linkedList;

class Node15{
	int data;
	Node15 next;
	public Node15(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class NthNodeEnd {
	Node15 head;
	public void insert(int data)
	{
		Node15 node=new Node15(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
		    Node15 temp=head;
		    while(temp.next!=null)
		    {
		    	temp=temp.next;
		    }
		    temp.next=node;
		}
	}
	public void Nthnode(int number)
	{
        int length=0;
		if(head==null)
		{
			return;
		}
		else {
			Node15 temp=head;
			while(temp!=null)
			{
				temp=temp.next;
				length=length+1;
			}
			if(number>length)
			{
				return;
			}
			else {
				Node15 curr=head;
				for(int i =0;i<length-number;i++)
				{
					curr=curr.next;
				}
				System.out.println(curr.data);
			}
		}
	}
	public void print()
	{
		Node15 node=head;
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
	public static void main(String[] args) {
		NthNodeEnd list=new NthNodeEnd();
		list.insert(12);
	    list.insert(13);
		list.insert(14);
		list.insert(15);
	    list.insert(14);
	    list.insert(15);
	    list.print();
	    list.Nthnode(3);
	    int result=list.sumOfLastN_nodes(3);
	    System.out.println(result);
	}
	private int sumOfLastN_nodes(int number) {
		int length=0;
		int sum=0;
		if(head==null)
		{
			return 0;
		}
		else {
			Node15 temp=head;
			while(temp!=null)
			{
				temp=temp.next;
				length=length+1;
			}
			if(number>length)
			{
				return 0;
			}
			else {
				Node15 curr=head;
				for(int i =0;i<length-number;i++)
				{
					curr=curr.next;
				}
				while(number-->0)
				{
					sum=sum+curr.data;
					curr=curr.next;
				}
			}
		}
		return sum;
	}
}
