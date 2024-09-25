import java.util.*;
public class smallestWindow {

public static String findWindow(String s, String p){
    
    if(s.length()<p.length()){
        return "-1";
    }

    Map<Character,Integer> pMap = new HashMap();
    
    //foreach loop
    for(char ch :p.toCharArray()){
        pMap.put(ch,pMap.getOrDefault(ch,0)+1);
    }

    int right=0;
    
    int left=0;
    
    int start=-1;

    int count=0; //Counts number of time the p string condition was satisfied in the s string
    
    int minLen = Integer.MAX_VALUE; //Using Max as we dont know what exactly is the length of window going to be ,perhaps we can reduce this length to find the min

    Map<Character,Integer> sMap = new HashMap();

    while(right<s.length()){
        char rightChar = s.charAt(right);

        sMap.put(rightChar,sMap.getOrDefault(rightChar,0)+1);

        if(pMap.containsKey(rightChar) && sMap.get(rightChar).intValue() <= pMap.get(rightChar).intValue()){
            count++;
        }

        //Try to shrink the window
        while(count==p.length()){
            if(right-left+1<minLen){
                minLen = right-left+1;
                start = left;

            }

            char leftChar = s.charAt(left);
            
            //removing the left character from sMap
            sMap.put(leftChar,sMap.get(leftChar)-1);

            if(pMap.containsKey(leftChar) &&sMap.get(leftChar).intValue() < pMap.get(leftChar).intValue()){
                count--;    //The window is no longer valid so we expand the window further
            }

            left++;
        }

        right++;

    }

    return start == -1?"-1":s.substring(start,minLen+start);



}


    public static void main(String [] args){

        String s="ADOBECODEBANC";
        String p="ABC";
        String ans = findWindow(s,p);
        System.out.println(ans);
    }
    
}
