package CodeSheet;

public class Lambda {
    public static void main(String[] args) {
        AdditionLambda additionLambda = (a, b) -> a + b;
        System.out.println("sum: " + additionLambda.add(5, 5));
    }
}
