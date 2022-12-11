package accounts;

public class CreditAccount extends Account {
    public CreditAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount > 0) {
            return false;
        } else {
            balance = balance + amount;
            return true;
        }
    }

    @Override
    public boolean transfer(Account accountTo, long amount) {
        return false;
    }

    @Override
    public boolean pay(long amount) {
        balance = balance - amount;
        return true;
    }

    @Override
    public boolean accept(int money) {
        if (balance < 0) {
            add(money);
            return true;
        }
        return false;
    }
}
