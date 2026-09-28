package bank;

import bank.utils.Logger;

public class LimitAccount extends Account {
    private Double limit;
    public LimitAccount(Double balance) {
        super(balance);
        this.calculateLimit();
    }
    private void calculateLimit () {
        this.limit = this.getBalance() / 2;
    }
    
    @Override 
    public void addDebit(Double quantity) {
        super.addDebit(quantity);
        this.calculateLimit();
    }
    @Override 
    public Boolean subDebit(Double quantity) {
        if (quantity > this.limit) {
            Logger.log("You quantity is over than your limit");
            return false;
        }
        return super.subDebit(quantity);
    }   
    
}
