/******************************************************************************* *
* Kean University
* Spring 2022
* Course: CPS*2232 – Data Structures
* Author: Joseph Waldron, CPS*2232, section 2
* Homework: 1
* Program Description: Create class Cat and use it to create objects
*************************************************************************/
package Hw1oop;


public class Cat {
    public enum Color{
        WHITE, CREAM, FAWN, CINNAMON, CHOCOLATE, RED, LILAC, BLUE, BLACK, LAVENDER
    }
    
    //data fields
    String name;
    double age;     //in years
    Color color;
    String type;    //domestic / feral
    static int numberOfCats;

    //constructors
    public Cat(){}
    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, String breed){
        this.name = name;
        System.out.println(breed);
    }
    public Cat(String name, double age, Color color, String type){
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
    }
    //methods
    public static int getNumberOfCats() {
        return numberOfCats;
    }
    String eat(){
        return "favorite food";
    }
    boolean play(String toy){
        return false;
    }
}
