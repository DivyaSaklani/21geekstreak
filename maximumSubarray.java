//Repeat

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


public class maximumSubarray {
    
    public ArrayList<Integer> maxSubArray(int[] arr,int k){

        ArrayList<Integer> result = new ArrayList();

        //Deque stores the value of the index of the array
        //Deque make use of linkedList as the pointers can be shifted easily so that we don't have to shift the elements on delete like in
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0;i<arr.length;i++){

            //The subarray window starts from i-k till i
            if(!deque.isEmpty() && deque.peek() <=i-k){        
                
                deque.poll();
            }

            while(!deque.isEmpty() && arr[deque.peekLast()]<=arr[i]){
                deque.pollLast();
            }

            deque.offer(i);

            //Once we have processed the first k elements, start adding maximums to the result
            if(i>k-1){
                result.add(arr[deque.peek()]);
            }

        }
        return result;
    
    }
    public static void main(String [] args){
        int a[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k =3;
        maximumSubarray obj = new maximumSubarray();
        ArrayList<Integer> result = obj.maxSubArray(a,k);
        System.out.println(result);
    }
}
