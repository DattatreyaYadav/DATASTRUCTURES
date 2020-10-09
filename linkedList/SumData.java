package linkedList;

class Node2
{
  int data;
  Node2 next;
  public Node2(int data)
  {
	  this.data=data;
	  this.next=null;
  }
}
class List
{
	Node2 head;
	public void insert(int data)
	{
		Node2 node=new Node2(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node2 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public int addition()
	{
		int sum=0;
		if(head==null)
		{
			System.out.println("list is empty ");
			return 0;
		}
		else
		{
		  sum=sum+head.data;
		  Node2 temp=head;
		  while(temp.next!=null)
		  {
			  temp=temp.next;
			  sum=sum+temp.data;
		  }
		}
		return sum;
	}
}
public class SumData {

	public static void main(String[] args) {
		List list=new List();
		  list.insert(10);
		  list.insert(20);
		  list.insert(30);
		  list.insert(40);
          list.insert(50);
          System.out.println("sum of list items is:");
          System.out.println(list.addition());
	}

}
