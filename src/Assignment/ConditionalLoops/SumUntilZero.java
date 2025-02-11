package Assignment.ConditionalLoops;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter zero to stop: ");
        int sum = 0;

        while(true) {
            int n = sc.nextInt();
            if (n==0) {
                break;
            }
            sum += n;
        }
        System.out.println("sum:" + sum);
        sc.close();
    }
}
