package Stack;
import java.util.Stack;                                   // Thread Safe    Stack (child)   ----> Vector (parent)

public class stack {
    public static void main(String[] args) {
        Stack <Integer> avinash = new Stack<>();

        avinash.push(5);
        avinash.push(2);
        avinash.push(1);
        avinash.push(3);
        avinash.push(2);

        System.out.println(avinash);

        Integer remove = avinash.pop();
        System.out.println(avinash);

        Integer peek = avinash.peek();
        System.out.println(peek);


        // push   pop   peek

    }
    
}
