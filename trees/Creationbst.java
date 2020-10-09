package trees;

class Node
{
	int value;
	Node left;
	Node right;
    public Node(int value)
    {
    	this.value=value;
    	this.left=null;
    	this.right=null;
    }
}
class creation
{
	Node root=null;
	public void add(int value)
	{
		root=insert(root,value);
	}
	public Node insert(Node node,int value)
	{
		if(node==null)
		{
			return new Node(value);
		}
		if(value<node.value)
		{
			node.left=insert(node.left,value);
		}
		else if(value>node.value)
		{
			node.right=insert(node.right,value);
		}
		return node;
	}
	public void inorder()
	{
		inorder(root);	
	}
	public void inorder(Node node)
	{
		/*
		 
		if(node==null)
		{
			return;
		}
		else
		{
			inorder(node.left);
		    System.out.printf("%s ", node.value);
		    inorder(node.right);
		}
		
		*/
		
		if(node.left!=null) {
			inorder(node.left);
		}
		System.out.print(node.value+" ");
		if(node.right!=null)
		{
			inorder(node.right);
		}
		
	}
	
	public void preorder()
	{
		preorder(root);	
	}
	public void preorder(Node node)
	{
		System.out.print(node.value+" ");
		if(node.left!=null) {
			preorder(node.left);
		}
		if(node.right!=null) {
			preorder(node.right);
		}
	}
	public void postorder()
	{
		postorder(root);	
	}
	public void postorder(Node node)
	{
		if(node.left!=null) {
			postorder(node.left);
		}
		if(node.right!=null) {
			postorder(node.right);
		}
		System.out.print(node.value+" ");
	}
	

	public Node delete(Node node,int value)
	{
		if(node==null)
		{
			return node;
		}
		if(value<node.value)
		{
			node.left=delete(node.left,value);
		}
		else if(value>node.value)
		{
			node.right=delete(node.right,value);
		}
		else
		{
			if(node.left==null ||node.right==null)
			{
				Node temp=node.left!=null ? node.left : node.right;
			
			    if(temp==null)
			    {
				return null;
			    }
			    else
			    {
			       return temp;	
			    }
			}
			else
			{
				Node successor=getSuccessor(node);
				node.value=successor.value;
				
				node.right=delete(node.right,successor.value);
				return node;
			}
		}
		return node;
	}
	public Node getSuccessor(Node node)
	{
		if(node==null)
		{
			return null;
		}
		Node temp=node.right;
		while(temp.left!=null)
		{
			temp=temp.left;
		}
		return temp;
	}
   public void present(int value)
   {
	  boolean result =isPresent(root,value);
	  if(result)
	  {
		  System.out.println("\nthe vlaue is present in the  bst");
	  }
	  else
	  {
		  System.out.println("\nthe vlaue is not-present in the  bst");
	  }
		  
   }
   public boolean isPresent(Node node,int value)
   {
	   if(node==null)
	   {
		   return false;
	   }
	   
	   boolean ispresent=false;
	   
	   while(node!=null)
	   {
		   if(value<node.value)
		   {
			   node=node.left;
		   }
		   else if(value>node.value)
		   {
			   node=node.right;
		   }
		   else
		   {
			   ispresent=true;
			   break;
		   } 
	   }
	   return ispresent;
   }
   public void parent (int value) 
   {
	  Node temp =getParent(root,value);
	  if(temp!=null)
	  System.out.println(temp.value);
	  else
		  System.out.println("parent deosn't exit");
   }
	public Node getParent(Node node, int value)
	{
		if(node==null)
		{
			return null;
		}
		
		Node parent=null;
	    while(node!=null)
	    {
	    	if(value<node.value)
	    	{
	    		parent=node;
	    		node=node.left;
	    	}
	    	else if(value>node.value)
	    	{ 
	    		parent=node;
	    		node=node.left;

	    	}
	    	else
	    	{
	    		break;
	    	}
	    }
	    // when the node is not null it is going to return us parent value 
			return node!=null ? parent : null ;	
	}
	public void sibling(int value)
	{
		Node temp=getSibling(root,value);
		if(temp!=null)
	     System.out.println(temp.value);
	    else
	     System.out.println("sibling deosn't exit");
	}
	public Node getSibling(Node node,int value)
	{
		if(node==null || node.value==value)
		{
			return null;
		}
		
		 Node parent=null;
		 
		while(node!=null)
		{
			if(value<node.value)
			{
				parent=node;
				node=node.left;
			}
			else if(value>node.value)
			{
				parent=node;
				node=node.right;
			}
			else
			{
				break;
			} 
		}
		if(parent.left!=null && value==parent.left.value)
		{
			return parent.right;
		}
		if(parent.right!=null && value==parent.right.value)
		{
			return parent.left;
		}
		return null;
	 }
	
