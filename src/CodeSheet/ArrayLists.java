package CodeSheet;

import java.util.*;

class ArrayLists {
    public static void main(String[] args){
        // Creating an ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        list.add(0);
        list.add(1);
        list.add(2);

        // Printing the ArrayList
        System.out.println(list);  // Output: [0, 1, 2]

        // Accessing an element by index
        int element = list.get(0);
        System.out.println(element);  // Output: 0

        // Adding an element at a specific index (3rd index)
        list.add(3, 3);
        System.out.println(list);  // Output: [0, 1, 2, 3]

        // Updating (replacing) an element at index 0
        list.set(0, 5);
        System.out.println(list);  // Output: [5, 1, 2, 3]

        // Removing an element at index 2
        list.remove(2);
        System.out.println(list);  // Output: [5, 1, 3]

        // Getting the size (total number of elements)
        int size = list.size();
        System.out.println(size);  // Output: 3

        // Looping through elements using a normal for loop
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));  // Prints elements one by one
        }
        System.out.println();

        // Sorting the ArrayList in ascending order
        Collections.sort(list);
        System.out.println(list);  // Output: [1, 3, 5]
    }
}
