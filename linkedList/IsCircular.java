package linkedList;
class Node8
{
  int data;
  Node8 next;
  public Node8(int data)
  {
	  this.data=data;
	  this.next=null;
  }
}

class circular
{	
Node8 head=null;
void insert(int data)
{
	Node8 node=new Node8(data);
	if(head==null)
	{
		head=node;
		node.next=head;
	}
	else
	{
		Node8 temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=node;
		node.next=head;
	}
}

   public boolean iscir()
   {
	 boolean result=false;
	 if(head==null)
	 {
		 return false;
	 }
	 else
	 {
		 Node8 temp=head;
		 while(temp!=null)
		 {
			 if(temp.next==head)
			 {
				 result=true;
				 break;
			 }
			 else
			 {
				 if(temp.next==null)
				 {
					 result=false;
				 }
			 }
		 }
		 return result;
	 }
   }
}

public class IsCircular {
	public static void main(String[] args) {
		circular dat=new circular();
		dat.insert(1);
		dat.insert(2);
		dat.insert(3);
		dat.insert(4);
		dat.insert(5);
		boolean result =dat.iscir();
		if(result)
		{
			System.out.println("the linkedlist is a circular");
		}
		else
		{
			System.out.println("linkedlist is not circular");
		}
	}
}
