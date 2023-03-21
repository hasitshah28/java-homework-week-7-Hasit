package javahomework;

/**
 * Write a Java program to sum values of an array.
 */
public class Pr18_ValuesArray {
    public static void main(String[] args) {

        // create an array
        double[] array = {1, 2, 3, 4, 5, 6,4};
        // getting array length
        double length = array.length;
        // default sum value.
        double sum = 0;
        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of array : " + sum);
    }
}
