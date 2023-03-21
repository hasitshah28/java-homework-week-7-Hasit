package javahomework;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Pr1_InputNoOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input number");
        int number = scanner.nextInt();
        scanner.close();

        String result = number%2 ==0 ? "Even"  : "Odd"; // Ternary operator
        System.out.println(number + " is "+ result);

    }
}
