//Here we try to find the length of the longest prefix that should also be suffix of the string 
//Overlapping of prefix and sufix is allowed.

//We are maintaining an array that is keeping track of repeating substrings.
//Once the end of the array is reached teh last element of array will be the length of the longest prefix. 



public class longpresuf {
     int longestPrefixSuffix(String str) {
        int n=str.length();
        int lps[] = new int[n];
        int len = 0;
        int i=1;

        while(i<n){
            //Iterate through the string
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{       
                if(len!=0){
                    //if the characters doesn't match and len is not 0 then we reduce len so that smaller substrings can be matched
                    len=lps[len-1];

                }
                else{
                    //if the characters doesn't match and len is 0 then we set len to 0
                    lps[i]=0;
                    i++;
                }
            }
        }
        //last element of the array will be the length of the longest prefix
        return lps[n-1];
    }
    public static void main(String[] args) {
        String s="aabbaa";
        longpresuf ob = new longpresuf();
        int res=ob.longestPrefixSuffix(s);
        System.out.println("Length of longest prefix suffix is "+res);
        
    }
}
