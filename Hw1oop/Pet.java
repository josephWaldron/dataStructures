package Hw1oop;

public interface Pet {//interfaces only have data types and methods
    public boolean hasName();
    public boolean canBePetted();
    public boolean areFriendsWith(Pet p);
    public default boolean areEnemiesWith(Pet p) {
        return !areFriendsWith(p);      //returns opposite of are friends with method
    }
}
