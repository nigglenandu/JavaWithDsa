package Assignment.ConditionalLoops;

import java.util.Scanner;

//Area Of Circle Java Program
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        double area = Math.PI  * r * r;
        System.out.println("Area of circle= " + area);

        sc.close();
    }
}
