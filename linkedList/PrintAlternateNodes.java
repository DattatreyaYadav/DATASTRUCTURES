package linkedList;

class Node7
{ 
   int data;
   Node7 next;
   public Node7(int data)
   {
	   this.data=data;
	   this.next=null;
   }
}
class printAlternate
{
	static Node7 head=null;
	public void insert(int data)
	{
	    Node7 node=new Node7(data);
	    if(head==null)
	    {
	      node.next=head;
	      head=node;
	    }
	    else
	    {
	    	Node7 temp=head;
	    	while(temp.next!=null)
	    	{
	    		temp=temp.next;
	    	}
	    	temp.next=node;
	    }    
	}
	public void print()
	{
		if(head==null)
		{
			System.out.println("linkedlist is empty");
			return;
		}
		else
		{
		   Node7 temp=head;
		   while(temp!=null)
		   {
			   System.out.print(temp.data+" ");
			   if(temp.next==null)
			   {
				   return;
			   }
			   else
			   {
				   temp.next=temp.next.next;
				   temp=temp.next;
			   }
		   }
		}
	}
}
public class PrintAlternateNodes {

	public static void main(String[] args) {
		
		printAlternate dat=new printAlternate();
		dat.insert(1);
		dat.insert(2);
		dat.insert(3);
		dat.insert(4);
		dat.insert(5);
		dat.print();
	}

}
