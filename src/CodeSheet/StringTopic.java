package CodeSheet;

public class StringTopic {
    public static void main(String[] args) {

        // Creating a String
        String string = "NiggleNandu";
        System.out.println(string);

        // length() → returns number of characters
        int length = string.length();
        System.out.println("length= " + length);

        // toLowerCase() → converts to lowercase
        String lowerCase = string.toLowerCase();
        System.out.println("lowercase= " + lowerCase);

        // toUpperCase() → converts to uppercase
        String upperCase = string.toUpperCase();
        System.out.println("UpperCase= " + upperCase);

        // indexOf() → finds index of first occurrence of a character
        int index = string.indexOf("a");
        System.out.println("Index= " + index);

        // Concatenation of Strings
        String firstName = "Niggle";
        String secondName = "Nandu";

        // Using + operator
        System.out.println("Concat= " + firstName + secondName);

        // Using concat() method
        System.out.println("concat= " + firstName.concat(secondName));

        // Escape characters in Strings
        System.out.println(" \" \' \\ ");   // prints: " ' \
        System.out.println("my name \nis \t niggle");  // newline and tab
    }
}
