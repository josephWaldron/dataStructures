package generics;

public class showUncheckedWarning {
	public static void main(String[] args) {
	    java.util.ArrayList<Object> list =  new java.util.ArrayList<>();
        list.add("hello");
	    list.add("Java Programming");
        list.add(java.time.LocalDate.of(2022, 1, 2));
        list.forEach(i -> System.out.println(i + " "));
	  }

}
