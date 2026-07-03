package collections;
/*
 * Program to find the maximum of three values using
 * a Generic Class. The generic type extends Comparable
 * so that Integer, Float, and String objects can be
 * compared using the compareTo() method.
 */
class Generic<T extends Comparable<T>>
{

	private T val1;
	private T val2;
	private T val3;
	
//	 Parameterized Constructor to accept three value
	Generic(T val1,T val2,T val3)
	{
		this.val1=val1;
		this.val2=val2;
		this.val3=val3;
	}
//	 Generic Static method for testing 
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
//	Instance method 
	public T testMaximum()
	{
		return findMaximum(val1,val2,val3);
	}
//	Main method 
	public static void main(String[] args) {

	    Generic<Integer> intObj = new Generic<>(80, 10, 50);
	    Generic<Float> floatObj = new Generic<>(10f, 90f, 50f);
	    Generic<String> stringObj = new Generic<>("Apple", "Banana", "Peach");

	    System.out.println("Maximum Integer : " + intObj.testMaximum());
	    System.out.println("Maximum Float   : " + floatObj.testMaximum());
	    System.out.println("Maximum String  : " + stringObj.testMaximum());
	}
	
	
}

