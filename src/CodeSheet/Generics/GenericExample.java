package CodeSheet.Generics;

// Main class to test the generic code
public class GenericExample {
    public static void main(String[] args) {

        // 🔹 Using generic class Box with String type
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println("String Value: " + stringBox.getValue());

        // 🔹 Using generic class Box with Integer type
        Box<Integer> intBox = new Box<>();
        intBox.setValue(123);
        System.out.println("Integer Value: " + intBox.getValue());

        // 🔹 Using generic method to print array of different types
        String[] names = {"Alice", "Bob", "Charlie"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println("\nPrinting String Array:");
        Printer.printArray(names);  // printing string array

        System.out.println("\nPrinting Integer Array:");
        Printer.printArray(numbers);  // printing integer array
    }
}