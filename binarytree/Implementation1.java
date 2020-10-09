package binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node1{
	int data;
	Node1 left;
	Node1 right;
	public Node1(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class Binarytree {
	
	public Node1 createnode(int data)
	{
		Node1 node=new Node1(data);
		return node;
	}
	public void inorder(Node1 node) {
		if(node==null)
		{
			return;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	public void preorder(Node1 node) {
		if(node==null)
		{
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	public void postorder(Node1 node) {
		if(node==null)
		{
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
	public int getsumofnodes(Node1 node)
	{
		if(node==null) {
			return 0;
		}
		return node.data+getsumofnodes(node.left)+getsumofnodes(node.right);
	}
	
	public int differenceofevenoddlevelvalue(Node1 node)
	{
		if(node==null)
		{
			return 0;
		}
		return node.data-differenceofevenoddlevelvalue(node.left)-differenceofevenoddlevelvalue(node.right);
	}
	
	public int numberofnodes(Node1 node)
	{
		if(node==null)
		{
			return 0;
		}
		return 1+numberofnodes(node.left)+numberofnodes(node.right);
	}
	
	public int numberleafnodes(Node1 node)
	{
		if(node==null)
		{
			return 0;
		}
		
		if(node.left==null && node.right==null)
		{
			return 1;
		}
		 
		return numberleafnodes(node.left)+numberleafnodes(node.right);
	}
	
	// this method helps us to find the height of any node;
	public int heightoftree(Node1 node)
	{
		if(node==null)
		{
			return -1;
		}
		return Math.max(heightoftree(node.left),heightoftree(node.right))+1;
	}
	
	//print the nodes at the given level ;
	public void printgivenlevel(Node1 node,int level)
	{
		if(node==null)
		{
			return;
		}
		if(level==1)
		{
			System.out.print(node.data+" ");
			return;
		}
		printgivenlevel(node.left,level-1);
		printgivenlevel(node.right,level-1);
	}
	
	//print nodes at each level 
	public void levelorderusingrecursion(Node1 node) {
		if(node==null)
		{
			return;
		}
		int height=heightoftree(node);
		for(int i=0;i<=height;i++) {
			printgivenlevel(node,i+1);
			System.out.println();
		}
	}
	
	//print node at each level using queue
    public void levelordertraversalbyqueue(Node1 node) {
    	if(node==null)
    	{
    		return;
    	}
    	Queue<Node1> p=new LinkedList<Node1>();
    	p.add(node);
    	while(p.size()>0)
    	{
    		Node1 top=p.remove();
    		System.out.print(top.data+" ");
    		
    		if(top.left!=null)
    		{
    			p.add(top.left);
    		}
    		if(top.right!=null)
    		{
    			p.add(top.right);
    		}
    	}
    	
    }
}
public class Implementation1 {

	public static void main(String[] args) {
		
		Binarytree a=new Binarytree();
		Node1 root=a.createnode(2);
		root.left=a.createnode(7);
		root.right=a.createnode(5);
		root.left.left=a.createnode(2);
		root.left.right=a.createnode(6);
		root.left.right.left = a.createnode(5);
		root.left.right.right = a.createnode(11);
		root.right.right = a.createnode(9);
		root.right.right.left = a.createnode(4);
		
		System.out.print("Inorder: ");
	    a.inorder(root);
	    System.out.println();

	    System.out.print("PreOrder: ");
	    a.preorder(root);
	    System.out.println();
	    
	    System.out.print("PostOrder: ");
	    a.postorder(root);
	    System.out.println();
	    
	    System.out.println("total sum:"+ a.getsumofnodes(root));
	    
	    System.out.println("difference: "+ a.differenceofevenoddlevelvalue(root));
	    
	    System.out.println("total no of nodes : "+ a.numberofnodes(root));
	    
	    System.out.println("number of leaf nodes : "+ a.numberleafnodes(root));
	    
	    System.out.println("height of binary tree is :"+a.heightoftree(root));
	    
	    a.printgivenlevel(root, 4);
	    System.out.println();
	    System.out.println("elements at given level");
	    a.levelorderusingrecursion(root);
	    
	    a.levelordertraversalbyqueue(root);//by queue
	}
}
