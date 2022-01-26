package Hw1oop;

public class ToyBob extends AbstractCat{
    //data types
    private boolean isShortTailed;
    
    //constructors
    public ToyBob(){
        super();
    }
    public ToyBob(String name, double age, Color color, String type, DOB birthDate, boolean isShortTailed){
        super(name, age, color, type, birthDate);
        this.isShortTailed = isShortTailed;
    }

    @Override
    public boolean useLitterBox() {
        boolean isClean = true;
        return (isClean)? true : false;
    }
    @Override
    public boolean hasName() {
        return (getName() instanceof String)? true : false;//checks if has name
    }
    @Override
    public boolean canBePetted() {
        boolean nailsTrimmed = false;
        return (nailsTrimmed)? true : false;
    }
    @Override
    public boolean areFriendsWith(Pet p) {
        return (this instanceof AbstractCat && p instanceof AbstractCat)? true : false; //checks and see if both are cats
    }
}
