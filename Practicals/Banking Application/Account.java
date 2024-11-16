public interface Account {
    void openAccount(double initialDeposit);
    void closeAccount();
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(Account targetAccount, double amount);
    double getBalance();
    String getAccountType();
}