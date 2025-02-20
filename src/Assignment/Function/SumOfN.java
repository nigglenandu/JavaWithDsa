package Assignment.Function;

import java.util.Scanner;

// Write a function that returns the sum of first n natural numbers.
public class SumOfN {

    public static long sum(long num){
        if (num < 0) {
            System.out.println("Invalid input! Enter a non-negative number.");
            return 0;
        }
        return num * (num+1)/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long num = sc.nextLong();

        System.out.println("Sum: " + sum(num));

        sc.close();
    }
}
