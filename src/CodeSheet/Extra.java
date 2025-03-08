package CodeSheet;

import java.util.Scanner;

public class Extra {
    public static void  main(String[] args){

        // type casting
        //implicit casting (java le automatic) sano bata thulo ma lane
        int num = 10; //sano bhada
        float floatNum = num;  // thulo bhada
        System.out.println(floatNum);


        //explicit casting (we need to change) thulo bata sano ma lane
        float num1 = 10.99f;  // thulo bhada
        int intNum = (int) num1;  // sano bhada
        System.out.println(intNum);


        // operators
        int a = 5;
        int b = 2;

        int add = a+b;
        System.out.println(add);

        int sub = a-b;
        System.out.println(sub);

        int modulus = a%b; // output 1
        System.out.println(modulus);

        System.out.println(++a); // 1+a = 6
        System.out.println(--a); // 1-a = 5
    }
}
