import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrac {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

    // Add 5 numbers.
    // Print the list.
    // Remove the 2nd element.
    // Update the last element to a new value.
    // Print the final list.

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        System.out.println("ArrayList after adding 5 elements: "+a);

        System.out.println("After removing 2nd element: "+a.remove(1)+a);

        System.out.println("After updating the last element: "+a.set(3, 6)+a);

        System.out.println("Final List: "+a);


    }
}