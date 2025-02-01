package Assignment.FlowOfProgram;

import java.util.Scanner;

// Input a year and find whether it is a leap year or not.
public class LeapYearOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int days = sc.nextInt();

        if (days % 4 == 0) {
            if(days % 100 != 0  || days % 400 == 0) {
                System.out.println(days + " is leap year.");
            } else {
                System.out.println(days + " is not leap year.");
            }
            System.out.println(days + " is leap year.");
        } else {
            System.out.println(days + " is not leap year.");
        }
    }
}
