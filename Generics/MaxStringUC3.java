package collections;
/*
 * Program to find the maximum of three Strings
 * using the  String class and compareTo() method.
 * The program tests three cases where the maximum String
 * is in the 1st, 2nd, and 3rd positions.
 */
public class MaxStringUC3 {
	static String MaxString(String n1,String n2,String n3)
	{
		String max=n1;
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
		System.out.println("Maximum number TC1  (Peach, Apple, Banana) : "+MaxString("Peach", "Apple", "Banana"));
		System.out.println("Maximum number TC2  (Apple, Peach, Banana) : "+MaxString("Apple", "Peach", "Banana"));
		System.out.println("Maximum number TC3  (Apple, Banana, Peach) : "+MaxString("Apple", "Banana", "Peach"));
	}

}
