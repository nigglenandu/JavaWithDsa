package Assignment.ConditionalLoops;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter breath of Rectangle: ");
        int b = sc.nextInt();
        int perimeter = 2 * (l+b);
        System.out.println("perimeter= " + perimeter);
    }
}
