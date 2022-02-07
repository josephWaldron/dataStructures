package generics;

public class testDT {
    public static void main(String[] args) {
        MyDT <Integer>first = new MyDT<>();
        first.setT(5);
        int num = first.getT();
        Object num2 = first.getT();

        MyDT<String> second = new MyDT<>();
        second.setT("Hello");
        String num3 = second.getT();
    }
}
