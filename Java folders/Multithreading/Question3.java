// Write a Java program to demonstrate thread synchronization.

class BankAccount {
    private int balance = 0;

    // Synchronized method to ensure that only one thread can access it at a time
    public synchronized void deposit(int amount) {
        System.out.println("Depositing: " + amount);
        balance += amount;
        System.out.println("New Balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // Creating multiple threads that will deposit money into the same account
        DepositThread thread1 = new DepositThread(account, 100);
        DepositThread thread2 = new DepositThread(account, 200);
        DepositThread thread3 = new DepositThread(account, 300);

        // Starting the threads
        thread1.start();
        thread2.start();
        thread3.start();
        
        try {
            // Wait for all threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Display the final balance
        System.out.println("Final Balance: " + account.getBalance());
    }
}
