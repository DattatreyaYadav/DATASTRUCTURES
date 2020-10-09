package binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

class Node6{
	int data;
	Node6 left;
	Node6 right;
	public Node6(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class leftview{
	public Node6 createNode(int data) {
		Node6 node=new  Node6(data);
		return node;
	}
	public void leftviewtree(Node6 root) {
		if(root==null)
		{
			return;
		}
		else {
			Queue <Node6> queue=new ArrayDeque<>();
		    queue.add(root);
		    Node6 curr;
		    while(!queue.isEmpty()) {
		    	int size=queue.size();
		    	int i=0;
		    	while(i++<size)
		    	{
		    		curr=queue.poll();
		    		if(i==1)
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
public class LeftviewofTree {

	public static void main(String[] args) {
		leftview a=new leftview();
		Node6 root=a.createNode(1);
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
          a.leftviewtree(root);
	}
}
