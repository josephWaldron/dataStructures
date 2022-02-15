package generics.Lab3.quiz1;

public class testVeggie {
    public static void main(String[] args) {
        Vegetable[] veggieList = new Vegetable[4];
        veggieList[0] = new Cucumber(5, 2);
        veggieList[1] = new Cucumber(3, 4);
        veggieList[2] = new JosephVeggie(10, "Tomato");
        veggieList[3] = new JosephVeggie(5, "Cabbage");
        System.out.println(findMax(veggieList));
    }
    public static <E extends Comparable<E>> E findMax(E[] list){
        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            E element = list[i];
            if(element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }
}
