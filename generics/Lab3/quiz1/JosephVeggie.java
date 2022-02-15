package generics.Lab3.quiz1;

public class JosephVeggie extends Vegetable{
    private String name;
    public JosephVeggie(int price, String name){
        super(price);
        this.name = name;
    }
    @Override
    boolean isGoodForSalad() {
        return false;
    }
    @Override
    public String howToGrow() {
        return "It doesnt grow";
    }
    
}
