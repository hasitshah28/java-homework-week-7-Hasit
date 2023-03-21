package javahomework;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and
 * Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip                  |
 * |______________________________|
 * | Employee Id        : 2564    |
 * | Employee Name      : Jay     |
 * |______________________________|
 * | Basic Salary       : 25000.0 |
 * | HRA 10%            : 2500.0  |
 * | TA 8%              : 2250.0  |
 * | DA 9%              : 2000.0  |
 * | PF - 20&           : 5000.0  |
 * |______________________________|
 * | Gross Salary       : 26750.0 |
 * |===========================   |
 */

import java.util.Scanner;

public class Pr5_GrossSalary {
    public static void main(String[] args) {
        myPaySlip();
    }
    public static void myPaySlip() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int a = scanner.nextInt();
        System.out.println("Enter employee name: ");
        String name = scanner.next();
        System.out.println("Enter employee basic salary: ");
        int c = scanner.nextInt();
        scanner.close();
        float HRM = (c * 10) / 100;
        float DA = (c * 8) / 100;
        float TA = (c*9)/100;
        float PF = (c*20)/100;
        float grossSalary = c + HRM + TA - PF;

        System.out.println(" _______________________________");
        System.out.println(" |        Salary Slip          |");
        System.out.println(" |_____________________________|");
        System.out.println(" | Employee Id :         " + a +"    |");
        System.out.println(" | Employee Name :       "+name+ "   |");

        System.out.println(" |_____________________________|");
        System.out.println(" | Basic Salary :      " + c +"   |");
        System.out.println(" | HRA 10% :           " + HRM + "  |");
        System.out.println(" | TA 8% :             " + TA +"  |");
        System.out.println(" | DA 9% :             " + DA +"  |");
        System.out.println(" | PF - 20& :          " + PF + " |");
        System.out.println(" |_____________________________|");
        System.out.println(" | Gross Salary :    "+grossSalary+"   |");
        System.out.println(" |=============================|");

    }

}
