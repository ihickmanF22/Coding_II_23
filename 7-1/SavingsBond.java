public class SavingsBond {
    public int term;
    public double balance;
    public double rate;
    public double price;
    public double interest;

    public SavingsBond(int userTerm, double interestRate, double userBalance, double purchasePrice) {
        term = userTerm;
        //userTerm = 30;
        balance = userBalance;
        //userBalance = 10000;
        rate = interestRate;
        //CALCULATED
        price = purchasePrice;
        //purchasePrice = 5000;

        double equation = Math.pow((1+rate), 2);
        double compoundInterest = (balance*equation);
        interest = compoundInterest;

        if (term >= 0 && term < 12) {
            rate = 0.05;
        } else if (term >= 12 && term < 24) {
            rate = 0.10;
        } else if (term >= 24 && term < 36) {
            rate = 0.15;
        } else if (term >= 36 && term < 48) {
            rate = 0.20;
        } else if (term >= 48 && term < 61) {
            rate = 0.25;
        } else {
            System.out.println("Invalid Term");
        }

        System.out.println("Annually Compounded: " + compoundInterest);

    }

    public void displayBond() {
        //Display EVERYTHING
        System.out.println("Price: " + price);
        System.out.println("Annually Compounded from Price: " + interest);
        System.out.println("New Balance: " + balance);
        //USER OPTIONAL
        System.out.println("Interest Rate: " + rate);
        }
}