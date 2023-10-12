public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.balance = 1000;
        account.name = "Isaac";
        account.amount = 500;

        SavingsBond bond = new SavingsBond(30, 0.15, 10000, 5000);
        bond.displayBond();
    }
}