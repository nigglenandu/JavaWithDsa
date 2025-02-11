package Assignment.Function;

import java.util.Scanner;

public class MinMaxNum {
    public int max(int a, int b, int c){
       return Math.max(a, Math.max(b,c));
    }

    public int min(int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        MinMaxNum minMaxNum = new MinMaxNum();

        int maxValue = minMaxNum.max(a, b, c);

        int minValue = minMaxNum.min(a, b, c);

        System.out.println("maximum: "  + maxValue);
        System.out.println("minimum: " + minValue);

        sc.close();
    }
}


