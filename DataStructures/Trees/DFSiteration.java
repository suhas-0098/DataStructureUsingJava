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


public class DFSiteration
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
	     iterativeInOrder(root);
	     System.out.println();
	     
	     System.out.println("PreOrder");
	     iterativePreOrder(root);
	     System.out.println();
	     
	     System.out.println("PostOrder");
	     iterativePostOrder(root);
	   
	}
	

	
	public static void iterativePreOrder(Node root){
	    
	    Stack<Node> st = new Stack<>();
	    
	    if(root==null){
	        return;
	    }
	    
	    st.push(root);
	    
	    while(!st.isEmpty()){
	        
	        root = st.pop();
	        System.out.print(root.data+" ");
	        
	        if(root.right!=null){
	            st.push(root.right);
	        }
	        
	        if(root.left!=null){
	            st.push(root.left);
	        }
	        
	    }
	}
	
	public static void iterativePostOrder(Node root){
	    
	    Stack<Node> st = new Stack<>();
	    
	    ArrayList<Integer> ans = new ArrayList<>();
	    
	    
	    if(root==null){
	        return;
	    }
	    
	    st.push(root);
	    
	    while(!st.isEmpty()){
	        
	        root = st.pop();
	        
	        ans.add(root.data);
	        
	        if(root.left!=null){
	            st.push(root.left);
	        }
	        
	        if(root.right!=null){
	            st.push(root.right);
	        }
	    }
	    Collections.reverse(ans);
	    System.out.println(ans);
	    
	    
	}
	
	
	public static void iterativeInOrder(Node root){
	    
	    Stack<Node> st = new Stack<>();
	 
	    while(true){
	        
	        if(root!=null){
	            st.push(root);
	            root=root.left;
	        }
	        else{
	            if(st.isEmpty()){
	                break;
	            }
	            root = st.pop();
	            System.out.print(root.data+" ");
	            root=root.right;
	        }
	        
	    }
	    
	    
	}
	
	
}
