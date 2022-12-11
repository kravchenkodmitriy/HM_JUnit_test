package accounts;

public abstract class Account implements MoneyTarget {
    protected String name;
    protected long balance;

    public Account(String name, long balance) {
        this.name = name;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public abstract boolean pay(long amount);

    public abstract boolean add(long amount);

    public abstract boolean transfer(Account accountTo, long amount);

    @Override
    public boolean accept(int money) {
        if (add(money)) {
            System.out.println("Пополнение счета было успешно");
            return true;
        }
        System.out.println("Пополение счета было не успешным");
        return false;
    }
}
