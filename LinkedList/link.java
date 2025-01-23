package LinkedList;
import java.util.Arrays;
import java.util.LinkedList;         /*  Not Thread safe  [it had data + pointer] NODE 
                                                        +---- Required More memory, random access in not easy as it not allow indexing
                                                        +---- Single, Double, Circular LinkedList 
                                                        +---- In java it has DOuble linkedList                                                       */

public class link {
    public static void main(String[] args) {
        LinkedList<Integer> avinash = new LinkedList<>();
        avinash.add(1);
        avinash.add(2);
        avinash.add(1);
        avinash.add(2);
        avinash.add(1);
        avinash.add(2);


        Integer[] array = avinash.toArray(new Integer[0]);
            System.out.print(" " + Arrays.toString(array));
        
    }
}
