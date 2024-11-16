public class SavingsAccount implements Account {
    private double balance;
    private boolean isActive;

    public SavingsAccount() {
        this.balance = 0.0;
        this.isActive = false;
    }

    @Override
    public void openAccount(double initialDeposit) {
        if (!isActive) {
            balance = initialDeposit;
            isActive = true;
            System.out.println("System account opened with initial deposit" + initialDeposit);
        } else {
            System.out.println("Account is already open.")
        }
    }

    @Override 
    public void closeAccount() {
        if (isActive) {
            System.out.println("Savings account closed with balance:" balance)
            isActive = false;
            balance =0.0;
        } else {
            System.out.println("Account is not active.");
        }
    }
    @Override 
    public void deposit(double amount) {
        if (isActive) {
            balance += amount;
            Savings.out.println("Deposited" + amount + "into Savings Account. New balance: " + balance);
        } else {
            System.out.println("Account is not active. Cannot deposit.");
        }
    }
    @Override 
    public void withdraw(double amount) {
        if (isActive) {
            if (balance >= amount) {
                \balance -=amount;
                System.out.println("Withdrew" + amount + "from Savings account.New balance: " + balance);
            } else {
                System.out.println("Account is not active. Cannot withdrew.")
            }
        }
        @Override 
        public void transfer(Account targetAccount, double amount) {
            if (isActive) {
                if(balance >= amount) {
                    this.withdraw(amount);
                    targetAccount.deposit(amount);
                    System.out.println("Transferred" + amount + " to " + targetAccount.getAccountType());
                } else {
                    System.out.println("Insufficient funds for transfer")
                } else {
                    System.out.println("Account is not active. Cannot transfer.");
                }
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
        @Override
        public String getAccountType() {
            return "Savings Account";
        }
    }
}