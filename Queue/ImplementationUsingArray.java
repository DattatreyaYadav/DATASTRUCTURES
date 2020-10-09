package Queue;

class Queue{
	int size=0;
	int rear=0;
	int front=0;
	int queue[]=new int[5];
	public void enqueue(int data)
	{
		if(!isFull())
		{
		queue[rear]=data;
		rear=(rear+1)%5;
		size=size+1;
		}
		else
		{
			System.out.println("queue is full");
		}
	}
	public int dequeue()
	{
		int data=queue[front];
		if(!isEmpty())
		{
			front=(front+1)%5;
			size=size-1;
		}
		else
		{
			System.out.println("queue is empty");
			return 0;
		}
		return data;
	}
	public void show()
	{
		System.out.println("elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[(front+i)%5]+" ");
		}
		System.out.println();
		for(int n:queue)
		{
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public int getFront()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return Integer.MIN_VALUE;
		}
		return queue[front];
	}
	public int getRear()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return Integer.MIN_VALUE;
		}
		return queue[rear-1];
	}
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public boolean isFull()
	{
		return size==5;
	}
}

public class ImplementationUsingArray {

	public static void main(String[] args) {
		Queue data=new Queue();
		
		data.enqueue(12);
		data.enqueue(13);
		data.enqueue(14);
		data.enqueue(15);
		
		data.dequeue();
		data.dequeue();
		
		data.enqueue(1);
		data.enqueue(2);
		data.enqueue(3);
		data.dequeue();
		data.enqueue(10);
		System.out.println(data.getSize());
 
		data.show();
		System.out.println("front element is : "+data.getFront());
		
		System.out.println("rear element is : "+data.getRear());
		
	}

}
