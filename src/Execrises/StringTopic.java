package Execrises;

public class StringTopic {
    public static void main(String[] args) {

        String string = "NiggleNandu";
        System.out.println(string);

        int length = string.length();
        System.out.println("length= " + length);

        String lowerCase = string.toLowerCase();
        System.out.println("lowercase= " + lowerCase);

        String upperCase = string.toUpperCase();
        System.out.println("UpperCase= " + upperCase);

        int index = string.indexOf("a");
        System.out.println("Index= " + index);

        String firstName = "Niggle";
        String secondName = "Nandu";
        System.out.println("Concat= " + firstName + secondName);
        System.out.println("concat= " + firstName.concat(secondName));

        System.out.println(" \" \' \\ ");
        System.out.println("my name \nis \t niggle");

    }
}
