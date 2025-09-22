package CodeSheet;

import java.util.Scanner;

public class A5ScannerCls {
    public static void main(String[] args) {
        // Create Scanner object to take input from keyboard
        Scanner myobj = new Scanner(System.in);

        String name;  // variable to store input

        System.out.println("Enter your name: "); // ask user for input
        name = myobj.next(); // takes input (only one word, stops at space)

        System.out.println("Your name is: " + name);

        myobj.close(); // always close Scanner after use
    }
}
