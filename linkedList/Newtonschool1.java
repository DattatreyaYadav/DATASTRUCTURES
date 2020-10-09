package linkedList;

import java.util.Scanner;

class Node3
{
  String name;
  Node3 next;
  public Node3(String name)
  {
	  this.name=name;
	  next=null;
  }
}
public class Newtonschool1 
{
	public static void display(Node3 head)
	{
		if(head==null)
		{
			return;
		}
		else
		{
			System.out.print(head.name+" ");
			display(head.next);
		}
		/*
		 
		 if(head==null)
		
		{
			System.out.println("linkedList is empty");
			return;
		}
		else
		{
			Node3 temp=head;
			while(temp.next!=null)
			{
				System.out.print(temp.name+"->");
				temp=temp.next;
			}
			System.out.print(temp.name);
			System.out.println();
		}
		*/
	}
	public static void main(String[] args) 
	{
     Node3 node=null;
     Node3 head=null;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter number of students");
	 int number=scan.nextInt();
//	 System.out.println("storing the data in the data in the form of linked list");
	 for(int i =0;i<number;i++)
	 {
		 System.out.println("enter the name of "+i+" student");
		 String s=scan.next();
		 node=new Node3(s);
		 if(i==0)
		 {
			node.next=head;
			head=node;
		 }
		 else
		 {
			 Node3 temp=head;
			 while(temp.next!=null)
			 {
				 temp=temp.next;
			 }
			 temp.next=node;
			 temp=node;
		 }  
	 }
	 System.out.println("\nData in linked list\n");
	  display(head);
      scan.close();
	}
}
/*
enter number of students
4
enter the name of 0 student
dattatreya
enter the name of 1 student
kusuma
enter the name of 2 student
mallesh
enter the name of 3 student
bhavya

Data in linked list

dattatreya->kusuma->mallesh->bhavya

*/