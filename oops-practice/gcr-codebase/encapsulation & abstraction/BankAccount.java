public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0 && interestRate <= 10) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Invalid interest rate!");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: Rs. " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: Rs. " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied: Rs. " + interest);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
