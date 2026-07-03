package collections;
/*
 * Program to find the maximum of three Floating numbers
 * using the Float wrapper class and compareTo() method.
 * The program tests three cases where the maximum number
 * is in the 1st, 2nd, and 3rd positions.
 */
public class MaximumFloatUC2 {
	static Float MaxNumber(Float n1,Float n2,Float n3)
	{
		Float max=n1;
		if(n2.compareTo(max)>0)
		{
			max=n2;
		}
		if(n3.compareTo(max)>0)
		{
			max=n3;
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println("Maximum number TC1  (2.3, 1.1, 0) : "+MaxNumber(2.3f, 1.1f, 0f));
		System.out.println("Maximum number TC2  (10.5, 90.5, 50) : "+MaxNumber(10f, 90f, 50f));
		System.out.println("Maximum number TC3  (50.0, 1.0, 70.3) : "+MaxNumber(500f, 10f, 700f));
	}

}

