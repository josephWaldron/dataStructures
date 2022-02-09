package generics.Lab3;

import Hw1oop.Cat;
import Hw1oop.Cat.Color;

public class homework2 {
    public static void main(String[] args) {
        Integer[] list = {23,42,3,5,2};
        System.out.println("min of Integer list" + min(list));
        String[] listString = {"One", "Two", "Three", "Four"};
        System.out.println("\nmin of String list " + min(listString));
        Cat[] list1 = new Cat[5];       //create list of cats
        for (int i = 0; i < list1.length; i++) {
            list1[i] = new Cat(("Cat " + (i)), (i + 2), Color.CINNAMON, "Tabby");
        }
        System.out.println("\nMin of cat list: " + min(list1));


        
    }
    public static <E extends Comparable<E>> E min(E[] list){
        E min = list[0];
        for(int i = 1; i < list.length; i++){
            E element = list[i];
            if(element.compareTo(min) < 0){
                min = element;
            }
        }
        return min;
    }
}
