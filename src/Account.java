/**
 * Created by Mihnea on 04.04.2017.
 */
public class Account {
    private double balance;

    public static void main(String[] args) {

        // Create an account object
        Account ac = new Account();
        double balance = ac.getBalance();
        System.out.println("Balance = " + balance);

        // Credit and debit some amount
        ac.credit(234.78);
        ac.debit(100.12);

//        balance = ac.getBalance();
        System.out.println("Balance = " + balance);

        // Attempt to credit and debit invalid amounts
        ac.credit(-234.90);
        ac.debit(Double.POSITIVE_INFINITY);
        balance = ac.getBalance();
        System.out.println("Balance = " + balance);

        // Attempt to debit more than the balance
        ac.debit(2000.0);
        balance = ac.getBalance();
        System.out.println("Balance = " + balance);
    }

    public double getBalance() {
        //Return the balance of this account
        return this.balance;
    }

    public int credit(double amount) { // credit method - PUT MONEY INTO ACCOUNT
        //Make sure credit amount is not negative, NaN or infinity
        if (!this.isValidAmount(amount, "CREDIT")) {
            return -1;
        }
        //Credit the amount
        System.out.println("Crediting amount: " + amount);
        this.balance = this.balance + amount;
        return 1;
    }

    public int debit(double amount) { // debit method - WITHDRAW MONEY FROM ACCOUNT
        //Make sure debit is not negative, Nan or infinity
        if (!this.isValidAmount(amount, "DEBIT")) {
            return -1;
        }
        //Make sure a minimum balance of zero is maintained
        if (this.balance < amount) {
            System.out.println("Insufficient fund. DEBIT attempted: " + amount);
            return -1;
        }
        //Debit the amount
        System.out.println("Debiting amount: " + amount);
        this.balance = this.balance - amount;
        return 1;
    }

    // Use a private method to validate credit/debit amount
    private boolean isValidAmount(double amount, String operation) {
        //Make sure amount is not negative, NaN or infinity
        if (amount < 0.0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
            System.out.println("Invalid " + operation + " amount: " + amount);
            return false;
        }
        return true;


    }
}
