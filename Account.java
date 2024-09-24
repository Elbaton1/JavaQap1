public class Account {
    private String accountNumber;
    private double balance;


    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    public double getBalance() {
        return this.balance;
    }

    
    public void deposit(double amount) {
        this.balance += amount;
    }

    
    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    
    public boolean transfer(double amount, Account targetAccount) {
        if (this.withdraw(amount)) {
            targetAccount.deposit(amount);
            return true;
        }
        return false;
    }
}
