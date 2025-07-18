
import java.util.*;
public class ArrayListPractice1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
         list.add(2);
          list.add(3);
           list.add(4);
            list.add(5);
           for(int even:list){
            if(even % 2==0)
            {
               System.out.println(even);

            }
           }


        
    }
    
}
