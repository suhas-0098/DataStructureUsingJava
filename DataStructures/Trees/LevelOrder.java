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


public class LevelOrder
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
	    
	    levelOrderTraversal(root);
	    
	     
	   
	}
	
	public static void levelOrderTraversal(Node root){
	    
	    Queue<Node> queue = new LinkedList<Node>();
	    
	   List<Integer> wraplist = new LinkedList<Integer>();
        
	    
	    if(root==null){
	        return ;
	    }
	    
	    queue.offer(root);
	    
	    while(!queue.isEmpty()){
	        
	        if(queue.peek().left!=null){
	            queue.offer(queue.peek().left);
	        }
	        
	        if(queue.peek().right!=null){
	            queue.offer(queue.peek().right);
	            
	        }
	        
	        wraplist.add(queue.poll().data);
	    }
	    System.out.println(wraplist);
	}
	


	
}
