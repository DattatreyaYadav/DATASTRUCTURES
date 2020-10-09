package binarytree;

import java.util.Stack;

class Node9{
	int data;
	Node9 left;
	Node9 right;
	public Node9(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class spiral{
	
	public Node9 createNode(int data) {
		Node9 node=new Node9(data);
		return node;
	}
	public void printSpiral(Node9 root) {
		if(root==null)
		{
			return;
		}
		else {
			Stack<Node9> s1=new Stack<>();
			Stack<Node9> s2=new Stack<>();
			s1.push(root);
			Node9 curr;
			while(!s1.isEmpty() || !s2.isEmpty())
			{
				while(!s1.isEmpty())
				{
					curr=s1.pop();
					System.out.print(curr.data+" ");
					if(curr.left!=null)
					{
						s2.push(curr.left);
					}
					if(curr.right!=null)
					{
						s2.push(curr.right);
					}				
				}
				while(!s2.isEmpty())
				{
					curr=s2.pop();
					System.out.print(curr.data+" ");
					if(curr.right!=null)
					{
						s1.push(curr.right);
					}
					if(curr.left!=null)
					{
						s1.push(curr.left);
					}
									
				}
				
			}
		}
	}
}
public class SpiralTraversal {
	public static void main(String[] args) {
		spiral a=new spiral();
		Node9 root=a.createNode(1);
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
		a.printSpiral(root);
	}
}
