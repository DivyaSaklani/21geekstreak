//Create duplicate list replacing the nodes ,their next and the random pointers with the duplicate list so that it resembles the original one


class Node{
    int data;
    Node next;
    Node random;

    public Node(int data){              //constructor
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

class Solution {

    Node copyNode(Node head){

        if (head ==null){
            return null;
        }

        Node cur = head;    //cur iterates through the list begining with head
        while(cur != null){

            //new node is created that copies the data of cur node
            Node newNode = new Node(cur.data); 
            newNode.next = cur.next;

            //Insert a new node after the cur node
            cur.next = newNode;
            
            //cur ->newNode ->cur.next.next

            //move to the next original node
            /* cur = cur.next.next;  or */
            cur = newNode.next;
            
        }

        //Set the random pointer for the cloned nodes
        cur = head;

        while(cur != null){
            if(cur.random != null){            //if the random pointer of cur exists
                cur.next.random = cur.random.next;      //duplicate cur is paired with duplicate random
            }
            cur = cur.next.next;            //cur to the next original node 
        }

        //Separate the original and the duplicate list
        cur = head;
        Node copiedHead = head.next;        //head of the copied list
        Node copy = copiedHead;             //pointer to iterate through the list for duplicates just like cur is for original
        
        while (cur != null){
            cur.next = cur.next.next;       //original list is maintained
            
            if(copy.next != null){
                copy.next = copy.next.next;       //duplicate list is maintained
            }

            cur = cur.next;
            copy = copy.next;


        }
        return copiedHead;
    }
    
}

public class dupList{
    public static void  main(String[] args) {

        //Create a node from Node class
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        
        //Create a next pointer from Node class
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

          // Set up random pointers
          node1.random = node3;  // 1's random points to 3
          node2.random = node1;  // 2's random points to 1
          node3.random = node4;  // 3's random points to 4
          node4.random = node2;  // 4's random points to 2

          // Print original list
        System.out.println("Original list:");
        printList(node1);

        // Clone the list
        Solution solution = new Solution();
        Node clonedHead = solution.copyNode(node1);         //gives output of the copyNode function in Solution class

        // Print cloned list
        System.out.println("\nCloned list:");
        printList(clonedHead);
    }     
        // Helper method to print the list with random pointers
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("Node data: " + curr.data);
            if (curr.random != null) {
                System.out.println(", Random points to: " + curr.random.data);
            } else {
                System.out.println(", Random points to: null");
            }
            curr = curr.next;
        }
    
    }
    
}

  