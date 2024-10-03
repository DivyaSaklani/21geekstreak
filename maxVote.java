import java.util.*;

public class maxVote {
    public List<Integer> maxVote(int [] arr) {
        int n= arr.length;
       
        Integer candidate1=null;
        Integer candidate2=null;
        int count1=0,count2=0;

        for(int num:arr){

            if(count1 == 0){
                candidate1=num;
                count1++;
            }
            else if(count2 == 0){
                candidate1=num;
                count2++;
            }
            else if(candidate1!=null && num==candidate1){
                count1++;
            }
            else if(candidate2!=null && num== candidate2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 =0;
        count2 =0;
        
        for(int num:arr){
            if(candidate1!=null && num==candidate1){
                count1++;
            }
            else if(candidate2 != null && num == candidate2){
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        if(count1>n/3){
            result.add(candidate1);
        }
        if(count2>n/3){
            result.add(candidate2);
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[]args){
        maxVote obj = new maxVote();
    int []a={1,2,2,3,3,3,3};
     List<Integer> output = obj.maxVote(a);
        System.out.println(output);
    }
}
