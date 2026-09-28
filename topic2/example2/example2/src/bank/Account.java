package bank;

import bank.utils.Logger;

public class Account {
    private Double balance;
    public Account(Double balance) {
        this.balance = balance;
    }
    public Boolean subDebit(Double quantity) {
        if (quantity > this.balance) {
            Logger.log("No enough funds");
            return false;
            //new Throwable("No enough money");
        }
        Logger.log("debit money succesfully " + quantity);
        this.balance -= quantity;
        return true;
    }
    public void addDebit(Double quantity) {
        Logger.log("Add debit money succesfully " + quantity);
        this.balance += quantity;
    }
    public Double getBalance() {
        Logger.log("Balance  " + this.balance);
        
        return balance;
    }
}
