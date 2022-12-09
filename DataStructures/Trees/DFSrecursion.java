import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
    
}


public class DFSrecursion
{
	public static void main(String[] args) {
	   
	    Node root = new Node(1);
	   
	    root.left = new Node(2);
	    root.right = new Node(3);
	   
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	    root.left.right.left=new Node(8);
	   
	    root.right.left = new Node(6);
	    root.right.right = new Node(7);
	    root.right.right.left = new Node(9);
	    root.right.right.right = new Node(10);
	    
	     System.out.println("InOrder");
	    recursionInOrder(root);
	     System.out.println();
	     System.out.println("PreOrder");
	    recursionPreOrder(root);
	     System.out.println();
	     System.out.println("PostOrder");
	    recursionPostOrder(root);
	   
	}
	
	public static void recursionInOrder(Node root){
	    
	    if(root==null){
	        return;
	    }
	    recursionInOrder(root.left);
	    System.out.print(root.data+" ");
	    recursionInOrder(root.right);
	    
	}
	
	public static void recursionPreOrder(Node root){
	    
	    if(root==null){
	        return;
	    }
	    
	    System.out.print(root.data+" ");
	    recursionPreOrder(root.left);
	    recursionPreOrder(root.right);
	}
	
	public static void recursionPostOrder(Node root){
	    
	    if(root==null){
	        return;
	    }
	    
	    recursionPostOrder(root.left);
	    recursionPostOrder(root.right);
	    System.out.print(root.data+" ");
	}
}
