package Assignment.Function;

import java.util.Scanner;

public class FactorialNumber {
    public static int factorial(int num){
        int result = 1;

        for(int i = 1; i <= num; i++){
            result = result * i;
        }

        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(factorial(num));

        sc.close();
    }
}
