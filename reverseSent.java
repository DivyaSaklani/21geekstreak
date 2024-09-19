import java.util.*;
public class reverseSent {
    public static String reverseword(String s){
 
        String []words = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1 ; i>=0; i--){
            sb.append(words[i]);

            sb.append(".");

            if(i==0){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sen =sc.nextLine();
        System.out.println(reverseword(sen));
    }
}
