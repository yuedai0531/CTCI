import java.util.LinkedList;
import java.util.Queue;

public class TreesAndGraphs {

	public static void main(String[] args) {
		
		
		

	}
	
	public static void visit(Node n) {
		System.out.println(n.value);
	}
	
	
	//recursive
	
	void inOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.left);
			visit(node);
			inOrderTraversal(node.right);
		}
	}
	
	void preOrderTraversal(Node node) {
		if(node != null) {
			visit(node);
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
		}
	}
	
	void postOrderTraversal(Node node) {
		if(node != null) {
			inOrderTraversal(node.left);
			inOrderTraversal(node.right);
			visit(node);
		}
	}
	
	void BFS(Node root) {
		if(root == null) {
			return;
		}
		visit(root);
		root.visited = true;
		for(Node n : root.adjacent) {
			if(n.visited == false)
				BFS(n);
		}
	}
	
	void DFS(Node root) {
		Queue<Node> q = new LinkedList();
		root.visited = true;
		q.add(root);
		
	}

	
}

class Node{
	
    int value;
    Node left;
    Node right;
    Node[] adjacent;
    boolean visited = false;
    
 
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
	
	
}

class Tree{
	Node root;
	
}
