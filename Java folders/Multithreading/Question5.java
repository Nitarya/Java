// Write a Java program to demonstrate the concept of a deadlock.

public class DeadlockDemo {

    // Resource locks
    static class Resource {
        private final String name;

        public Resource(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        // Create two resources
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        // Create two threads that will cause a deadlock
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding " + resource1.getName());
                
                // Simulate some work with resource 1
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 1: Waiting for " + resource2.getName());
                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired " + resource2.getName());
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding " + resource2.getName());
                
                // Simulate some work with resource 2
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for " + resource1.getName());
                synchronized (resource1) {
                    System.out.println("Thread 2: Acquired " + resource1.getName());
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish (they won't in this case due to deadlock)
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program finished.");
    }
}

}