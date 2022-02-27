package generics.Unit5As3;

public abstract class Product implements Comparable, Saleable{
    private double price;

    public Product(){

    }
    public Product(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract boolean isGoodForParties();
    @Override
    public String toString() {
        return "Price: " + price;
    }
}
