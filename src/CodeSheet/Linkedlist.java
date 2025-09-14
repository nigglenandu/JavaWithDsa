package CodeSheet;

// Custom implementation of Singly Linked List
public class Linkedlist {
    Node head;           // first node (head of the list)
    private int size;    // to keep track of number of nodes

    // Constructor to initialize empty list
    Linkedlist(){
        this.size = 0;
    }

    // Node class (inner class to define a single node)
    class Node {
        String data;   // data stored in node
        Node next;     // reference to next node

        Node(String data){
            this.data = data;
            this.next = null;
            size++;   // increase size whenever new node is created
        }
    }

    // Add a new node at the beginning of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {  // if list is empty
            head = newNode;
            return;
        }

        newNode.next = head; // link new node to current head
        head = newNode;      // update head to new node
    }

    // Add a new node at the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {  // if list is empty
            head = newNode;
            return;
        }

        Node currNode = head;
        // traverse till last node
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;  // attach new node at last
    }

    // Print all nodes in the list
    public void printList() {
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        // traverse till null
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Delete the first node
    public void deleteFirst() {
        if(head == null){  // if list empty
            System.out.println("The list is empty");
            return;
        }
        size--;           // decrease size
        head = head.next; // move head to 2nd node
    }

    // Delete the last node
    public void deleteLast() {
        if(head == null){ // if list empty
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){  // only one node
            head = null;
            return;
        }

        // traverse till second last node
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null; // unlink last node
    }

    // return current size of list
    public int getSize(){
        return size;
    }

    // Driver code
    public static void main(String[] args){
        Linkedlist list = new Linkedlist();

        list.addFirst("a");      // list: a
        list.addFirst("is");     // list: is -> a
        list.printList();

        list.addLast("list");    // list: is -> a -> list
        list.printList();

        list.addFirst("this");   // list: this -> is -> a -> list
        list.printList();

        list.deleteFirst();      // delete first (this)
        list.printList();        // is -> a -> list

        list.deleteLast();       // delete last (list)
        list.printList();        // is -> a

        System.out.println(list.getSize()); // size = 2
        list.addFirst("this");   // add at first
        System.out.println(list.getSize()); // size = 3
    }
}
