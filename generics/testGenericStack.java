package generics;

import Hw1oop.Cat;

public class testGenericStack {
    public static void main(String[] args) {
        GenericStackFIFO<Integer> intList = new GenericStackFIFO<>();
        intList.push(1);
        intList.push(2);
        intList.push(3);
        System.out.print(intList.toString());
        intList.pop();
        System.out.print(intList.toString());

        GenericStackFIFO<String> Stringlist = new GenericStackFIFO<>();
        Stringlist.push("Hello");
        Stringlist.push("This is");
        Stringlist.push("Testing");
        System.out.print(Stringlist.toString());
        Stringlist.pop();
        System.out.print(Stringlist.toString());

        GenericStackFIFO<Cat> catList = new GenericStackFIFO<>();
        catList.push(new Cat("Jambo"));
        catList.push(new Cat("Bob"));
        catList.push(new Cat("Mittens"));
        System.out.print(catList.toString());
        catList.pop();
        System.out.print(catList.toString());
    }
}
