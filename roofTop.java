public class roofTop {
    
public static int maxStep(int []arr){
    int n=arr.length;
    int count =0;
    int current =0;

    if(n<2){
        return 0;
    }

    for(int i=1;i<n;i++){
        if(arr[i-1]<arr[i]){
            
            current++;
            count= Math.max(count,current);
        }
        else{
            count =0;
        }
        
        
    }
    
    return count;
}

    public static void main(String [] args){
        int a[]= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(maxStep(a)); 
    }
}
