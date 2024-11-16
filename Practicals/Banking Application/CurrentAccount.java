public class CurrentAccount implements Account {
    private double balance;
    private boolean isActive;

    public CurrentAccount() {
        this.balance = 0.0;
        this.isActive = false;
    }

    @Override
    public void openAccount(double initialDeposit) {
        if (!isActive) {
            balance = initialDeposit;
            isActive = true;
            System.out.println("Current account opened with initial deposit: " + initialDeposit);
        } else {
            System.out.println("Account is already open.");
        }
    }
    @Override
    public void closeAccount() {
        if (isActive) {
            System.out.println("Current account closed with balance: " + balance);
            isActive = false;
            balance = 0.0;
        } else {
            System.out.println("Account is not active.")
        }
    }
    @Override
    public void deposit(double amount) {
        if (isActive) {
            balance += amount;
            System.out.println("Deposited " + amount + "into Current account. New balance: " + balance);
        } else {
            System.out.println("Account is not active. Cannot deposit.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (isActive) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + "from Current account.New balance: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Account is not active. Cannot withdrew ");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }
}