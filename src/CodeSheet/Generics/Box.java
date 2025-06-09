package CodeSheet.Generics;

// Generic class that can work with any type T
class Box<T> {
    private T value;  // value of type T (T can be any type like Integer, String, etc.)

    // Setter method to set value
    public void setValue(T value) {
        this.value = value;
    }

    // Getter method to get value
    public T getValue() {
        return value;
    }
}