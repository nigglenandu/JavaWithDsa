package CodeSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {   // generic class with type parameter T

    private Object[] data;             // internal array (stores elements as Object)
    private static int DEFAULT_SIZE = 10;
    private int size = 0;              // number of elements

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE]; // create array with default size
    }

    // add element of type T
    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    // double the size of array when full
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    // check if array is full
    private boolean isFull() {
        return size == data.length;
    }

    // remove last element and return it
    public T remove() {
        T removed = (T)(data[--size]);  // type cast Object to T
        return removed;
    }

    // get element at index
    public T get(int index) {
        return (T)data[index];          // type cast Object to T
    }

    // return current size
    public int size() {
        return size;
    }

    // replace value at index
    public void set(int index, T value){
        data[index] = value;
    }

    // print array contents
    public String toString() {
        return "CustomGenArrayList{" + "data=" +
                Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        // Using without generics (raw type) - not type safe
        CustomGenArrayList list = new CustomGenArrayList();

        // Normal Java ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();

        // Using our generic CustomGenArrayList
        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        for(int i = 0; i < 14; i++){
            list3.add(2 * i);   // add even numbers
        }
        System.out.println(list3);
    }
}
