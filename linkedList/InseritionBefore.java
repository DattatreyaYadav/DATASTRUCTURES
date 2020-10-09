package linkedList;

class Nodeee
{
	int data;
	Nodeee next;
	public Nodeee(int data)
	{
		this.data=data;
		next=null;
	}
}
class beforeinsertion
{ 
	Nodeee head;
    public void insert(int data)
    {
    	Nodeee value=new Nodeee(data);
    	if(head==null)
    	{
    		value.next=null;
    		head=value;
    	}
    	else
    	{
    		value.next=head;
    		head=value; 		
    	}
    }
    public void display()
    {
    	Nodeee node=head;
    	if(head==null)
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
public class InseritionBefore 
{
	public static void main(String[] args) 
	{
		beforeinsertion data=new beforeinsertion();
         data.insert(1);
         data.insert(2);
         data.insert(3);
         data.insert(4);
         data.insert(5);
         data.insert(6);
         data.display();
	}

}
