package binarytree;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class Implementation {
     Node root=null;
     public void traverseTree(Node node) {
    	 if(node!=null)
    	 {
    		 traverseTree(node.left);
    		 System.out.print(node.data+" ");
    		 traverseTree(node.right);
    	 }
     }
	public static void main(String[] args) {
		//creation an object
		Implementation tree=new Implementation();
		  
		//create nodes of the tree
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
 
		System.out.print("\n Binary tree: ");
		tree.traverseTree(tree.root);
	}

}
