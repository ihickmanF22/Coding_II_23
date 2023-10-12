public class CheckingAccount {
    public String name;
    public double balance;
    public int amount;

    public void displayCustomer() {
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance < 1000) {
            System.out.println("Your balance is to low to withdraw this amount");
        } else if (amount < 0) {
            System.out.println("");
        } else {
            balance = balance - amount;
            System.out.println("The withdraw was successful");
            System.out.println("Your balance is now: $" + balance);
        }
    }
}