package Assignment.Function;

import java.util.Scanner;

// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class VotingAge {
    int age;
    static String eligible(int age){
        if(age >= 18){
            return "Eligible to vote";
        } else {
            return "Not eligible to vote";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println(eligible(age));
    }
}
