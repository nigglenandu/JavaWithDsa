package CodeSheet;

import java.util.LinkedList;

public class LinkedlistCollection {
    public static void main(String[] args){
        // create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<String>();

        // add elements at the beginning
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");

        // add element at the end (default add = addLast)
        list.add("list");

        System.out.println(list);  // [this, is, a, list]

        // size of linked list
        System.out.println(list.size());  // 4

        // iterate through elements using for loop
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + " -> ");
        }
        System.out.println("null");  // marks the end like in linked list diagrams

        // remove first element
        list.removeFirst();
        System.out.println(list);  // [is, a, list]

        // remove last element
        list.removeLast();
        System.out.println(list);  // [is, a]

        // remove element at index 3 (will throw error if index not valid)
        list.remove(3);
        System.out.println(list);
    }
}
