package bank;

public class BankTeller {
    public void deposit(BankAccount account, double amount){
        boolean result = account.deposit(amount);
        if(result){
            System.out.println("Successful Deposit of $" + amount + " to "+ account.number);
        } else {
            System.out.println("Error on deposit!!");
        }
    }

    public void withdraw(BankAccount account, double amount){
        boolean result = account.withdraw(amount);
        if(result){
            System.out.println("Successful withdrawal of $" + amount + " from "+ account.number);
        } else {
            System.out.println("Error withdrawal!!");
        }
    }

    public void transfer(BankAccount originAccount, BankAccount targetAccount, double amount){
        System.out.println("Transfer from " + originAccount.number + " to " + targetAccount.number + " for $" + amount);
        if ((amount/originAccount.balance) <= 0.5){
            boolean resultWithdraw = originAccount.withdraw(amount);
            if(resultWithdraw){
                System.out.println("Successful withdrawal of $"+ amount + " from account "+ originAccount.number + " New balance: $"+ originAccount.balance);
                boolean resultDeposit = targetAccount.deposit(amount);
                if(resultDeposit){
                    System.out.println("Successful deposit of $"+ amount + " to account "+ targetAccount.number + " New balance: $"+ targetAccount.balance);
                }else {
                    System.out.println("Error performing deposit!!");
                }
            }else {
                System.out.println("Error performing withdrawal!!");
            }
        }else {
            System.out.println("Withdrawal amount exceeds 50% of the balance");
        }

    }
}
