import java.util.ArrayList;
public class rotateDelete {

public static int rotDel(ArrayList<Integer> arr){
    
    int sz=arr.size();
    int operations= sz/2;
    
    for(int i=1;i<=operations;i++){
        int LastElement = arr.remove(arr.size()-1);
        arr.add(0,LastElement);

        arr.remove(arr.size()-i);
    }
    return arr.get(0);
    }

public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);
    arr.add(6);
    System.out.println(rotDel(arr));
}
}
