package CodeSheet;

public class ExceptionHandling {
    public static void main(String[] args){
        try {
            // this will throw NumberFormatException
            int myInt = Integer.parseInt("hello");
        }
        catch (Exception e) {
            // this block handles the exception
            System.out.println("you cant");
        }
        finally {
            // this block always runs (whether exception occurs or not)
            System.out.println("finally block");
        }
    }
}
