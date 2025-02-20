package CodeSheet;

public class ExceptionHandling {
    public static void main(String[] args){
        try{
            int myInt = Integer.parseInt("hello");
        }
        catch (Exception e){
            System.out.println("you cant");
        }
        finally{
            System.out.println("finally block");
        }
    }
}
