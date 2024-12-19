package CodeSheet;

import java.util.Scanner;

public class ScannerCls {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);

        String name;
        System.out.println("Enter your name");
        name = myobj.next();
        System.out.println(name);

    }
}
