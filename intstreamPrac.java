import java.util.stream.IntStream;

public class intstreamPrac {
	public static void main (String[] args) {
		
		//IntStream.of() - This function returns a sequentially ordered stream with the provided values as its elements.
		
		var y = IntStream.of(0, 2, 4, 6, 8, 10, 12);
		y.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		
		//range() is used to generate the numbers in the order with incremental by one (end index excluded).
		IntStream.range(0, 20).forEach(i -> System.out.print(i + ", "));
		System.out.println();
		
		//rangeClosed() the same, but end index included
		IntStream.rangeClosed(0, 20).forEach(i -> System.out.print(i + ", "));
		System.out.println();
		
		//we can find min() , max() or custom value(s) in the range
		int min = IntStream.of(0, 2, 4, 6, 8, 10, 12).min().getAsInt();
		int max = IntStream.of(0, 2, 4, 6, 8, 10, 12).max().getAsInt();
        System.out.println(min);
        System.out.println(max);
		
		//convert to array
		int[] myArray = IntStream.of(0, 2, 4, 6, 8, 10, 12).toArray();
		for (int i : myArray) System.out.print(i + ", ");
		System.out.println();
		
		var myArrayOfDivisibleBy3 = IntStream.of(0, 2, 4, 6, 8, 10, 12).filter(i -> i % 3 == 0).toArray();
		for (int i : myArrayOfDivisibleBy3) System.out.print(i + ", ");
		System.out.println();
		
		//map() apply formula/mapping
		var x = IntStream.of(0, 2, 4, 6, 8, 10, 12);
		IntStream squared = x.map(i -> (i * i));
		squared.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		
		var z = IntStream.of(0, 2, 4, 6, 8, 10, 12);
		IntStream doubled = z.map(i -> (i + i));
		doubled.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		
		var v = IntStream.of(0, 2, 4, 6, 8, 10, 12);
		IntStream less1 = v.map(i -> (i - 1));

		less1.forEach(i -> System.out.print(i + ", "));
		
	}
}