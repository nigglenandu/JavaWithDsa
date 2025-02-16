package Assignment.Function;

import java.util.Scanner;

public class PrimeOrNot {

    public static String primeOrNot(int num){
        if(num <= 1){
            return "It is not a prime number";
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return "It is not a prime number";
            }
        }
            return "It is a prime number";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(primeOrNot(num));
    }
}
