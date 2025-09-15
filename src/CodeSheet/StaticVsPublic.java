package CodeSheet;

public class StaticVsPublic {

    // static method → belongs to the class, can be called without creating an object
    static void myStaticMethod(){
        System.out.println("I am static method so I don't need obj.");
    }

    // public (non-static) method → needs an object to call it
    public void myPublicMethod(){
        System.out.println("I am public, so call me from object");
    }

    public static void main(String[] args){
        // calling static method directly (no object required)
        myStaticMethod();

        // creating object to call non-static (public) method
        StaticVsPublic obj = new StaticVsPublic();
        obj.myPublicMethod();
    }
}
