package collections;

/*
 * Program to find and print the maximum of multiple values
 * using Generic Methods, Varargs, and Comparable.
 */
import java.util.Arrays;

class Genericc<T extends Comparable<T>> {

    private T[] values;

    // Parameterised Constructor
    @SafeVarargs
	public Genericc(T... values) {
        this.values = values;
    }

    // Generic method to find maximum
    @SafeVarargs
	public static <T extends Comparable<T>> T findMaximum(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    // Generic method to print maximum
    @SafeVarargs
	public static <T extends Comparable<T>> void printMax(T... values) {
        T max = findMaximum(values);
        System.out.println("Maximum Value : " + max);
    }

    // Instance method
    public void testMaximum() {
        printMax(values);
    }
}

public class RefactoringUsingClassUC5 {

    public static void main(String[] args) {

        Genericc<Integer> intObj =
                new Genericc<>(20, 80, 10, 50, 90);

        Genericc<Float> floatObj =
                new Genericc<>(10.5f, 20.5f, 90.5f, 40.5f);

        Genericc<String> stringObj =
                new Genericc<>("Apple", "Banana", "Peach", "Orange");

        intObj.testMaximum();
        floatObj.testMaximum();
        stringObj.testMaximum();
    }
}
