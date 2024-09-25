class Node{
    int data;
    Node next;
    Node(int d){
        d=data;
        next =null;
    }
}
public class palindromeList {
    
    public static boolean isPalandrome(Node head){

        if(head==null || head.next == null){
            return true;
        }
        
        Node slow =head;
        Node fast =head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }

        Node current = slow;
        Node prev =null;

        while(current !=null){
            Node nextNode = current.next;
            current.next = prev;
            prev= current;
            current = nextNode;
        }

        Node left=head;
        Node right=prev;

        while( right!=null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }

    //to print the list
    void printList(Node head){
        Node temp = head;
        if(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
            
        }
        System.out.println();

    }

    //To insert the data within the Node

    Node insert(Node head,int data){
        Node newNode = new  Node(data);
        if(head ==null){
            return newNode;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return  head;
    }

    //driver function

    public static void main(String[] args) {
        palindromeList list = new palindromeList();
        Node head = null;
        
        list.insert(head,1);
        list.insert(head,2);
        list.insert(head,2);
        list.insert(head,1);

        list.printList(head);

       System.out.println (list.isPalandrome(head));

    /*  if(list.isPalandrome(head)){
         System.out.println("list palindrome");
         else{
             System.out.println("list not palindrome");
         } */
     }
    
}
