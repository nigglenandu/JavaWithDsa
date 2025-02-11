package Assignment.FirstProgram;

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int rem,  sum = 0;
        while(num>0){
            rem = num%10;
            num = num/10;
            sum = sum + rem  * rem * rem;
        }

        if(temp == sum){
            System.out.println("It is a Armstrong number");
        } else{
            System.out.println("It is not a Armstrong number");
        }
    }
}
