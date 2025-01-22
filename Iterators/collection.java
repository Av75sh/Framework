import java.util.ArrayList;
import java.util.Iterator;

public class collection {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        Iterator<Integer> itr = nums.iterator();
        while (itr.hasNext()) {
            Integer num = itr.next();
            if (num % 2 == 0) {
                itr.remove(); 
            }
        }

        System.out.println(nums); 
    }
}
