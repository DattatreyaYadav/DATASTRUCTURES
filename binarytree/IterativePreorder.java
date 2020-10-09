package binarytree;

import java.util.Stack;

class Node5{
	int data;
	Node5 left;
	Node5 right;
	public Node5(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class preorder{
	public Node5 createNode(int data)
	{
		Node5 node=new Node5(data);
		return node;
	}
	public void iterative_preorder(Node5 node)
	{
		Stack <Node5> stack=new Stack<Node5>();
		if(node==null)
		{
			return;
		}
		else {
			Node5 curr=node;
			while(true)
			{
				while(curr!=null)
				{
					System.out.print(curr.data+" ");
					stack.push(curr);
					curr=curr.left;
				}
				if(stack.isEmpty())
				{
					break;
				}
				else {
					curr=stack.pop();
					curr=curr.right;
				}
			}
		}	
	}
	/*
	 // Iterative function to perform pre-order traversal of the tree
public static void preorderIterative(TreeNode root)
{
	// return if tree is empty
	if (root == null) {
		return;
	}

	// create an empty stack and push root node
	Stack<TreeNode> stack = new Stack();
	stack.push(root);

	// start from root node (set current node to root node)
	TreeNode curr = root;

	// loop till stack is empty
	while (!stack.empty())
	{
		// if current node is not null, print it and push its right
		// child to the stack and move to its left child
		if (curr != null)
		{
			System.out.print(curr.data + " ");

			if (curr.right != null) {
				stack.push(curr.right);
			}

			curr = curr.left;
		}
		// else if current node is null, we pop a node from the stack
		// set current node to the popped node
		else {
			curr = stack.pop();
		}
	}
}`
	 */
}
public class IterativePreorder {
	public static void main(String[] args) {
		preorder a=new preorder();
		Node5 root=a.createNode(1);
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
		
		a.iterative_preorder(root);
	}
}
