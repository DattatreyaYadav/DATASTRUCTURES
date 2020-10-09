package linkedList;

class Node9
{
	String data;
	Node9 next;
	public Node9(String data)
	{
		this.data=data;
		this.next=null;
	}
}
class checkpalindrome
{
	Node9 head=null;
	public void insert(String data)
	{
		Node9 node=new Node9(data);
		if(head==null)
		{
			node.next=head;
			head=node;
		}
		else
		{
			Node9 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public boolean isPalindrome()
	{
		String str="";
		if(head==null)
		{
			return false;
		}
		else
		{
			Node9 temp=head;
			while(temp!=null)
			{
				str=str+temp.data;
				temp=temp.next;
			}
		}
		return ispalin(str);
	}
	
	public boolean ispalin(String str)
	{
		int length=str.length();
		for(int i=0,j=length-1;i<=j;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
		}
		return true;
	}
}
public class Palindrome {
	public static void main(String[] args) {
		 checkpalindrome data=new  checkpalindrome();
		 data.insert("a");
		 data.insert("bc");
		 data.insert("d");
		 data.insert("dcb");
		 data.insert("a");
		 
		 boolean result= data.isPalindrome();
		 if(result)
		 {
			 System.out.println("it is palindrome");
		 }
		 else
		 {
			 System.out.println("it is not palindrome");
		 }
	}
}
