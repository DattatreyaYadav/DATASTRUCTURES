package Queue;
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

class Queue1
{
 Node rear,front;
 int size=0;
 public void insert(int data)
 {
	if(rear==null) 
	{
		rear=front=new Node(data);
		size=size+1;
        return;
	}
	else
	{
	  rear.next=new Node(data);
	  rear=rear.next;
	  size=size+1;
	  
	}
 }
 public int remove()
 {
	if(isEmpty())
	{
		System.out.println("queue is empty . nothing to remove");
		return Integer.MIN_VALUE;
	}
	else
	{
		size=size-1;
		int data=front.data;
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
		return data;
	}
 }
 
 public boolean isEmpty()
 {
	 return rear==null;
 }
 public int getSize()
 {
	 return size;
 }
 public int getFront()
 {
	if(isEmpty())
	{
		System.out.println("Queue is Empty. Nothing at Front");
	      return Integer.MIN_VALUE;
	}
	return front.data;
 }
 public int getRear()
 {
	if(isEmpty())
	{
		System.out.println("Queue is Empty. Nothing at rear");
	      return Integer.MIN_VALUE;
	}
	return rear.data;
 }
 
 public void show()
 {
	 if(rear==null)
	 {
		 System.out.println("queue is empty");
		 return;
	 }
	 Node temp=front;
	 while(temp.next!=null)
	 {
		 System.out.print(temp.data+" ");
		 temp=temp.next;
	 }
	 System.out.print(temp.data);
 }
}
public class ImplemantationLinkedlist 
{
	public static void main(String[] args)
	{
		Queue1 data= new Queue1();
		data.insert(1);
		data.insert(2);
		data.insert(3);
		data.insert(4);
		data.insert(5);
		data.insert(6);
		data.insert(7);
		
		System.out.println(data.getSize());
		System.out.println(data.getFront());
		System.out.println(data.getRear());
		
		System.out.println("Removed Element: " + data.remove());
		
		System.out.println("elements in the queue :");
		data.show();
		
	}

}
