package CodeSheet;

public class A2BasicProgram {
    public static void main(String[] args){

        // This is a single-line comment

        /*
         This is a multi-line comment
         You can explain a block of code
         or give more details here
         */

        // Using print() - stays on the same line
        System.out.print("Hello");
        System.out.print(" World");

        // Using println() - moves to the next line
        System.out.println(); // Prints a blank line
        System.out.println("Java is awesome!");
        System.out.println("Let's learn more.");


        // A variable is a container used to store data.
        // Syntax: datatype variableName = value;
        int age = 25;  // Stores whole numbers, age is variable


        // DataType specifies the type of a variable and the kind of values it can hold.
        // primitive datatype
        // Whole Numbers
        byte myByte = 100;      // Range: -128 to 127 (1 byte)
        short myShort = 30000;  // Range: -32,768 to 32,767 (2 bytes)
        int myInt = 100000;     // Commonly used whole number type (4 bytes)
        long myLong = 15000000000L; // Large whole numbers, requires 'L' (8 bytes)

        // Decimal Numbers
        float myFloat = 5.75f;  // Less precision, requires 'f' suffix (4 bytes)
        double myDouble = 19.99; // More precise, default for decimals (8 bytes)

        // Boolean
        boolean myBool = true;  // Stores true/false (1 bit)

        // Character
        char myChar = 'A';      // Stores a single character (2 bytes)


        // NonPrimitive
        // String (Sequence of characters)
        String myText = "Hello, Java!";

        // Arrays (Collection of multiple values)
        int[] numbers = {1, 2, 3, 4, 5};


        // Declaring a char variable and assigning an integer value (ASCII code)
        char c = 65;
        System.out.println(c);  // Output: A
    }
}
