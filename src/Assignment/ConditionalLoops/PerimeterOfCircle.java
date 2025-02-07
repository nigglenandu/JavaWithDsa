package Assignment.ConditionalLoops;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float pie = 3.14F;
        System.out.println("Enter length of circle: ");
        float r = sc.nextFloat();
        float perimeter = 2 * pie * r;
        System.out.println("perimeter= " + perimeter);

    }
}
