package CodeSheet;

public class A3Operators {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition // 15
        System.out.println("a - b = " + (a - b));  // Subtraction // 5
        System.out.println("a * b = " + (a * b));  // Multiplication // 50
        System.out.println("a / b = " + (a / b));  // Division // 2
        System.out.println("a % b = " + (a % b));  // Modulus (Remainder) // 0

        // 2. Assignment Operators
        int x = 10;
        System.out.println("\nAssignment Operators:");
        x += 5;  // x = x + 5
        System.out.println("x += 5 → x = " + x); // 15
        x -= 2;  // x = x - 2
        System.out.println("x -= 2 → x = " + x); // 13
        x *= 3;  // x = x * 3
        System.out.println("x *= 3 → x = " + x); // 39
        x /= 2;  // x = x / 2
        System.out.println("x /= 2 → x = " + x); // 19
        x %= 3;  // x = x % 3
        System.out.println("x %= 3 → x = " + x); // 1

        // 3. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a > b: " + (a > b));    // true
        System.out.println("a < b: " + (a < b));    // false
        System.out.println("a >= b: " + (a >= b));  // true
        System.out.println("a <= b: " + (a <= b));  // false

        // 4. Logical Operators
        boolean bool1 = true, bool2 = false;
        System.out.println("\nLogical Operators:");
        System.out.println("bool1 && bool2: " + (bool1 && bool2));  // false
        System.out.println("bool1 || bool2: " + (bool1 || bool2));  // true
        System.out.println("!bool1: " + (!bool1));  // false

        // 5. Bitwise Operators
        int m = 5, n = 3;  // 5 = 0101, 3 = 0011 (in binary)
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n = " + (m & n));  // 1
        System.out.println("m | n = " + (m | n));  // 7
        System.out.println("m ^ n = " + (m ^ n));  // 6
        System.out.println("~m = " + (~m));  // -6
        System.out.println("m << 1 = " + (m << 1));  // 10
        System.out.println("m >> 1 = " + (m >> 1));  // 2
        System.out.println("m >>> 1 = " + (m >>> 1));  // 2

        // 6. Unary Operators
        int p = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("p = " + p); // 10
        System.out.println("++p = " + (++p));  // 11 (Pre-increment)
        System.out.println("p++ = " + (p++));  // 11 (Post-increment)
        System.out.println("p after p++ = " + p); // 12
        System.out.println("--p = " + (--p));  // 11 (Pre-decrement)
        System.out.println("p-- = " + (p--));  // 11 (Post-decrement)
        System.out.println("p after p-- = " + p); // 10

        // 7. Ternary Operator
        int num1 = 20, num2 = 30;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println("\nTernary Operator:");
        System.out.println("Smaller number: " + min); // 20

        // 8. instanceof Operator
        String str = "Hello";
        System.out.println("\ninstanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String)); // true
    }

}
