package collections;
/*
 * Refactor all the three methods into one Generic Method
 * to find the maximum value. The generic type extends
 * Comparable to compare different object types like
 * Integer, Float, and String.
 */
public class RefactorAllObject {
	 // Generic Method
	public static <T extends Comparable<T>> T findMaximum(T val1,T val2, T val3)
	{
		T max=val1;
		if(val2.compareTo(max)>0)
		{
			max=val2;
		}
		if(val3.compareTo(max)>0)
		{
			max=val3;
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("Maximum value  of TC1  (80, 10, 50) : "+findMaximum(80, 10, 50));
		System.out.println("Maximum value  of TC2  (10.5, 90.5, 50) : "+findMaximum(10f, 90f, 50f));
		System.out.println("Maximum value  of TC3  (Apple, Banana, Peach) : "+findMaximum("Apple", "Banana", "Peach"));
	
	}

}
