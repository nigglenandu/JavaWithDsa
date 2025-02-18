package CodeSheet;

//A thread in Java is a lightweight process that runs independently, enabling parallel execution and multitasking within a program.

// ThreadA class extends Thread and overrides the run() method
public class ThreadA extends Thread {
    public void run() {
        // Loop to print "Hi" 100 times
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10); // Pause for 10 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // Handle exception if the thread is interrupted
            }
        }
    }
}

// ThreadB class extends Thread and overrides the run() method
class ThreadB extends Thread {
    public void run() {
        // Loop to print "Hello" 100 times
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10); // Pause for 10 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e); // Handle exception if the thread is interrupted
            }
        }
    }
}

// Main class to demonstrate multithreading
class ThreadDemo {
    public static void main(String[] args) {
        // Creating instances of ThreadA and ThreadB
        ThreadA obj = new ThreadA();
        ThreadB obj1 = new ThreadB();

        // Uncomment the lines below to check and modify thread priority
        // System.out.println(obj.getPriority()); // Print the default priority (5 - NORM_PRIORITY)
        // obj.setPriority(Thread.NORM_PRIORITY); // Set priority (default is 5)

        // Start the first thread
        obj.start();

        try {
            Thread.sleep(10); // Allow a small delay before starting the second thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e); // Handle exception if the thread is interrupted
        }

        // Start the second thread
        obj1.start();
    }
}