import java.util.*;
public class miniHeight{
    public static int getMinDiff(int arr[],int k){
        
        int n =arr.length;

        if(n==1){
            return 0;
        }
     Arrays.sort(arr);

        int result =arr[n-1] - arr[0];

    int smallest =arr[0]+k;
    int largest = arr[n-1]-k;

    
        for(int i=0;i<n-1;i++){
            int minEle =Math.min(smallest,arr[i+1]-k);
            int maxEle = Math.max(largest,arr[i]+k);
            if(minEle < 0){
                continue;
            }
        result=Math.min(result,maxEle-minEle);
        }
       
        return result;
    }
    /* public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        
        if (n == 1) {
            return 0; // If there is only one tower, no difference
        }
        
        // Sort the array
        Arrays.sort(arr);
        
        // Initialize result as the difference between the maximum and minimum
        int result = arr[n - 1] - arr[0];
        
        // Smallest possible value and largest possible value after the modification
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        
        // Iterate over the array and check each element's potential new value
        for (int i = 0; i < n - 1; i++) {
            int minElement = Math.min(smallest, arr[i + 1] - k);  // Min value after decreasing arr[i+1]
            int maxElement = Math.max(largest, arr[i] + k);       // Max value after increasing arr[i]
            
            // Skip if the result would be negative
            if (minElement < 0) {
                continue;
            }
            
            // Update the result with the minimum difference
            result = Math.min(result, maxElement - minElement);
        }
        
        return result;
    } */
    public static void main(String[] args) {
        int []a={1,5,8,10};
        int k=2;
        System.out.println(getMinDiff(a, k));
    }
}