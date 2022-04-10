import java.util.ArrayList;
public class lambda {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    list1.add(2);
    list1.add(3);
    list1.add(5);
    list1.add(6);
    list1.forEach( (n) -> { System.out.println(n); } );
  }
}