import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account savingsAccount = new SavingsAccount();
        Account currentAccount = new CurrentAccount();

        boolean running = true;
        while (running) {
            System.out.println("\n--- Bank Operations Menu ---");
            System.out.println("1. Open Savings Account");
            System.out.println("2. Open Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. Close Savings Account");
            System.out.println("7. Close Current Account");
            System.out.println("8. Exit");
            System.out.println("Choose an option: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    System.out.print("Enter initial deposit for Savings amount: ");
                double savingsDeposit = scanner.nextDouble();
                savingsAccount.openAccount(savingsDeposit);
                break;
                case 2:
                    System.out.println("Enter initial deposit for Current account: ");
                    double currentDeposit = scanner.nextDouble();
                    currentAccount.openAccount(currentDeposit);
                    break;

                    Case 3:
                    System.out.println("Enter amount to deposit into Savings account: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;
                    case 4:
                        System.out.println("Enter amount to withdraw from Savings account: ");
                        double withdrawAmount = scanner.nextDouble();
                        savingsAccount.withdraw(withdrawAmount);
                        break;
                    case 5:
                        System.out.print("Enter amount to transfer from Savings to Current account: ");
                        double transferAmount = scanner.nextDouble();
                        savingsAccount.transfer(currentAccount, transferAmount);
                        break;
                        case 6:
                            SavingsAccount.closeAccount();
                            break;
                            case 7:
                                currentAccount.closeAccount();
                                break;
                                case 8:
                                    running = false;
                                    System.out.println("Exiting the banking system.");
                                    break;
                                default:
                                    System.out.println("Invalid option. Please try again.");
                                    
            }
        }
        scanner.close();
    }
}