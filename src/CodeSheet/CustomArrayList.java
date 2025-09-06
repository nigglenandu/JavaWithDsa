package CodeSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;                // internal array to store elements
    private static int DEFAULT_SIZE = 10; // default initial capacity
    private int size = 0;              // number of elements in list

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE]; // create array with default size
    }

    // add element to list
    public void add(int num){
        if(isFull()){      // check if array is full
            resize();      // double the size
        }
        data[size++] = num; // insert element then increase size
    }

    // resize array (double the capacity)
    private void resize() {
        int[] temp = new int[data.length * 2];  // new bigger array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];  // copy old values
        }
        data = temp;  // assign new array
    }

    // check if array is full
    private boolean isFull() {
        return size == data.length;
    }

    // remove last element and return it
    public int remove() {
        int removed = data[--size]; // decrease size then return last element
        return removed;
    }

    // get element at index
    public int get(int index) {
        return data[index];
    }

    // return number of elements
    public int size() {
        return size;
    }

    // set element at index
    public void set(int index, int value){
        data[index] = value;
    }

    // toString for printing
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args){
        // testing custom ArrayList
        CustomArrayList list = new CustomArrayList();

        for(int i = 0; i < 14; i++){
            list.add(2 * i); // add even numbers
        }

        System.out.println(list);

        // example using normal Java ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add("dfsfs"); // not allowed because it expects Integer
    }
}
