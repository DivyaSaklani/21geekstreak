public class misrep {

    public static void findElements(int []arr){
    
    int repeating=0;
    int missing=0;

    for(int i=0;i<arr.length;i++){
        int index = Math.abs(arr[i])-1;

        if(arr[index]<0){
            repeating += Math.abs(arr[i]);
        }
        else{
            arr[index] =-arr[index];
        }
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0){
            missing += i+1;
        }

    }
    System.out.println("The repeating number is "+repeating);
    System.out.println("The missing number is "+missing);
}    

    public static void main(String [] args){
        int []a ={1,3,3};
        findElements(a);
    }
    
}
