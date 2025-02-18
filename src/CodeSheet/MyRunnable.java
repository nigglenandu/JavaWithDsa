package CodeSheet;

//Runnable is a functional interface in Java that represents a task to be executed by a thread, defined by the run() method.

// RunnableB implements Runnable interface
class RunnableB implements Runnable {
    @Override
    public void run() {
        // Loop to print "Hello" 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10); // Pause for 10 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // Handle interruption
            }
        }
    }
}

public class MyRunnable {
    public static void main(String[] args) {
        // Creating a Runnable using Lambda Expression (RunnableA)
        Runnable obj = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10); // Pause for 10 milliseconds
                } catch (InterruptedException e) {
                    throw new RuntimeException(e); // Handle interruption
                }
            }
        };

        // Creating an instance of RunnableB
        Runnable obj2 = new RunnableB();

        // Creating Thread objects and passing Runnable instances
        Thread t1 = new Thread(obj);  // Thread for RunnableA
        Thread t2 = new Thread(obj2); // Thread for RunnableB

        // Starting both threads
        t1.start();
        t2.start();
    }
}