package CodeSheet.Lambda;

//A lambda expression in Java is a concise way to represent a method with a single expression,
// defined as (parameters) -> expression.
public class Lambda {
    public static void main(String[] args) {
        AdditionLambda additionLambda = (a, b) -> a + b;
        System.out.println("sum: " + additionLambda.add(5, 5));
    }
}

//Lambda expressions can only be used with functional interfaces (interfaces with a single abstract method).
//They replace anonymous class implementations for such interfaces.
//They are not general replacements for all anonymous classes, only for those that implement functional interfaces.
//They provide a more concise way to implement single-method interfaces.
//If an interface has multiple abstract methods, lambda expressions cannot be used.