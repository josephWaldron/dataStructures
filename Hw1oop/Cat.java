/******************************************************************************* *
* Kean University
* Spring 2022
* Course: CPS*2232 – Data Structures
* Author: Joseph Waldron, CPS*2232, section 2
* Homework: 1
* Program Description: Create class Cat and use it to create objects
*************************************************************************/
package Hw1oop;

public class Cat implements Comparable<Cat>{
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
    public Cat(){
        numberOfCats++;
    }
    public Cat(String name){
        this.name = name;
        numberOfCats++;
    }
    public Cat(String name, String breed){
        this.name = name;
        System.out.println(breed);
        numberOfCats++;
    }
    public Cat(String name, double age, Color color, String type){
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
        numberOfCats++;
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
    public double getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nColor: " + this.color + "\nType: " + this.type;
    }
    @Override
    public int compareTo(Cat c1) {
        return c1.getAge() < this.age ? 1 : c1.getAge() == this.age ? 0 : -1;
    }
}
