package CodeSheet;

public class A6Loop {
    public static void main(String[] args) {

        // for loop: prints 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // new line

        // while loop: prints 1 to 10
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println(); // new line

        // do-while loop: prints 1 to 10
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 10);
    }
}