	public void maximum()
	{
		int max=maximumValue(root);
		if(max==-1)
		{
			System.out.println("Tree is empty");
		}
		else
	    System.out.println(max);
	}
	public int maximumValue(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		while(node.right!=null)
		{
			node=node.right;
		}
		return node.value;
	}
	public void minimum()
	{
		int max=minimumValue(root);
		if(max==-1)
		{
			System.out.println("Tree is empty");
		}
		else
	    System.out.println(max);
	}
	public int minimumValue(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		
		while(node.left!=null)
		{
			node=node.left;
		}
		return node.value;
	}
	public void inorderparent(int value)
	{
		Node result=getIndorderParent(root,value);
		if(result!=null)
		{
			System.out.println("inorderparent is: "+result.value);
		}
		else
		{
			System.out.println("inorder parent not exits");
		}
	}
	public Node getIndorderParent(Node node,int value)
	{
		if(node==null)
		{
			return null;
		}
		
		Node inorderparent=null;
		while(node!=null)
		{
			if(value<node.value)
			{
				inorderparent=node;
				node=node.left;
			}
			else if(value>node.value)
			{
				node=node.right;
			}
			else
			{
				break;
			}
		}
		return node != null ? inorderparent :null;
	}
	public void inordersuccessor(int value)
	{
		Node result=getInorderSuccessor(root,value);
		if(result!=null)
		{
			System.out.println("inorder successor is: "+result.value);
		}
		else
		{
			System.out.println("inorder successor doesn't exit");
		}
	}
	public Node getInorderSuccessor(Node node,int value)
	{
		if(node==null)
		{
		    return null;
		}
		
		Node inordersuccessor=null;
		while(node!=null)
		{
			if(value<node.value)
			{
				inordersuccessor=node;
				node=node.left;
			}
			else if(value>node.value)
			{
				node=node.right;
			}
			else
			{
				if(node.right!=null)
				{
				inordersuccessor=getSuccessor(node);
				}
				break;
			}
		}
		return node != null? inordersuccessor:null;
	}
	public void difference()
	{
		int result=getDifference(root);
		System.out.println(result);
	}
	public int getDifference(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		return node.value - getDifference(node.left) - getDifference(node.right);
	}
	public void sum()
	{
		int result=sumAllNodes(root);
		System.out.println(result);
	}
	public int sumAllNodes(Node node)
	{
      if(node==null)
      {
    	return 0;
      }
      int sum=node.value+ sumAllNodes(node.left)+sumAllNodes(node.right);
      return sum;
	}
 }
public class Creationbst
{

	public static void main(String[] args)
	{
		creation data=new creation();
	    data.add(12);
	    data.add(4);
	    data.add(16);
	    data.add(24);
	    data.add(8);
	    data.add(14);
	    data.add(9); 
	    System.out.println("inorder traversal"+"\n");
	    data.inorder();
	    
	    System.out.println("\n\npreorder traversal"+"\n");
	    data.preorder();
	    
	    System.out.println("\n\npostorder traversal"+"\n");
	    data.postorder();
	    
	    data.present(9);
	    
	    
	    System.out.println("parent of a particular node  :");
	    
	    data.parent(12);
	    
	    System.out.println("print the sibbling node of a given node ");
	    
	    data.sibling(4);
	    
	    System.out.println("maximum value in the given binary search tree");
	    
	    data.maximum();
	    
        System.out.println("minimum value in the given binary search tree");
	    
	    data.minimum();
	    
	    System.out.println("inorder parent of a given node ");
	    
	    data.inorderparent(4);
	    
	    System.out.println("inorder successor of a given node ");
	    
	    data.inordersuccessor(4);
	    
	    System.out.println("difference of even and odd level values");
	    
	    data.difference();
	    
	    System.out.println("sum of all nodes in bst");
	    
	    data.sum();
	}	
}

