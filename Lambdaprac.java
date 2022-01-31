import java.util.stream.IntStream;

public class Lambdaprac {
	public static void main (String[] args) {
		
		int [] a = {0, 1, 2, 3, 4, 6, 8, 10, 12};
		addTwo(a);
		System.out.println("\n--------------------");
		
		var myData = IntStream.of(0, 1, 2, 3, 4, 6, 8, 10, 12);
		myData.forEach(i -> System.out.print(i + 2 + " "));
	}
	
	public static void addTwo(int [] arr){
		for(int i : arr)
			System.out.print(i + 2 + " ");
	}
}