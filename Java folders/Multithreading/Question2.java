// Write a program to create a thread by implementing the Runnable interface.

// Implementing the Runnable interface
class MyRunnable implements Runnable {
    // Overriding the run() method to define the task for the thread
    @Override
    public void run() {
        // Task to be executed in the thread
        System.out.println("Thread is running...");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // Creating an instance of the Runnable implementation class
        MyRunnable myRunnable = new MyRunnable();
        
        // Creating a Thread object and passing the Runnable object to it
        Thread thread = new Thread(myRunnable);
        
        // Starting the thread
        thread.start();
    }
}
