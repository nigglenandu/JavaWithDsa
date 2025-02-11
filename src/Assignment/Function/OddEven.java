package Assignment.Function;

import java.util.Scanner;

public class OddEven {

    public String checkOddOrEven(int a){
        return (a%2 != 0)? "Odd" : "Even";
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        OddEven oddOrEven = new OddEven();
        String check = oddOrEven.checkOddOrEven(a);

        System.out.println("The number" + a + "is " + check);

        sc.close();
    }
}
