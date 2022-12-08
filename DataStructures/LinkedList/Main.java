import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main
{
    
    Node insertBeginning(Node head,int data){
        
        Node newnode = new Node(data);
        
        if(head==null){
            head = newnode;
        }
        else{
            
            newnode.next = head;
            head = newnode;
        }
        return head;
        
    }
    
    Node insertEnd(Node head,int data){
        
        Node newnode = new Node(data);
        
        if(head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = newnode;
        }
        
        return head;
    }
    
    Node insertPosition(Node head,int data,int pos){
        
        Node newnode = new Node(data);
        Node temp = head;
        
        if(temp==null){
            temp=newnode;
        }
        else if(pos==1){
            newnode.next = temp;
            return newnode;
        }
        else{
            
            for(int i=1;i<=pos-2 && temp!=null;i++){
                temp=temp.next;
            }
            newnode.next = temp.next;
           
            temp.next = newnode;
             
        }
        
        return head;
        
        
    }
    
    Node deleteBeginning(Node head){
        
        if(head==null){
            System.out.println("No element to delete");
        }
        else{
            head = head.next;
        }
        return head;
    }
    
    Node deleteEnd(Node head){
        
        if(head==null){
            System.out.println("No element to delete");
        }
        else{
            Node temp = head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
        return head;
    }
    
    Node deletePosition(Node head,int pos){
        
        if(head==null){
            System.out.println("No element to delete");
        }
        else if(pos==1){
            head=head.next;
            
        }
        else{
            Node temp = head;
            for(int i=1;i<pos-1 && temp!=null;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        return head;
    }
    
    
    void display(Node head){
        
        if(head==null){
            System.out.println("No elements are there");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("");
            
        }
    }
    
    
    
	public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  
	     Main obj = new Main();
	  
	     Node head = null;
	     
	   // head=obj.insertBeginning(head,10);
	   // head=obj.insertBeginning(head,20);
	   // head=obj.insertEnd(head,30);
	   // head=obj.insertEnd(head,50);
	   // head=obj.insertPosition(head,40,2);
	    
	    
	   // head=obj.deleteBeginning(head);
	   // head=obj.deleteEnd(head);
	   // head=obj.deletePosition(head,2);
	    
	   // obj.display(head);
	   
	   
	     do{
	         System.out.println("   Menu  ");
	         System.out.println("Press 1 to Insert At Beginning");
	         System.out.println("Press 2 to Insert At End");
	         System.out.println("Press 3 to Insert At Position");
	         System.out.println("Press 4 to Delete At Beginning");
	         System.out.println("Press 5 to Delete At End");
	         System.out.println("Press 6 to Delete At Position");
	         System.out.println("Press 7 to Display");
	         System.out.println("Press 8 to Exit");
	         
	         int ch = sc.nextInt();
	         switch(ch){
	             case 1:System.out.println("Enter the value : ");
	                    int val = sc.nextInt();
	                    head = obj.insertBeginning(head,val);
	                    break;
	                    
	            case 2:System.out.println("Enter the value : ");
	                   int val1 = sc.nextInt();
	                   head = obj.insertEnd(head,val1);
	                   break;
	                   
	            case 3:System.out.println("Enter the value : ");
	                   int val2 = sc.nextInt();
	                   System.out.println("Enter the Position to insert : ");
	                   int pos2 = sc.nextInt();
	                   head = obj.insertPosition(head,val2,pos2);
	                   break;
	                   
	           case 4:head=obj.deleteBeginning(head);
	                  break;
	           
	           case 5:head=obj.deleteEnd(head);
	                  break;
	            
	           case 6:System.out.println("Enter the Position to Delete : ");
	                  int pos = sc.nextInt();
	                  head = obj.deletePosition(head,pos);
	                  break;
	         
	           case 7:obj.display(head);
	                  break;
	           
	           case 8:System.exit(0);
	                  break;
	                  
	           default:
	                   System.out.println("You have entered the wrong choice.... please enter the correct choice");
	                   break;
	         }
	         
	         
	         
	         
	         
	         System.out.println("Do you want to continue then press 1");
	         System.out.println("Do you want to stop then press 2");
	     }while(sc.nextInt()==1);
	     
	    
	    
	    
	    
		
	}
}
