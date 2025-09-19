package CodeSheet;

// Encapsulation → wrapping variables (data) with methods (getters & setters)
public class Encapsulation {
    // private variable (cannot be accessed directly outside class)
    private String name;

    // Getter → used to access private variable
    public String getName(){
        return name;
    }

    // Setter → used to modify private variable
    public void setName(String name){
        this.name = name;
    }
}

// Main class to test encapsulation
class Main {
    public static void main(String[] args){
        Encapsulation encap = new Encapsulation();

        // Setting value using setter
        encap.setName("niggle");

        // Getting value using getter
        System.out.println(encap.getName());
    }
}