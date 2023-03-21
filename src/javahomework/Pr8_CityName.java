package javahomework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their
 * city name accordingly (use if else) if any other
 * alphabet should be invalid entry
 */
public class Pr8_CityName {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input an alphabet from A to F > ");
            String alphabet = scanner.next() ;
            scanner.close();

            if("A".equals(alphabet)){
                System.out.println("Ahmedabad");
            }else if("B".equals(alphabet)){
                System.out.println("Baroda");
            }else if("C".equals(alphabet)){
                System.out.println("Colcutta");
            }else if("D".equals(alphabet)){
                System.out.println("Delhi");
            }else if("E".equals(alphabet)){
                System.out.println("East");
            }else if("F".equals(alphabet)){
                System.out.println("Faridabad");
            }else {
                System.out.println("Invalid entry.");
            }

        }

    }


