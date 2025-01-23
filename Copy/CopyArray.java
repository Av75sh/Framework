package Copy;
import java.util.concurrent.CopyOnWriteArrayList;                         // Extenion of ArrayList

public class CopyArray {
    public static void main(String[] args) {

    CopyOnWriteArrayList<String> avinash = new CopyOnWriteArrayList<>();
    avinash.add("Milk");
    avinash.add("Curd");

    for(String item : avinash){
        if(item.equals("Milk")){
            avinash.add("Butter");
            System.out.println(avinash);
        }
    }
    }
}

/* It is used when we do many read operation in a thread and less write operation
 *        It simply make a copy of an arryalist and go on with the read operation and at the end it refers to the final arraylist 
 *        But we should not ❌ use it always as it requires more memory
 */
