//Here we have to check whether the parenthesis are balanced or not
import java.util.*;
public class parenthisisChecker {
    public static boolean checker(String s){
        
        Stack <Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='(' ||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();

                if((ch==')' &&  top!='(') ||
                    (ch=='}' && top!='{') ||
                    (ch==']'&& top!='[')
                
                ){
                    return false;
                }

            
            }  
                
            
            
        }
        return stack.isEmpty();
    }
    public static void main(String []args){
       
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String that consist of brackets");

       String brackets=sc.nextLine();
       System.out.println(checker(brackets)?"Balanced":"Not Balanced");


        

    }
    
}
