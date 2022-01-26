package Hw1oop.catclient;

import Hw1oop.AbstractCat;
import Hw1oop.AbstractCat.Color;
public class testAbstractCat {
    public static void main(String[] args) {
        AbstractCat jambo = new AbstractCat();
        jambo.setName("Jambo");
        jambo.setAge(0.5);
        jambo.setColor(Color.CINNAMON);
        System.out.println(jambo);

        // AbstractCat prince = new AbstractCat("Prince", 0.8, Color.LAVENDER, "domestic");
        // AbstractCat betty = new AbstractCat("Betty", 0.25, Color.RED, "domestic");
        // AbstractCat jimmy = new AbstractCat("Jimmy");
        // AbstractCat carl = new AbstractCat("Carl", "tabby");
        // AbstractCat[] catList = {prince, betty, jimmy, carl};
        // for(AbstractCat cat : catList){
        //     System.out.println(cat.toString() + "\n");
        // }
    }
}
