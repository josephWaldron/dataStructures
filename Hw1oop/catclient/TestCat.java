/******************************************************************************* *
* Kean University
* Spring 2022
* Course: CPS*2232 – Data Structures
* Author: Joseph Waldron, CPS*2232, section 2
* Homework: 1
* Program Description: Create class Cat and use it to create objects
*************************************************************************/
package Hw1oop.catclient;

import Hw1oop.Cat;
import Hw1oop.Cat.Color;
public class TestCat {
    public static void main(String[] args) {
        Cat prince = new Cat("Prince", 0.8, Color.LAVENDER, "domestic");
        Cat betty = new Cat("Betty", 0.25, Color.RED, "domestic");
    }
}
