package generics.Unit5As3;

public class Chips extends Product{
    private String flavor;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String howToSell() {
        return null;
    }

    @Override
    public boolean isGoodForParties() {
        return false;
    }
    
}
