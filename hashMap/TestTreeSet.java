package hashMap;

import java.util.*;

public class TestTreeSet {
  public static void main(String[] args) {
    // Create a hash set
    Set<String> set = new HashSet<>();

    // Add strings to the set
    set.add("London");
    set.add("Paris");
    set.add("New York");
    set.add("San Francisco");
    set.add("Beijing");
    set.add("New York");

    TreeSet<String> treeSet = new TreeSet<>(set);
    System.out.println("Sorted tree set: " + treeSet);

    // Use the methods in SortedSet interface
    System.out.println("first(): " + treeSet.first());
    System.out.println("last(): " + treeSet.last());
    System.out.println("headSet(\"New York\"): " + 
      treeSet.headSet("New York"));
    System.out.println("tailSet(\"New York\"): " + 
      treeSet.tailSet("New York"));

    // Use the methods in NavigableSet interface
    System.out.println("lower(\"P\"): " + treeSet.lower("P"));
    System.out.println("higher(\"P\"): " + treeSet.higher("P"));
    System.out.println("floor(\"P\"): " + treeSet.floor("P"));
    System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));
    System.out.println("pollFirst(): " + treeSet.pollFirst());
    System.out.println("pollLast(): " + treeSet.pollLast());
    System.out.println("New tree set: " + treeSet);

    TreeSet<Cat> treeSet2 = new TreeSet<Cat>();
    Cat jack = new Cat(7, "Jack");
    Cat loki = new Cat(1, "Loki");
    Cat sky = new Cat(2, "Sky");
    treeSet2.add(jack);
    treeSet2.add(loki);
    treeSet2.add(sky);

    treeSet2.forEach(i -> System.out.println(i));
    System.out.println("jack compared to loki: " + jack.compareTo(loki));
    System.out.println("jack compared to jack: " + jack.compareTo(jack));

    // Use the methods in SortedSet interface
  System.out.println("first(): " + treeSet2.first());//Returns the first (lowest) element currently in this set.
  System.out.println("last(): " + treeSet2.last());//Returns the last (highest) element currently in this set.
  System.out.println("headSet for Loki): " + treeSet2.headSet(loki)); //Returns a view of the portion of this set whose elements are strictly less than toElement.
  System.out.println("tailSet for Loki): " + treeSet2.tailSet(loki)); //Returns a view of the portion of this set whose elements are strictly less than toElement.
 // Use the methods in NavigableSet interface
//  System.out.println("lower for loki: " + treeSet2.lower(loki).getName());//Returns the greatest element in this set strictly less than the given element
 System.out.println("higher than loki): " + treeSet2.higher(loki).getName());// Returns the least element in this set strictly greater than the given element, or null
 System.out.println("floor for loki:" + treeSet2.floor(loki).getName());//Returns the greatest element in this set less than or equal to the given element, or null
 System.out.println("ceiling for loki:" + treeSet2.ceiling(loki).getName());//Returns the least element in this set greater than or equal to the given element, or null
 System.out.println("pollFirst(): " + treeSet2.pollFirst().getName());//Retrieves and removes the first (lowest) element, or returns null if this set is empty.
 System.out.println("pollLast(): " + treeSet2.pollLast().getName());//Retrieves and removes the last (highest) element, or returns null if this set is empty.

    }
    
  }
