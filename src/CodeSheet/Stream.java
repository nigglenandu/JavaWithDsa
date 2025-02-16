package CodeSheet;

import java.util.Arrays;
import java.util.List;

// A Stream in Java is a sequence of elements supporting functional-style operations like filtering, mapping, and reducing without modifying the original data.

public class Stream {
    public static void main(String[] args) {
        // Creating a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtering even numbers and collecting them into a new list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // Intermediate operation
                .toList(); // Terminal operation

        System.out.println("Even Numbers: " + evenNumbers);

        // Mapping: Squaring each number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n) // Intermediate operation
                .toList(); // Terminal operation

        System.out.println("Squared Numbers: " + squares);

        // Reducing: Finding sum of all numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Terminal operation

        System.out.println("Sum of all numbers: " + sum);
    }
}