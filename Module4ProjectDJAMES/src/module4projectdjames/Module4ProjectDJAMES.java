/**
 * Name: Devon James        Date: December 5th, 2017
 * CSI 213                  Prof. George Berg
 * Discussion: Monday 11:30-12:25
 */

package module4projectdjames;

public class Module4ProjectDJAMES {

    public Node head; 
    
    public boolean isEmpty(){                                   //Verifies that the Linked List is or is not empty
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void addBeginning(int x){
        Node newNode = new Node(x);
        
        newNode.next = head;                                    //Links new node to previous node
        head = newNode;                                         //Adds node
        
        }
    
    public void addEnd(int x){

        Node temp;
        Node endNode = new Node(x);
            if(head==null){
           head = endNode; 
        }
            else{
        temp = head;
        while(temp.next !=null){                                //traverses the list until the last node is found
            temp = temp.next;
        }
        temp.next = endNode;                                    //makes temp.next the new endNode of the linked list

                }
    }
    public Node removeBeginning(){
        Node ref = head;
        if(!isEmpty()){
            head = head.next;                                   //replaces the head node with the one after it, which removes head from the list
        }
        else{
            System.out.println("Empty Linked List");
        }
        return ref;
    }
    
    public void removeEnd(){
       Node temp;
       temp = head;
        while(temp.next.next !=null){                           //traverses the list until the second to last node is found
            temp = temp.next;
        } 
        temp.next = null;                                       //sets the last node to null, removing the node from the list

    }
    
    public void traverse(){                                     //traverses and prints out the current values of the linked list
        Node pointer = head;
        while(pointer !=null){
           System.out.print(pointer.data);
            pointer = pointer.next;
            System.out.println("");
            
        }
    }
    
    public void exit(){                                         //exits program
        System.out.println("Terminating Program... Goodbye!");
        System.exit(0);
    }
   
}
