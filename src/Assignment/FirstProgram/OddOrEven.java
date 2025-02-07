package Assignment.FirstProgram;

import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
public class OddOrEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
        sc.close();
    }
}
