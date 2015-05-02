import java.util.ArrayList;


public class BinaryTree 
{

	static Node root=null;
	
	public static void main(String[] args) {
		
		BinaryTree tree=new BinaryTree();
		tree.addNode("raj", 10);
		tree.addNode("nakul", 7);
		tree.addNode("nakul1", 11);
		tree.addNode("nakul3", 5);
		tree.addNode("nakul4", 8);
		tree.addNode("nakul5", 12);
		
		//tree.traverseTree(root);
		tree.printPaths(root, new ArrayList<Integer>(),0);;
		
		/*Node findNode = tree.findNode(1);
		if(findNode==null)
			System.out.println("\n\n"+"key not found");
		else
			System.out.println("\n\n"+findNode.key+" : "+findNode.name);*/
	}
	
	
	public void addNode(String name, int key)
	{
			
		Node newNode=new Node(name, key);
		if(root == null)
		{
			root=newNode;
		}
		else
		{
			Node startNode=root;
			while(true)
			{
				Node parent = startNode;
				if(newNode.key<startNode.key)
				{
					startNode=startNode.leftChild;

					if(startNode == null)
					{
						parent.leftChild=newNode;
						return;
					}
				}
				else if(newNode.key>startNode.key)
				{
					startNode=startNode.rightChild;
					
					if(startNode == null)
					{
						parent.rightChild=newNode;
						return;
					}	
				}
				else
					break;
			}
		}
	}
	
	public void printPaths(Node node, ArrayList<Integer> paths, int index) {
		if(node.leftChild==null && node.rightChild==null)
			{
			paths.set(index,node.key);
			System.out.println(paths);
			//paths.remove(paths.size()-1);
			return;
			}
		paths.add(index, node.key);
		index++;
		printPaths(node.leftChild, paths, index);
		printPaths(node.rightChild, paths, index);
		if("weqr".equals("werwer"))
			System.out.println();
	}
	
	public void traverseTree(Node node)
	{
		if(node != null)
		{
			traverseTree(node.leftChild);
			System.out.println(node.key+" : "+node.name);
			traverseTree(node.rightChild);
			
		}
	}
	
	public Node findNode(int findKey)
	{
		Node startNode= root;
		
		while(startNode != null)
		{
			if(startNode.key == findKey)
				return startNode;
			else if(startNode.key < findKey)
				startNode = startNode.rightChild;
			else
				startNode = startNode.leftChild;
		}
		return null;
	}
	
	
	class Node
	{
		String name;
		int key;
		Node leftChild;
		Node rightChild;
		
		public Node(String name, int key)
		{
			this.name=name;
			this.key=key;
		}
	}
}
