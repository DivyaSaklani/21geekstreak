//In this program we have to find number of elements that adds up to make each element in the array.
//k = 3, arr[] = [5, 8, 10, 13]
//Output: 14   

/* 5=2+3   (2)
8=3+3+2     (3)
10=3+3+3+1  (4)
13=3+3+3+3+1    (5)
Output=2+3+4+5 */

public class totalCount{

    public static int  minDivisions(int k,int []arr){
        
        int count=0;

        for(int num:arr){
            count +=(num+k-1)/k;
        }

        return count;
    }
    public static void main(String [] args){
       int  k = 3;
       int  a[] = {5, 8, 10, 13};
      System.out.println(minDivisions(k,a));
    }
}
