public class minCostStone {
    
    public static int minCost(int k,int []arr){

        int n=arr.length;
        int []dp =new int[n];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for(int i=1;i<n;i++){

            for(int j=1;j<=k;j++){

                if(i-j>=0){
                    dp[i]=Math.min(dp[i],dp[i-j] + Math.abs(arr[i]-arr[i-j])); 
                }

            }
        }
        return dp[n-1];

    }
    public static void main(String [] args){
        int step=3;
        int []arr={2,4,1,3,2};
        System.out.println(minCost(step, arr));
    }
}
