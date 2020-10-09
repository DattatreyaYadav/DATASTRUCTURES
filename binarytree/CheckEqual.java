package binarytree;

class Node2{
	int data;
	Node2 left;
	Node2 right;
	public Node2(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class Tree{
	
	public Node2 createNode(int data)
	{
		Node2 node= new Node2(data);
		return node;
	}
	public boolean isIdentical(Node2 temp1,Node2 temp2)
	{
		if(temp1==null && temp2==null)
		{
			return true;
		}
		if(temp1.data == temp2.data
		   && isIdentical(temp1.left, temp2.left)
		   && isIdentical(temp1.right,temp2.right))
		{
			return true;
		}
		return false;
	}
}
public class CheckEqual {
	public static void main(String[] args) {
		Tree a=new Tree();
		Node2 root1=a.createNode(1);
		root1.left=a.createNode(2);
		root1.right=a.createNode(3);
		root1.left.left=a.createNode(4);
		root1.left.right=a.createNode(5);
		root1.right.left=a.createNode(6);
		root1.right.right=a.createNode(7);
	
		
		Tree b =new Tree();
		Node2 root2=b.createNode(1);
		root2.left=b.createNode(2);
		root2.right=b.createNode(3);
		root2.left.left=b.createNode(4);
		root2.left.right=b.createNode(5);
		root2.right.left=b.createNode(6);
		root2.right.right=b.createNode(7);
		
		System.out.println("checking wheather both trees are identical");
		
		boolean result=a.isIdentical(root1,root2);
		
		if(result)
		{
			System.out.println("both binary trees are identical");
		}
		else
		{
			System.out.println("both binary trees not are identical");
		}
	}

	
}
