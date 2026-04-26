public class Budget {

    private double balance;

    public Budget(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.balance = balance;
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative amount");
        }

        balance += amount;
    }

    // Exercise 3
    public void spendMoney(double amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Negative amount");
        }

        if (balance - amount < 0) {
            throw new IllegalArgumentException("Insufficient balance");
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}