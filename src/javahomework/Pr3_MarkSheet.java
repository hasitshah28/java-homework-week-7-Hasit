package javahomework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks
 * should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade
 * if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 *  _______________________________
 * |                               |
 * |            Mark Sheet          |
 * |_______________________________|
 * |       Name         :      Jay |
 * |       Roll No      :       08 |
 * |_______________________________|
 * |       Subjects     :   Marks |
 * |_______________________________|
 * |        Math        :      98  |
 * |        Science     :      90  |
 * |        English     :      85  |
 * |_______________________________|
 * |        Total       :      273 |
 * |_______________________________|
 * |        Percentage  :      91.0 |
 * |        Result      :       Pass |
 * |        Grade       :        A+ |
 * |_______________________________|
 */
public class Pr3_MarkSheet {
    public static void main(String[] args) {
        Pr3_MarkSheet obj = new Pr3_MarkSheet();
        obj.marksheet();
    }
    static String Result;
    static String Grade;

    public void marksheet() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  Student Name");
        String name = input.nextLine();
        System.out.println("Enter roll number");
        int num = input.nextInt();
        System.out.println("Enter marks in Maths:");
        int m = input.nextInt();
        if (m > 0 && m <= 100) {
        } else {
            System.out.println("Invalid Input");
        }

        System.out.println("Enter marks in Science:");
        int s = input.nextInt();
        if (s > 0 && s <= 100) {
        } else {
            System.out.println("Invalid Input");
        }

        System.out.println("Enter marks in English:");
        int e = input.nextInt();
        if (e >= 0 && e <= 100) {
        } else {
            System.out.println("Invalid Input");
        }

        input.close();
        int total = m + s + e;
        System.out.println("Total Marks : " + total);
        float percentage = ((total * 100) / 300);
        System.out.println("Percentage : " + percentage);


        if (percentage >= 80) {
            Grade = "A+";
            Result = "Pass";
        } else if (percentage >= 60) {
            Grade = "A";
            Result = "Pass";
        } else if (percentage >= 50) {
            Grade = "B";
            Result = "Pass";
        } else if (percentage >= 35) {
            Grade = "C";
            Result = "Pass";
        } else
            Result = "Fail";
        Grade = "Fail";

        System.out.println("|____________________________________|");
        System.out.println("|          Mark Sheet                |");
        System.out.println("|____________________________________|");
        System.out.println("| Name          :     " + name + "   |");
        System.out.println("| Roll No.      :      " + num + "   |");
        System.out.println("| Subjects      :      Marks         |");
        System.out.println("|____________________________________|");
        System.out.println("| Maths         :   " + m +         "|");
        System.out.println("| Science       :   " + s +         "|");
        System.out.println("| English       :   " + e +         "|");
        System.out.println("|____________________________________|");
        System.out.println("| Total         :   " + total +     "|");
        System.out.println("|____________________________________|");
        System.out.println("| Percentage    : " + percentage +  "|");
        System.out.println("| Result        :   " + Result + "   |");
        System.out.println("| Grade         :   " + Grade + "    |");
        System.out.println("_____________________________________|");
    }
}

