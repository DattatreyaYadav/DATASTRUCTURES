package stack;

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
class Stack2
{
	Node Front;
	int size=0;
	public void push(int data)
	{
		if(Front==null)
		{
			Front=new Node(data);
			size++;
			return;
		}
		
		Node temp=new Node(data);
		size++;
		temp.next=Front;
		Front=temp;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
		System.out.println("Stack is Empty");
		return Integer.MIN_VALUE;
		}
		
		int temp=Front.data;
		Front=Front.next;
		size--;
		return temp;
	}
	public int peek()
	{
		if(isEmpty())
		{
		System.out.println("Stack is Empty");
		return Integer.MIN_VALUE;
		}
		return Front.data;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	public int getsize()
	{
		return size;
	}
	
	public void show()
	{
		if(isEmpty())
		{
		System.out.println("Stack is Empty");
		return;
		}
	
		Node temp=Front;
		
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data);
		System.out.println();	
	}	
}
public class ImplemantationLinkedList 
{
	public static void main(String[] args) 
	{
		Stack2 data=new Stack2();
		data.push(10);
		data.push(20);
		data.push(30);
		data.push(40);	
		data.push(50);
		data.push(60);
		data.push(70);
		System.out.println(data.getsize());
		System.out.println(data.peek());
		
		System.out.println(data.pop());
		System.out.println(data.getsize());
		
		data.show();
	}
}
