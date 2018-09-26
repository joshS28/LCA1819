package lca_sweng;

public class lca_sweng {
	
	class Node{
		
		int value;
		Node left;
		Node right;
		
		Node(int value){
			this.value = value;
			left = null;
			right = null;
		}
		
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	
	Node root;

	/*public class BinaryTree{
		Node root;
		
	}*/
	
	
	
	public void insert(int value) {
		
		root = insertRec(root, value);
		
	}
	public boolean contains(int value) {
		
	    return containsRec(root, value);
	    
	}



private Node insertRec(Node current, int value) {
	
	if(current == null) {
		return new Node(value);
	}
	if(value < current.value) {
		current.left = insertRec(current.left, value);
	}
	else if(value > current.value) {
		current.right = insertRec(current.right, value);
	}
	else {
		return current;
	}
	
	return current;
	
}

private boolean containsRec(Node current, int value) {
    if (current == null) {
        return false;
    } 
    if (value == current.value) {
        return true;
    } 
    return value < current.value
      ? containsRec(current.left, value)
      : containsRec(current.right, value);
}









}
