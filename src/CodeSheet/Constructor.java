package CodeSheet;

public class Constructor {
    int x = 5;   // instance variable with default value 5

    // constructor: runs automatically when object is created
    public Constructor(int y){
        System.out.println("I am constructor " + y);
    }

    public static void main(String[] args){
        // creating object, constructor will be called
        Constructor cons = new Constructor(10);

        // printing value of instance variable x
        System.out.println(cons.x);  // Output: 5
    }
}
