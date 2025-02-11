package Assignment.ConditionalLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter non negative number for factorial: ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
        sc.close();
    }
}
