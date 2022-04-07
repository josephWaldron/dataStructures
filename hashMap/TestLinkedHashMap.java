package hashMap;

import java.util.*;
public class TestLinkedHashMap {
    public static void main(String[] args) {
        //create 3 cats
Cat one = new Cat(7, "Jack");
Cat two = new Cat(2, "Sky");
Cat three = new Cat(1, "Loki");
//get their Hashcodes
Integer oneCatCode = one.hashCode();
Integer twoCatCode = two.hashCode();
Integer threeCatCode = one.hashCode();//uses the same code as one
//put cats into HashMap, try to add three twice
 Map<Integer, Cat> map = new HashMap<>();
 map.put(oneCatCode, one);
 map.put(twoCatCode, two);
 map.put(threeCatCode, three);
 map.put(threeCatCode, three);

 map.forEach((x, y) -> System.out.println(x + " " + y));

 //check if map contains Loki
 System.out.println("map.containsKey(oneCatCode) - Loki "+ map.containsKey(oneCatCode));
 //get cat with key oneCatCode
 Cat newCat = map.get(oneCatCode);
 System.out.println("New cat's name is: " + newCat.getName());
 System.out.println("New cat's hashCode is: " + newCat.hashCode());

 Integer newCatHashCode = newCat.hashCode();//returns 668849042

 System.out.println("map.containsValue(newCatHashCode): " + map.containsValue(newCatHashCode));
 map.put(newCatHashCode, newCat);

 map.forEach((x, y) -> System.out.println(x + " " + y.getName()));

// As it can be seen from the output new Object created from existing Loki but it has another hash code
System.out.println(" map.containsKey(newCatHashCode): " + map.containsKey(newCatHashCode));
 //print keySet
 System.out.println("KeySet: " + map.keySet());
 System.out.println("Values: " + map.values());

 //remove two by its code
 map.remove(twoCatCode);
 System.out.println("KeySet: " + map.keySet());
 System.out.println("Values: " + map.values() + "\n\n");

 TreeMap<Integer, Cat> treeMap = new TreeMap<>(map);
 //display keys and values
 treeMap.forEach((x, y) -> System.out.println(x + " " + y));
//print keySet
System.out.println("treeMap.keySet() : " + treeMap.keySet());//Returns a Set view of the keys contained in this map.
 System.out.println("treeMap.values(): " + treeMap.values());//Returns a Collection view of the values contained in this map.
 System.out.println("treeMap.descendingKeySet: " +treeMap.descendingKeySet());//Returns a reverse order NavigableSet view of the keys contained in this map.
 System.out.println("treeMap.ceilingEntry(newCatHashCode: "
+treeMap.ceilingEntry(newCatHashCode));//Returns the least key greater than or equal to the given key, or  null
 System.out.println("treeMap.firstEntry(): " +treeMap.firstEntry());//Returns a key-value mapping associated with the least key in this map, or null if the map is empty.
 System.out.println("treeMap.firstKey: " +treeMap.firstKey());//Returns the first (lowest) key currently in this map.
  System.out.println("treeMap.lowerKey(newCatHashCode): "
 +treeMap.lowerKey(newCatHashCode));//Returns the greatest key strictly less than the given key, or null if there is no such key.
  System.out.println("treeMap.tailMap(newCatHashCode, false): " +
 treeMap.tailMap(newCatHashCode, false));//Returns a view of the portion of this map whose keys are greater than (or equal to, if inclusive is true) fromKey.
  System.out.println("treeMap.containsValue(three): " + treeMap.containsValue(three));//Returns true if this map maps one or more keys to the specified value.
 }
}   
