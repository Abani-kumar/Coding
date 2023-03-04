import java.util.*;
public class Class {
    public static boolean isDuplicate(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){//closing
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){//duplicate exists
                    return true;
                }else{//opening pair
                    s.pop();
                }
            }else{//opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str="((a+b))";
        System.out.println(isDuplicate(str));
    }
}
