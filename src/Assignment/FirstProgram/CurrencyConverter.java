package Assignment.FirstProgram;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double exchangeRate = 132.0;

        System.out.print("Enter amount in Nepali Rupees (NPR): ");
        double npr = sc.nextDouble();

        double usd = npr / exchangeRate;

        System.out.println("Equivalent in USD: " + usd);
    }
}
