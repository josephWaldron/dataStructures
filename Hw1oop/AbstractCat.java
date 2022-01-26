package Hw1oop;


public class AbstractCat {
    public enum Color{
        WHITE, CREAM, FAWN, CINNAMON, CHOCOLATE, RED, LILAC, BLUE, BLACK, LAVENDER
    }

    //data fields
    private String name;
    private double age;     //in years
    private Color color;
    private String type;    //domestic / feral
    static int numberOfCats;

    //constructors
    public AbstractCat(){
        numberOfCats++;
    }
    public AbstractCat(String name){
        this.name = name;
        numberOfCats++;
    }
    public AbstractCat(String name, String breed){
        this.name = name;
        System.out.println(breed);
        numberOfCats++;
    }
    public AbstractCat(String name, double age, Color color, String type){
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
    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nColor: " + this.color + "\nType: " + this.type;
    }
}