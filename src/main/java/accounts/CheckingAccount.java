package accounts;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, long balance) {
        super(name, balance);

    }

    @Override
    public boolean transfer(Account accountTo, long amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                System.out.println("Пополнение успешно");
                return true;
            } else {
                add(amount);
                System.out.println("Неудалось пополнить");
                return false;
            }
        } else {
            return false;
        }
    }


    @Override
    public boolean pay(long amount) {
        if (balance - amount >= 0) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean add(long amount) {
        balance = balance + amount;
        return true;
    }

    @Override
    public boolean accept(int money) {
        return add(money);
    }
}
