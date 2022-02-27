package generics.Lab3.HashSet;

import java.util.*;

public class TestHashSet {
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

    System.out.println(set);

    // Display the elements in the hash set
    for (String s: set) {
      System.out.print(s.toUpperCase() + " ");
    }
    
    // Process the elements using a forEach method
    System.out.println();
    set.forEach(e -> System.out.print(e.toLowerCase() + " "));
    System.out.println("\nchecking hash sum");
    int hashSum = 0;
  for(String s: set){
    System.out.println("\n Adding the hash of " + s + ", that is " + s.hashCode());
    hashSum += s.hashCode();
    System.out.println("The sum of hashes is: " + hashSum);
  }
  System.out.println("\n printing has sum");
  System.out.println(set.hashCode());
  }
}

