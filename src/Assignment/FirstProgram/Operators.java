package Assignment.FirstProgram;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();

        

        int add = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println("addition = " + add + "\n subtraction = " + sub + "\n multiplication = " + multiply  + "\n division = " + divide);
    }
}