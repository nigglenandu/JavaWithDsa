package Assignment.Function;

import java.util.Scanner;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class CircumferenceAreaOfCircle {

    public static double circumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static double area(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.printf("circumference:  %.2f%n", circumference(radius));
        System.out.printf("area: %.2f%n", area(radius));

        sc.close();
    }
}
