package javahomework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Pr6_NumberOddEven {
    public static void main(String[] args) {

        oddOrEven();
    }
    public static void oddOrEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        scanner.close();

        if ( num % 2 == 0 )

            System.out.println(num+" is an even number.");
        else
            System.out.println(num+" is an odd number.");
    }

}
