package hashMap;

import java.util.*;

public class Singleton {
    public static void main(String[] args) {
        String[] list = { "1", "2", "4", "2", "1", "2",
                               "3", "1", "3", "4", "3", "3" };
 
        // Creating a list and removing
        // elements without use of singleton()
        List list1 = new ArrayList(Arrays.asList(list));
        System.out.println("Original list: " + list1);
 
        list1.remove("1");
        System.out.println("list1 after removal of 1 without"
                           + " singleton " + list1);
        list1.remove("1");
        System.out.println("list1 after removal of 1 without"
                           + " singleton " + list1);
        list1.remove("2");
        System.out.println("list1 after removal of 2 without"
                           + " singleton " + list1);
 
        /* Creating another list and removing
    its elements using singleton() method */
        List list2 = new ArrayList(Arrays.asList(list));
        System.out.println("\nOriginal list2: " + list2);
 
        // Selectively delete "1" from
        // all it's occurrences
        list2.removeAll(Collections.singleton("1"));
        System.out.println("list2 after removal of 1 with "
                           + "singleton:" + list2);
 
        // Selectively delete "4" from
        // all it's occurrences
        list2.removeAll(Collections.singleton("4"));
        System.out.println("list2 after removal of 4 with "
                           + "singleton:" + list2);
 
        // Selectively delete "3" from
        // all it's occurrences
        list2.removeAll(Collections.singleton("3"));
        System.out.println("list2 after removal of 3 with"
                           + " singleton: " + list2);
    }
}
