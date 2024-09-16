//Count the valid string characters from the given string valid string characters are ()
//Ex: ()(((    output:2
import java.util.*;
public class longparenthisis {

public static int maxLength(String S){
Stack <Integer>stack = new Stack<>();
stack.push(-1);

int validLength=0;

for(int i=0;i<S.length();i++){
    char ch = S.charAt(i);

    if(ch=='('){
        stack.push(i);
    }
    else{
        stack.pop();
    }
    if(stack.isEmpty()){
        stack.push(i);
    }
    else{
        validLength=Math.max(validLength,i-stack.peek());
    }
    }
    return validLength;
}

    public static void main(String[] args) {
    String str="((())())";
        System.out.println(maxLength(str));
        
    }
}
