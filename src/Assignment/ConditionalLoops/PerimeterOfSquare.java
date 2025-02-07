package Assignment.ConditionalLoops;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of square: ");
        int l = sc.nextInt();
        int perimeter = 4 * l;
        System.out.println("perimeter= " + perimeter);
    }
}
