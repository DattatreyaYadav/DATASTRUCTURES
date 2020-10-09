package doubleLinkedList;

class Node1{
	int data;
	Node1 previous;
	Node1 next;
	public Node1(int data)
	{
		this.data=data;
	    this.previous=null;
	    this.next=null;
	}
}

class duplicateremove
{
	Node1 head;
	public void insert(int data)
	{
		Node1 node=new Node1(data);
		if(head==null)
		{
			node.next=head;
			head=node;
		}
		else{
			Node1 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			node.previous=temp;
			temp.next=node;
		}
	}
	public void remove()
	{
		Node1 current=null,index=null;
		if(head==null) {
			System.out.println("double linked list is empty");
			return;
		}
		else
		{
			current=head;
			while(current!=null)
			{
				index=current.next;
				while(index!=null)
				{
					if(current.data==index.data)
					{
//						temp=index;
						index.previous.next=index.next;
						if(index.next!=null)
						{
							index.next.previous=index.previous;
						}
//						temp=null;
					}
					index=index.next;
				 }
				current=current.next;
			}
				
		}
	}
	public void print()
	{
		if(head==null)
		{
			System.out.println("doubled linked list is empty");
			return;
		}
		else {
			Node1 temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
}
public class RemoveDuplicate {

	public static void main(String[] args) {
		duplicateremove val=new duplicateremove();
		val.insert(1);
		val.insert(2);
		val.insert(1);
		val.insert(4);
		val.insert(2);
		val.insert(3);
		val.insert(3);
		System.out.println("elements in double linked list are ");
		val.print();
		val.remove();
		System.out.println("elements in double linked list are ");
		val.print();

	}

}


/*

out put:

elements in double linked list are 
1 2 1 4 2 3 3 
elements in double linked list are 
1 2 4 3 

*/