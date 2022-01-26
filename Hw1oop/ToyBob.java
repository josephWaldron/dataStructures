package Hw1oop;

public class ToyBob extends AbstractCat{
    //data types
    boolean isShortTailed;
    
    //constructors
    public ToyBob(String name, double age, Color color, String type, DOB birthDate, boolean isShortTailed){
        super(name, age, color, type, birthDate);
        this.isShortTailed = isShortTailed;
    }

    @Override
    public boolean useLitterBox() {
        return true;
    }
}
