package CodeSheet;

import java.util.function.Function;
public class MethodReference {
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Using Lambda Expression
        Function<Integer, Integer> lambdaFunction = num -> square(num);
        System.out.println("Lambda: " + lambdaFunction.apply(5));
        // Using Method Reference
        Function<Integer, Integer> methodRefFunction = MethodReference::square;
        System.out.println("Method Reference: " + methodRefFunction.apply(5));}
}

// Method Reference (::) are a shorthand way to refer to methods without executing them. They are used in lambda expressions to make code more readable and concise.

// Function<Integer, Integer> is a functional interface from the java.util.function package in Java. It represents a function that takes an Integer as input and returns an Integer as output.

//Lambda Expression: (num) -> Example.square(num) explicitly calls the method.
//Method Reference: Example::square is a shorthand that refers to the method directly.

