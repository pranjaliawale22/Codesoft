import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("1234567890123456", "David", 1000.00);
        BankAccount bankAccount2 = new BankAccount("1234567890543210", "Jane Doe", 2000.00);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the ATM Interface!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAccount Holder Name: " + bankAccount1.getAccountHolderName());
                    System.out.println("Account Number: " + bankAccount1.getAccountNumber());
                    System.out.println("Account Balance: $" + bankAccount1.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount you want to withdraw: $");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount <= bankAccount1.getBalance()) {
                        bankAccount1.setBalance(bankAccount1.getBalance() - withdrawalAmount);
                        System.out.println("\nYour new balance is: $" + bankAccount1.getBalance());
                    } else {
                        System.out.println("\nInsufficient balance. Please try again later.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount you want to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    bankAccount1.setBalance(bankAccount1.getBalance() + depositAmount);
                    System.out.println("\nYour new balance is: $" + bankAccount1.getBalance());
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("\nThank you for using the ATM Interface. Have a great day!");
    }
}