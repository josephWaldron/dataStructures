package Hw1oop;

public class DOB {
    //data fields
    private int year;
    private int month;
    private int day;

    public DOB(int newYear, int newMonth, int newDay){
        year = newYear;
        month = newMonth;
        day = newDay;
    }
    public void setYear(int newYear){
        year = newYear;
    }

    @Override
    public String toString() {
        return "DOB [year= " + year + " ,month= " + month + " ,day= " + day + "]";
    }
}
