package linkedList;

class Node1
{
  int data;
  Node1 next;
  public Node1(int data)
  {
	  this.data=data;
	  this.next=null;
  }
}
class Linking
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
		else
		{
			Node1 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public void insertStart(int data)
	{
		Node1 node=new Node1(data);
		node.next=head;
        head=node;
	}
	public void insertAt(int data,int index)
	{
		Node1 node=new Node1(data);
		if(index==0)
		{
			node.next=head;
			head=node;
		}
		else
		{
			Node1 temp=head;
			for(int i=0;i<index-1;i++)
			{
				temp=temp.next;
			}
			node.next=temp.next;
			temp.next=node;
		}
	}
	
  
   public void insertEnd(int data)
   {
	   Node1 node=new Node1(data);
	   if(head==null)
	   {
		   head=node;
	   }
	   else
	   {
		   Node1 temp=head;
		   while(temp.next!=null)
		   {
			   temp=temp.next;
		   }
		   temp.next=node;
	   }
   }
   public void deleteStart()
   {
	   if(head==null) 
	   {
		   System.out.println(" the list is empty ");
		   return;
	   }
	   head=head.next;
   }
   public void deleteEnd()
   {
	   if(head==null)
	   {
		   System.out.println(" the list is empty ");
		   return; 
	   }
	   if(head.next==null)
	   {
		   head=null;
	   }
	   else
	   {
		   Node1 temp=head;
		   while(temp.next.next!=null)
		   {
			   temp=temp.next;
		   }
		   temp.next=null;
	   }
   }
   public void deleteAt(int position)
   {
	   if(head==null)
	   {
		   System.out.println(" the list is empty ");
		   return; 
	   }
	   if(head.next==null)
	   {
		   head=null;
	   }
	   
	   else
	   {
		  if(position==0)
		  {
			  deleteStart();
		  }
		  Node1 nextnode=null;
		  Node1 temp=head;
		  int i=0;
		  while(i<position-1)
		  {
			  temp=temp.next;
		  }
		  nextnode=temp.next;
		  temp.next=nextnode.next;
	   }
   }
   
   public void print()
	{
		Node1 node=head;
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
		   System.out.println();
		}
	}
}
public class InsertionDeletion {

	public static void main(String[] args) {
		Linking list=new Linking();
		  list.insert(12);
		  list.insert(13);
		  list.insert(14);
		  list.insert(15);
		  list.print();
		  list.deleteStart();
		  list.print();
		  list.insertStart(1);
		  list.insertEnd(2);
		  list.insertAt(22, 3);
		  list.print();
		  list.deleteEnd();
		  list.print();
		  list.deleteAt(3);
		  list.print();
	}

}
