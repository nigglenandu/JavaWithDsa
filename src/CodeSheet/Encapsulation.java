package CodeSheet;

public class Encapsulation {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Main{
    public static void main(String[] args){
        Encapsulation encap = new Encapsulation();
        encap.setName("niggle");
        System.out.println(encap.getName());
    }
}
