package accounts;

public class SavingsAccount extends Account {
    public long minimalBalance;

    public SavingsAccount(String name, long balance, long minimalBalance) {
        super(name, balance);
        this.minimalBalance = minimalBalance;
    }

    @Override
    public boolean transfer(Account accountTo, long amount) {
        return true;
    }

    @Override
    public boolean add(long amount) {
        balance = balance + amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= minimalBalance) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }

    public long getMinimalBalance() {
        return minimalBalance;
    }


    public void setMinimalBalance(long minimalBalance) {
        if (minimalBalance >= 0) {
            this.minimalBalance = minimalBalance;
        } else {
            System.out.println("Необходимо добавить денег на счет");
        }

    }

    @Override
    public boolean accept(int money) {
        return add(money);
    }
}
