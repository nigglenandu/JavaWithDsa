package CodeSheet;

/* Overriding

1) Types of polymorphism.
2) Runtime polymorphism exist in run time that is JVM.
3) parent class and sub class having same method name, same parameter or same return type.
4) must have inheritance property.
 */

class Animal{
    void eat(){
        System.out.println("I am animal and I can eat");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("I am dog and I eat meat");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("I am cat and I eat milk");
    }
}
public class Overriding {
    public static void main(String[] args){
        Animal pet = new Dog();
        pet.eat();

        pet = new Cat();
        pet.eat();
    }
}

