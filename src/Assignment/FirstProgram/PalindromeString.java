package Assignment.FirstProgram;

import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}
