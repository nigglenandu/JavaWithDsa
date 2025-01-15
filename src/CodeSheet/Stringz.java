package mynote;

import java.util.Arrays;

public class Stringz {
    public static void main(String[] args){
                // Creation
                String str1 = "Hello";
                String str2 = new String("World");

                // Concatenation
                String greeting = str1 + ", " + str2 + "!";
                System.out.println("Concatenation: " + greeting);  // "Hello, World!"

                // Conversion
                int number = 123;
                String strNumber = String.valueOf(number);
                System.out.println("Conversion to String: " + strNumber);  // "123"

                String strNum = "456";
                int num = Integer.parseInt(strNum);
                System.out.println("Conversion to int: " + num);  // 456

                // Changing Case
                String lowerStr = greeting.toLowerCase();
                System.out.println("Lowercase: " + lowerStr);  // "hello, world!"

                String upperStr = greeting.toUpperCase();
                System.out.println("Uppercase: " + upperStr);  // "HELLO, WORLD!"

                // Character Extraction
                char ch = greeting.charAt(1);
                System.out.println("Character at index 1: " + ch);  // 'e'

                // Comparison
                boolean isEqual = str1.equals("Hello");
                System.out.println("Equals: " + isEqual);  // true

                boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello");
                System.out.println("Equals Ignore Case: " + isEqualIgnoreCase);  // true

                int compareResult = str1.compareTo("Hello");
                System.out.println("Compare To: " + compareResult);  // 0

                // Searching Strings
                boolean contains = greeting.contains("World");
                System.out.println("Contains 'World': " + contains);  // true

                int indexOfWorld = greeting.indexOf("World");
                System.out.println("Index of 'World': " + indexOfWorld);  // 7

                boolean startsWithHello = greeting.startsWith("Hello");
                System.out.println("Starts with 'Hello': " + startsWithHello);  // true

                boolean endsWithExclamation = greeting.endsWith("!");
                System.out.println("Ends with '!': " + endsWithExclamation);  // true

                // Modifying Strings
                String subStr = greeting.substring(7, 12);
                System.out.println("Substring: " + subStr);  // "World"

                String replacedStr = greeting.replace("World", "Java");
                System.out.println("Replaced String: " + replacedStr);  // "Hello, Java!"

                String trimmedStr = "  Hello, World!  ".trim();
                System.out.println("Trimmed String: " + trimmedStr);  // "Hello, World!"

                String[] words = greeting.split(", ");
                System.out.println("Split String: " + Arrays.toString(words));  // ["Hello", "World!"]
            }
        }
