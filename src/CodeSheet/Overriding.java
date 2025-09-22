package CodeSheet;

/* Overriding

1) Types of polymorphism.
2) Runtime polymorphism exist in run time that is JVM.
3) parent class and sub class having same method name, same parameter or same return type.
4) must have inheritance property.
 */

// Parent class
class Animal {
    // Method to be overridden
    void eat() {
        System.out.println("I am animal and I can eat");
    }
}

// Child class Dog overriding eat() method
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("I am dog and I eat meat");
    }
}

// Child class Cat overriding eat() method
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("I am cat and I eat milk");
    }
}

public class   Overriding {
    public static void main(String[] args) {
        // Reference is of type Animal, object is Dog
        // Runtime polymorphism → Dog's eat() is called
        Animal pet = new Dog();
        pet.eat();   // Output: I am dog and I eat meat

        // Now same reference points to Cat object
        // Runtime polymorphism → Cat's eat() is called
        pet = new Cat();
        pet.eat();   // Output: I am cat and I eat milk
    }
}
