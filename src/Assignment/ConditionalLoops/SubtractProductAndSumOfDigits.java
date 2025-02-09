package Assignment.ConditionalLoops;

import java.util.Scanner;

public class ProductAndSumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digits: ");
        int digit = sc.nextInt();
        int sum = 0, prod = 1;

        while(digit>0) {
            int p = digit % 10;
            sum = sum + p;
            prod = prod + p;
        }

        int result = prod - sum;
        System.out.println("product and sum of digits");
    }
}
