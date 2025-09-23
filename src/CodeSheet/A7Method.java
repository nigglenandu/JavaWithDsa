package CodeSheet;

public class A7Method {

    // Instance method (needs object to call)
    public String greeting() {
        return "I do work and return string.";
    }

    // Instance method with parameters
    public int sum(int a, int b) {
        return a + b;
    }

    // Static method (belongs to class, no object required)
    public static String information() {
        return "Hey, I belong to class not instance coz I am static, same for all.";
    }

    // Static method with parameters
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        // Creating object to call instance methods
        A7Method method = new A7Method();

        // Calling instance methods
        System.out.println(method.greeting());     // Output: I do work and return string.
        System.out.println(method.sum(5, 5));      // Output: 10

        // Calling static methods (no object needed)
        System.out.println("Calling static method: " + information()); // Direct call
        System.out.println("Calling static method: " + add(5, 5));     // Output: 10
    }
}
