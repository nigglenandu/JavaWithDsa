package CodeSheet;

// A simple class with two fields (x and y)
public class FirstCls {
    int x = 5;
    int y = 4;
}

// Another class with main() method to run the program
class SecondCls {
    public static void main(String[] args) {
        // Create object of FirstCls
        FirstCls firstObj = new FirstCls();

        // Access fields (x and y) using object
        System.out.println(firstObj.x + firstObj.y);  // Output: 9

        // Modify value of x
        firstObj.x = 4;

        // Print updated value of x
        System.out.println(firstObj.x);  // Output: 4
    }
}
