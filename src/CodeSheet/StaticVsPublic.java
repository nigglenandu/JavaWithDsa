package CodeSheet;

public class StaticVsPublic {
    static void myStaticMethod(){
        System.out.println("I am static method so i don't need obj.");
    }

    public void myPublicMethod(){
        System.out.println("i am public so call me from object");
    }

    public static void main(String[] args){
        myStaticMethod();

        StaticVsPublic obj = new StaticVsPublic();
        obj.myPublicMethod();
    }
}
