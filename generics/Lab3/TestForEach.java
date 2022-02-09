package generics.Lab3;

import java.util.*;

public class TestForEach {
  public static void main(String[] args) {
    Collection<Integer> collection = new ArrayList<>();
    collection.add(1); 
    collection.add(1); 
    collection.add(4); 
    collection.add(4);
    collection.add(3); 
    collection.add(6); 
    collection.add(0); 

    collection.forEach(e -> System.out.print(e * 2 + " "));
    System.out.println();
    collection.forEach(e -> System.out.print((e * e) + " "));
    System.out.println();
    collection.forEach(e -> System.out.print(Math.log10(e) + " "));
  }
}