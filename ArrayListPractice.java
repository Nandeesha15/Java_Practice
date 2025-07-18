import java.util.*;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
          list.add(4);
            list.add(25);
              list.add(65);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        
    }
    
}
