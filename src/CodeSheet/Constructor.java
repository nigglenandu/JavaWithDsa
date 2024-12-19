package CodeSheet;

public class Constructor {
    int x = 5;

    public Constructor(int y){
        System.out.println("I am constructor " + y);
    }
    public static void main(String[] args){
        Constructor cons = new Constructor(10);

        System.out.println(cons.x);
    }
}
