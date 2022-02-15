package generics.Lab3.quiz1;

public abstract class Vegetable implements Edible, Comparable<Vegetable>{
    private int price;
    public Vegetable(){
    }
    public Vegetable(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    abstract boolean isGoodForSalad();
    @Override
    public String toString() {
        return "Price = " + price;
    }
    @Override
    public int compareTo(Vegetable c1) {
        return c1.getPrice() < this.price ? 1 : c1.getPrice() == this.price ? 0 : -1;
    }
    @Override
    public String howToEat(){
        return "Eat";
    }
}
