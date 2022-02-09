package generics.Lab3;

import java.util.*;

public class TestIterator {
  public static void main(String[] args) {
    Collection<String> collection = new LinkedList<>();
    collection.add("New York"); 
    collection.add("Atlanta"); 
    collection.add("Dallas"); 
    collection.add("Madison"); 

    var iterator = collection.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next().substring(0, 4).toUpperCase() + " ");
    }
    System.out.println();
    for (String string : collection) {
        System.out.print(string.substring(0, 4).toUpperCase() + " ");
    }
    System.out.println();
  }
}