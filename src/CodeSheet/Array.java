package CodeSheet;

public class Array {
    public static void main(String[] args) {

        // Declaring and initializing an array of Strings
        String[] names = {"Niggle", "Nandu", "John", "Kurt"};

        // Printing the first element of the array
        System.out.println(names[0]);  // Output: Niggle

        // Printing all elements using a for loop
        for(int i = 0; i <= 3; i++){
            System.out.println(names[i]);  // prints each name one by one
        }

        // Printing all elements using a for-each loop (enhanced for loop)
        for(String i : names){
            System.out.println(i);  // easier and cleaner way to loop through array
        }

        // Replacing an element at index 2 (i.e., "John" becomes "Harry")
        names[2] = "Harry";
        System.out.println("name replaced: " + names[2]);  // Output: Harry

        // Printing the total number of elements in the array
        System.out.println("length: " + names.length);  // Output: 4
    }
}
