package binarytree;

class Node3{
	int data;
	Node3 left;
	Node3 right;
	public Node3(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

/*
 public static int height(Node root)
	{
		// Base case: empty tree has height 0
		if (root == null) {
			return 0;
		}

		// recursive for left and right subtree and consider maximum depth
		return 1 + Math.max(height(root.left), height(root.right));
	}
 */
class height{
	public Node3 createNode(int data)
	{
		Node3 node=new Node3(data);
		return node;
	}
	
	public int heightoftree(Node3 node)
	{
		if(node==null)
		{
			return 0;
		}
		int h;
	  // here we are checking the left subtree height;
		int left=heightoftree(node.left);
	  //here also same right subtree height;
		int right=heightoftree(node.right);
		
       // finally the maximum is selected
		if(left>right)
		{
			h=1+left;
		}
		else
		{
		    h=1+right;
		}
		return h;
	}
}
public class HeightBinaryTree {
	public static void main(String[] args) {
		height a = new height();
        Node3 root=a.createNode(1);
        root.left=a.createNode(2);
		root.right=a.createNode(3);
		root.left.left=a.createNode(4);
		root.left.right=a.createNode(5);
		root.right.left=a.createNode(6);
		root.right.right=a.createNode(7);
		root.left.right.left=a.createNode(8);
		root.left.right.right=a.createNode(9);
		root.left.right.right.left=a.createNode(10);
		root.left.right.right.right=a.createNode(11);
		root.right.right.left=a.createNode(12);
		root.right.right.right=a.createNode(13);
        System.out.println("height of binary tree is "+ a.heightoftree(root));
	}
}
