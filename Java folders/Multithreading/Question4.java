// Write a program to implement inter-thread communication using wait() and notify().

class SharedResource {
    private int data;
    private boolean isAvailable = false;

    // Method for the producer to produce data
    public synchronized void produce(int value) throws InterruptedException {
        while (isAvailable) {
            wait(); // Wait until the data is consumed
        }
        this.data = value;
        isAvailable = true;
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer that data is available
    }

    // Method for the consumer to consume data
    public synchronized int consume() throws InterruptedException {
        while (!isAvailable) {
            wait(); // Wait until the data is produced
        }
        isAvailable = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify the producer that data has been consumed
        return data;
    }
}

class Producer implements Runnable {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                resource.produce(i);
                Thread.sleep(100); // Simulate time taken to produce
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                resource.consume();
                Thread.sleep(150); // Simulate time taken to consume
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
