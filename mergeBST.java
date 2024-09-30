import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left,right;
    public Node(int item){
        data =item;
        left=right=null;
    }
}
public class mergeBST {
      public static List<Integer> merge(Node root1,Node root2){

        List<Integer> l1 =new ArrayList<>();
        List<Integer> l2 =new ArrayList<>();

        inorder(root1,l1);
        inorder(root2,l2);

        return mergeSortList(l1,l2);

      }  
      
      //helper function
      public static void inorder(Node root,List<Integer> l){
        
        if (root==null){
            return;
        }

        inorder(root.left,l);
        l.add(root.data);
        inorder(root.right,l);

      }

      //helper function
      public static  List<Integer> mergeSortList(List<Integer> l1,List<Integer> l2){

        List<Integer> resultList =new ArrayList<>();
        int i=0,j=0;

        while(i<l1.size() &&j<l2.size()){

            if(l1.get(i)<l2.get(j)){
                resultList.add(l1.get(i));
                i++;
            }
            else{
                resultList.add(l2.get(j));
                j++;
            }

        }
        
        //Add remaining elements
        while(i<l1.size()){
            resultList.add(l1.get(i));
            i++;
        }
        while(j<l2.size()){
            resultList.add(l2.get(j));
            j++;
        }
        
        return resultList;
        
      }
      public static void main(String [] args){
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(6);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);

        // Create the second BST
        Node root2 = new Node(2);
        root2.left = new Node(1);
        root2.right = new Node(3);
        root2.right.right = new Node(7);
        root2.right.right.left = new Node(6);

        System.out.println(merge(root1,root2));
      }
}
