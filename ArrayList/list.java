package ArrayList;
import java.util.ArrayList;   // Not Thread-Safe  (array size => 2*n)


public class list {
    public static void main(String[] args) {
        ArrayList <Integer> avinash = new ArrayList<>();
        // List <Integer> avinash = new ArrayList<>();

        avinash.add(5);
        avinash.add(2);
        avinash.add(1);
        avinash.add(3);
        avinash.add(4);

        avinash.sort(null);

        for( int i : avinash){
            System.out.print(" " + i);
        }

        // add   add( , )   get   size   contain   remove   Set( , )

    }
}
