package Vector;
import java.util.Vector;         //Thread-Safe & Synchornized  (array size => 2*n)
public class v {   

    public static void main(String[] args) {
        Vector <Integer> avinash = new Vector<>();

        avinash.add(5);
        avinash.add(2);
        avinash.add(1);
        avinash.add(3);
        avinash.add(4);

    //    avinash.sort(null);

        for( int i : avinash){
            System.out.print(" " + i);
        }

        // add   add( , )   get   size   contain   remove   Set( , )  isEmpty  clear

    }
}


