package generics.Lab3.quiz1;

public class Cucumber extends Vegetable{
    private int length;
    public Cucumber(int price, int length){
        super(price);
        this.length = length;
    }
    @Override
    boolean isGoodForSalad() {
        return true;
    }
    @Override
    public String howToGrow() {
        return "On a pole";
    }
    
}
