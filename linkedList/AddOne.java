package linkedList;

import java.util.Scanner;

class Noode
{
	int data;
	Noode next;
	public Noode(int data)
	{
		this.data=data;
		this.next=null;
	}
}
public class AddOne
{
	static Noode head=null;
	public static void insert(int data)
	{
		Noode node=new Noode(data);
		if(head==null)
		{
			node.next=head;
			head=node;
		}
		else
		{
			Noode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of elements");
		int total=scan.nextInt();
		while(total-- >0)
		{
			int number=scan.nextInt();
			if(number==0)
			{
				System.out.println("1");
				continue;
			}
			while(number>0)
			{
				insert(number%10);
				number=number/10;
			}
			ToAdd add=new ToAdd();
			Noode result=add.addOne(head);
			print(result);
			System.out.println();	
		}
		scan.close();
	}
	public static void print(Noode result)
	{
		while(result!=null)
		{
			System.out.print(result.data);
			result=result.next;
		}
	}
}

class ToAdd
{
	public Noode addOne(Noode head)
	{
		Noode temp=head;
		int add=1;
		int carry=0;
		Noode prev=null,nextnode;
		while(temp!=null)
		{
			carry=(temp.data+add)/10;
			temp.data=(temp.data+add)%10;
			add=carry;
			nextnode=temp.next;
			temp.next=prev;
			prev=temp;
			temp=nextnode;
		}
		if(add!=0)
		{
			Noode node=new Noode(add);
			node.next=prev;
			prev=node;
		}
		return prev;
	}
}
