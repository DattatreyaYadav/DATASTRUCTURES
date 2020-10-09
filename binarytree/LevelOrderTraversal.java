package binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

class Node8{
	int data;
	Node8 left;
	Node8 right;
	public Node8(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class levelorder{
	public Node8 createNode(int data)
	{
		Node8 node=new Node8(data);
		return node;
	}
	public void levelordering(Node8 root)
	{
		if(root==null)
		{
			return;
		}
		else {
			Queue <Node8> queue=new ArrayDeque<>();
		    queue.add(root);
		    Node8 curr;
		    while(!queue.isEmpty()) {
		    	curr=queue.poll();
		    	System.out.print(curr.data+" ");
		    	if(curr.left!=null)
		    	{
		    		queue.add(curr.left);
		    	}
		    	if(curr.right!=null)
		    	{
		    		queue.add(curr.right);
		    	}
		    }
		}
	}
}
public class LevelOrderTraversal {

	public static void main(String[] args) {
	    levelorder a=new levelorder();
	    Node8 root=a.createNode(1);
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
		System.out.println("level ordering elements in single row");
		a.levelordering(root);
	}
}
