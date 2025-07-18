
import java.util.*;
public class ArrayListPrac1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println("Before sorting: "+list);
        Collections.sort(list);
        System.out.println("After sorting: "+list);

        
    }
    
}
