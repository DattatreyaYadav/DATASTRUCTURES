package binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

class Node7{
	int data;
	Node7 left;
	Node7 right;
	public Node7(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class rightview{
	public Node7 createNode(int data) {
		Node7 node=new  Node7(data);
		return node;
	}
	public void rightviewtree(Node7 root) {
		if(root==null)
		{
			return;
		}
		else {
			Queue <Node7> queue=new ArrayDeque<>();
		    queue.add(root);
		    Node7 curr;
		    while(!queue.isEmpty()) {
		    	int size=queue.size();
		    	int i=0;
		    	while(i++<size)
		    	{
		    		curr=queue.poll();
		    		if(i==size)
		    		{
		    			System.out.print(curr.data+" ");
		    		}
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
}
public class RightViewTree {
	public static void main(String[] args) {
		rightview a=new rightview();
		Node7 root=a.createNode(1);
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
           a.rightviewtree(root);
	}
}
