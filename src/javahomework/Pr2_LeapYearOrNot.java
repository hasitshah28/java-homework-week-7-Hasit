package javahomework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Pr2_LeapYearOrNot {
    public static void main(String[] args) {
      //  int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        int year = scan.nextInt();
        scan.close();
        boolean leap = false;

        //if the year is divided by 4
        if(year % 4 == 0)
        {
            //If the year is century
            if( year % 100 == 0) {

                //If the year is divided by 400 then it is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            //If the year is not century
            else
                leap = true;
        }
        else {
            leap = false;
        }

        if(leap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }

}
