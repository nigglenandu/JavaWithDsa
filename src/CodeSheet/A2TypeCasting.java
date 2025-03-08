package CodeSheet;

public class A2TypeCasting {
    public static void main(String[] args) {

        // Widening (Implicit) Type Casting: int to float
        int numInt = 50;
        float numFloat = numInt; // Automatically converts int to float

        System.out.println("Widening Type Casting (int to float):");
        System.out.println("Integer value: " + numInt);
        System.out.println("Converted to Float: " + numFloat);


        // Narrowing (Explicit) Type Casting: float to int
        float decimalFloat = 45.78f;
        int intValue = (int) decimalFloat; // Manually casting float to int

        System.out.println("\nNarrowing Type Casting (float to int):");
        System.out.println("Float value: " + decimalFloat);
        System.out.println("Converted to Integer (Decimal part lost): " + intValue);


        // Char to int (ASCII conversion)
        char letter = 'A';
        int asciiValue = (int) letter;

        System.out.println("\nCharacter to Integer Casting:");
        System.out.println("Character: " + letter);
        System.out.println("ASCII Value: " + asciiValue);

    }
}