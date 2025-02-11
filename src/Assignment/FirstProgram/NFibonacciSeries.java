package Assignment.FirstProgram;

import java.util.Scanner;

// Input currency in rupees and output in USD.
public class NFibonacciSeries {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter nth term: ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Invalid Input, Please Enter positive number");
            return;
        }

        int a=0, b=1, c;

        if(n == 1){
            System.out.println(a);
        }

        if(n>=2) {
            System.out.println("Fibonacci Series up to " + n + " terms:");
            System.out.println(a);
            System.out.println(b);
        }

        for(int i = 3; i<=n; i++) {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
