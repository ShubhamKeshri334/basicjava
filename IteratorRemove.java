package collection;
import java.util.*;

public class IteratorRemove {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        
        // Getting an iterator
        Iterator<Integer> iterator = numbers.iterator();
        
        // Iterating through the list
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            // Remove even numbers
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        
        // Printing the modified list
        System.out.println("List after removal: " + numbers);
    }
}
