package bst;

public class BinaryTree {
	
	public class Node
	{
		Node left,right;
		int key;
		Node(int item)
		{
			key=item;
			left=right=null;
		}
	}
	Node root;
	BinaryTree()
	{
		root=null;
	}
	Node insert(Node root,int key)
	{
		if(root==null) 
		{
			root=new Node(key);
			return root;
		}
		 if(root.key > key)
		{
			root.left=insert(root.left,key);
		}
		else if(root.key < key)
		{
			root.right=insert(root.right,key);
		}
		return root;
	}
	void inorder(Node root)
	{
		if(root!=null)
		{	
			inorder(root.left);
			System.out.println(root.key);
			inorder(root.right);
		}
	}
	Node search(Node root,int data)
	{
		if(root!=null)
		{
			if(data==root.key)
				return root;
		   else if(data < root.key)
				root=search(root.left,data);
			else
				root=search(root.right,data);
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree=new BinaryTree();
		tree.root=tree.insert(tree.root,20);
		tree.root=tree.insert(tree.root,10);
		tree.root=tree.insert(tree.root,30);
		tree.root=tree.insert(tree.root,5);
		tree.root=tree.insert(tree.root,40);
		tree.inorder(tree.root);
		if(tree.search(tree.root,40) != null)
		{
			System.out.println("found");
		}
		tree.inorder(tree.root);

	}

}
