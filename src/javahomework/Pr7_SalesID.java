package javahomework;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission
 * Sales amount >= 50,000
 * 35% Sales amount >= 30,000
 * 20% >= 20,000
 * 10% >= 10,000
 * 5% < 10,000 2%
 */
public class Pr7_SalesID {
    public static void main(String[] args) {
        int id;
        String sName;
        double sAmount, bSalary;
        double commission,commissionPer;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter sales id");
        id = scr.nextInt();
        System.out.println("Enter Seller's Name");
        sName = scr.next();
        System.out.println("Enter sales amount");
        sAmount = scr.nextDouble();
        System.out.println("Enter Salary basic");
        bSalary = scr.nextDouble();
        scr.close();
        //commission = (commissionPer/100)*sAmount;
        if (sAmount >= 50000.00){
            System.out.println("commission is:" + (0.35*sAmount));
        }else if (sAmount >=30000.00) {
            System.out.println("commission is:"  + (0.20*sAmount));
        } else if (sAmount >= 20000.00){
            System.out.println("commission is:"  + (0.10*sAmount));
        }else if (sAmount >=10000.00){
            System.out.println("commission is:" + (0.05*sAmount ));
        }else if(sAmount <10000.00){
            System.out.println("commission is:"  + (0.02*sAmount));
        }
    }
}
