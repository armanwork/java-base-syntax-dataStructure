import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackStringReversing {
    Queue<Integer> q =new ArrayDeque<>();
//    String str = "arman";
    public void stringReversing(String str){
        Stack<Character> stack= new Stack<>();
        for(int i =0; i<= str.length(); i++){
            stack.push(str.charAt(i));
        }
        for(int i =0; i<= stack.size(); i++){

        }

    }
}
