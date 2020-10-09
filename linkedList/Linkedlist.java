
package data;

class Node {
	int data;
    Node next;
}
class linked{
   Node head;
   public void insert(int data) {
	   Node node=new Node();
	   node.data=data;
	   node.next=null;
	   if(head==null) {
		   head=node;
	   }
	   else {
		   Node temp=head;
		   while(temp.next!=null) {
			   temp=temp.next;
		   }
		   temp.next=node;
	   }
   }
   public void insertAtStart(int data) {
	   Node node=new Node();
	   node.data=data;
	   node.next=null;
	   node.next=head;
	   head=node;
   }
   public void insertEnd(int data) {
	   Node node=new Node();
	   node.data=data;
	   node.next=null;
	   if(head==null) {
		   head=node;
	   }
	   else {
		   Node temp=head;
		   while(temp.next!=null) {
			   temp=temp.next;
		   }
		   temp.next=node;
	   }
   }
   public void insertAt(int index,int data) {
	   Node node=new Node();
	   node.data=data;
	   node.next=null;
	   if(index==0) {
		  // insertAtStart(int data);
		   node.next=head;
		   head=node;
	   }
	   else {
		   Node temp =head;
		   for(int i =0;i<index-1;i++) {
			   temp=temp.next;
		   }
		   node.next=temp.next;
		   temp.next=node;
		   
	   }
   }
   public void delete(int index) {
	   if(index==0) {
		   head=head.next;
	   }
   }
   
   
}
public class Linkedlist {

	public static void main(String[] args) {
		
		  
	}

}
