package Hw1oop;

enum Color{
    WHITE, CREAM, FAWN, CINNAMON, CHOCOLATE, RED, LILAC, BLUE, BLACK, LAVENDER
}
public class Cat {
    //data fields
    String name;
    double age;     //in years
    Color color;
    String type;    //domestic / feral
    static int numberOfCats;

    //constructors
    Cat(){}
    Cat(String name){
        this.name = name;
    }
    Cat(String name, String breed){
        this.name = name;
        System.out.println(breed);
    }
    Cat(String name, double age, Color color, String type){
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
