import bank.Account;
import bank.LimitAccount;

public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account(100.0);
        account.addDebit(500.0);
        account.addDebit(100.0);
        account.getBalance();
        LimitAccount limitAccount = new LimitAccount(5000.0);
        limitAccount.addDebit(300.0);
        limitAccount.addDebit(700.0);
        limitAccount.addDebit(300.0);
        limitAccount.getBalance();
        limitAccount.subDebit(6000.0);
        limitAccount.getBalance();


    }
}
