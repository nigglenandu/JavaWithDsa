package CodeSheet.Generics;

// Generic method to print array elements of any type
class Printer {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
