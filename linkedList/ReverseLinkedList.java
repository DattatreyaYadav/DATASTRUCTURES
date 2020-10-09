package linkedList;
class Nodee
{
	int data;
	Nodee next;
	public Nodee(int data)
	{
		this.data=data;
		next=null;
	}
}
class reverse
{
  Nodee head;
  public void insert(int data) 
  {
	  Nodee node=new Nodee(data);
	  if(head==null)
	  {
		  node.next=head;
		  head=node;
	  }
	  else
	  {
		  Nodee temp=head;
		  while(temp.next!=null)
		  {
			  temp=temp.next;
		  }
		  temp.next=node;
	  }
  }
  public void reverseing()
  {
	  if(head==null)
	  {
		  System.out.println("linked list is empty");
		  return;
	  }
	  else
	  {
		  Nodee current,previous,nextnode;
		  current=head;
		  nextnode=null;
		  previous=null;
		  while(current!=null)
		  {
             //step1 here we are point nextnode pointer to nextnode of current
			 nextnode=current.next;
             //step2 here we are making current node to point to previous value
			 current.next=previous;
             //step3 previous is shifted to current node
			 previous=current;
             //step4 head is shifted to current node
			 head=current;
             //step5 now current is shifted to next node
			 current=nextnode;	
		  }
	  }
  }
  public void display()
  {
	  Nodee node=head;
		if(node==null)
		{
			System.out.println("linked list is empty");
			return;
		}
		else
		{
		   while(node.next!=null)
		   {
			   System.out.print(node.data+"->");
			   node=node.next;
		   }
		   System.out.print(node.data);
		   System.out.println();
		}
	
  }
}
public class ReverseLinkedList 
{
	public static void main(String[] args) 
	{
		reverse data = new reverse();
        data.insert(1);
        data.insert(2);
        data.insert(3);
        data.insert(4); 
        data.insert(5);
        data.insert(6);
        System.out.println("normal linked list");
        data.display();
        System.out.println("reverse linked list");
        data.reverseing();
        data.display();
        
//        data.insert(7);
//        data.display(); 
	}

}

// out put:
/*
normal linked list
1->2->3->4->5->6
reverse linked list
6->5->4->3->2->1
*/