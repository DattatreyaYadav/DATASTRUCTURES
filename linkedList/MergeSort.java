package linkedList;
class Node10
{
	int data;
	Node10 next;
	public Node10(int data) {
		this.data=data;
		this.next=null;
	}
}
class mergesorting
{
	Node10 head=null;
	public void insert(int data)
	{
		Node10 node=new Node10(data);
		if(head==null)
		{
			node.next=head;
			head=node;
		}
		else
		{
			Node10 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public void print()
	{
		Node10 temp=mergeSort(head);
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public Node10 getMiddle(Node10 head)
	{
		Node10 slower=head;
		Node10 faster=head;
		while(faster.next!=null&&faster.next.next!=null)
		{
			slower=slower.next;
			faster=faster.next.next;
		}
		return slower;
	}
	public Node10 merge(Node10 a,Node10 b)
	{
		Node10 result=null;
		if(a==null)
		{
			return b;
		}
		if(b==null)
		{
			return a;
		}
		if(a.data<b.data)
		{
			result=a;
			result.next=merge(a.next,b);
		}
		else
		{
			result=b;
			result.next=merge(a,b.next);
		}
		return result;
	}
	public Node10 mergeSort(Node10 head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		else
		{
			Node10 middle=getMiddle(head);
			Node10 midNext=middle.next;
			middle.next=null;
			Node10 left=mergeSort(head);
			Node10 right=mergeSort(midNext);
			Node10 sorted =merge(left,right);
		    return sorted;
		}
	}
}
public class MergeSort {
	public static void main(String[] args) {
		mergesorting value=new mergesorting();
		value.insert(5);
		value.insert(1);
		value.insert(3);
		value.insert(2);
		value.insert(4);
		value.print();
	}
}
