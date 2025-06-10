package CodeSheet;

public class A7Method {

    public String greeting(){
        return "I do work and return string.";
    }

    public int sum(int a, int b){
        return a+b;
    }

    public static String information(){
        return "hey I belongs to class not instance coz I am static, same for all";
    }

    public static int add(int x, int y){
        return x+y;
    }
    public static void main(String[] args){

        A7Method method = new A7Method();

        System.out.println(method.greeting());

        System.out.println(method.sum(5,5));

        System.out.println("calling static method: " + information());

        System.out.println("calling static method: " + add(5, 5));
    }
}
