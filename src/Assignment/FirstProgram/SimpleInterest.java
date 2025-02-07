package Assignment.FirstProgram;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float principal = sc.nextFloat();

        if(principal < 0){
            System.out.println("Error: principle cant be negative");
            return;
        }

        System.out.print("Enter Time (in year): ");
        float time = sc.nextFloat();

        if(time < 0){
            System.out.println("Error: time cant be negative");
        return;
        }

        System.out.print("Enter Rate (in % per annum): ");
        float rate = sc.nextFloat();

        if(rate < 0){
            System.out.println("Error: rate cant be negative");
            return;
        }

        float simpleInterest = (principal * time * rate)/100;

        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}
