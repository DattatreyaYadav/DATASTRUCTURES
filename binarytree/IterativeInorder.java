package binarytree;

import java.util.Stack;

class Node4{
	int data;
	Node4 left;
	Node4 right;
	public Node4(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class iterative
{
	public Node4 createNode(int data)
	{
		Node4 node=new Node4(data);
		return node;
	}
	
	public void iterative_inorder(Node4 node)
	{
		Stack <Node4> stack = new Stack<Node4>();
		if(node==null)
		{
			return;
		}
		else {
			Node4 curr=node;
			while(true)
			{
				while(curr!=null)
				{
					stack.push(curr);
					curr=curr.left;
				}
				if(stack.isEmpty())
				{
					break;
				}
				else {
					curr=stack.pop();
					System.out.print(curr.data+" ");
					curr=curr.right;
				}
			}
		}
	}
	
/*
 
    Iterative function to perform in-order traversal of the tree
	public static void inorderIterative(Node root)
	{
		// create an empty stack
		Stack<Node> stack = new Stack();

		// start from root node (set current node to root node)
		Node curr = root;

		// if current node is null and stack is also empty, we're done
		while (!stack.empty() || curr != null)
		{
			// if current node is not null, push it to the stack (defer it)
			// and move to its left child
			if (curr != null)
			{
				stack.push(curr);
				curr = curr.left;
			}
			else
			{
				// else if current node is null, we pop an element from the stack,
				// print it and finally set current node to its right child
				curr = stack.pop();
				System.out.print(curr.data + " ");

				curr = curr.right;
			}
		}
	}
 */
}
public class IterativeInorder {

	public static void main(String[] args) {
		iterative a=new iterative();
		Node4 root=a.createNode(1);
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
		
		a.iterative_inorder(root);
	}

}
