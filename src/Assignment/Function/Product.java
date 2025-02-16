package Assignment.Function;

import java.util.Scanner;

// Define a method that returns the product of two numbers entered by user.

public class Product {

    public static int product(int a, int b){
        return a * b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b =sc.nextInt();

        System.out.println(product(a, b));
    }
}
