// Write a program to create a thread by extending the Thread class.

// Creating a thread by extending the Thread class
class MyThread extends Thread {

    // The run() method is where the thread's logic is written
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Print the current thread's name and the value of i
            System.out.println(Thread.currentThread().getName() + " - " + i);

            try {
                // Pause the thread for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        // Creating instances of the MyThread class
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Starting the threads
        t1.start();
        t2.start();
    }
}
