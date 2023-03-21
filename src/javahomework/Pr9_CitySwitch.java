package javahomework;
/**
 * Using Switch statement
 */

import java.util.Scanner;

public class Pr9_CitySwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter City name start from A to F");
        char name = scanner.next().charAt(0);
        scanner.close();

        switch (name) {
            case 'A' :
                System.out.println("Ahmedabad");
                break;

            case 'B':
                System.out.println("Baroda");
                break;

            case 'C':
                System.out.println("Colcutta");
                break;

            case 'D':
                System.out.println("Delhi");
                break;

            case 'E':
                System.out.println("East");
                break;

            case 'F':
                System.out.println("Faridabad");
                break;

            default:
                System.out.println("Invalid Character");
        }
    }
}
