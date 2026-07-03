package collections;

import java.util.Arrays;

public class MaximumOfObject {

	@SafeVarargs
	static <T extends Comparable<T>> T findMax(T...  values)
	{
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		return values[values.length-1];
	}
	public static void main(String[] args) {
		
		System.out.println("Maximum value  of TC1  (80, 10, 50) : "+findMax(80, 10, 50));
		System.out.println("Maximum value  of TC2  (10.5, 90.5, 50) : "+findMax(10f, 90f, 50f));
		System.out.println("Maximum value  of TC3  (Apple, Banana, Peach) : "+findMax("Apple", "Banana", "Peach"));
	
	}
}
