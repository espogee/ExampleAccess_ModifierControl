import atm.ATM;
import bank.BankAccount;
import bank.BankTeller;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(21602, 100.00);
        BankAccount b = new BankAccount(90245, 200.00);

        BankTeller john = new BankTeller();
        john.deposit(a, 350);

        john.transfer(a, b, 200);

    }
}