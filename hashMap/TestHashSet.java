package hashMap;

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
    set.forEach(e -> System.out.print(e.toLowerCase() + " \n"));

    //Create a hash set
    Set<Cat> setCat = new HashSet<>();

    //Add cats to the set
    setCat.add(new Cat(2, "Masha"));
    setCat.add(new Cat(1, "Prince"));
    setCat.add(new Cat(5, "Sam"));

    setCat.forEach(i -> System.out.println(i));
    System.out.println("\nNew cats");
    Cat newSheCat = new Cat(3, "Luna");
    Cat newHeCat = new Cat(3, "Max");
    setCat.add(newSheCat);
    setCat.add(newSheCat);
    setCat.add(newSheCat);
    setCat.add(newHeCat);
    setCat.add(newHeCat);
    System.out.println("setCat.contains(newSheCat) is " + setCat.contains(newSheCat));
    System.out.println("setCat.contains(newHeCat) is " + setCat.contains(newHeCat));
    setCat.remove(newHeCat);
    System.out.println("setCat.contains(newHeCat) is " + setCat.contains(newHeCat));
    setCat.forEach(i -> System.out.println(i));
  }
}
class Cat implements Comparable{
    private int age;
    private String name;

    public Cat(int age, String name){
        super();
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int compareTo(Object o){
        if(this.hashCode() == ((Cat)o).hashCode())
        return 0;
        else if (this.hashCode() < ((Cat)o).hashCode())
        return 1;
        else
        return -1;
    }
    @Override
    public String toString(){
        return "Cat [age=" + age + ", name=" + name + ", getAge()=" + getAge() + ",getName()=" + getName()+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ",toString()=" + super.toString()+ "]";
    }
    

}