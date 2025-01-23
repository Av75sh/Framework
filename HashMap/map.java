package HashMap;
import java.util.HashMap;


public class map {
    public static void main(String[] args) {
        HashMap <Integer, String> avinash = new HashMap<>();
        avinash.put(1, "Kumar");
        avinash.put(2,"Singh");
        avinash.put(3,"Devi");

        for( int i : avinash.keySet()){
            System.out.println(i);
        }
    }
}


/* To use for-each loop in hashMap  [avinash.keyset()]
 * 
 * for( int value : avinash.keySet()){
            System.out.println(i);
        }
 */
