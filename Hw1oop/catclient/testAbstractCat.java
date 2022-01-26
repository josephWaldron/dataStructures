package Hw1oop.catclient;

import Hw1oop.AbstractCat;
import Hw1oop.DOB;
import Hw1oop.ToyBob;
import Hw1oop.AbstractCat.Color;
public class testAbstractCat {
    public static void main(String[] args) {
        // AbstractCat jambo = new AbstractCat();      //since abstract cat is abstract you cannot create objects
        // jambo.setName("Jambo");
        // jambo.setAge(0.5);
        // jambo.setColor(Color.CINNAMON);
        // System.out.println(jambo);

        ToyBob betty = new ToyBob();

        DOB mollysDOB = new DOB(2020, 01, 01);
        AbstractCat molly = new ToyBob("Molly", 1.3, Color.BLUE, "Feral", mollysDOB, false);
        System.out.println(betty);
        System.out.println(molly);
    }
}
