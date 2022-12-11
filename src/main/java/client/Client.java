package client;

import accounts.Account;
import accounts.MoneyTarget;


public class Client implements MoneyTarget {
    protected String nameClient;
    protected int maxAccounts;
    protected Account[] accounts;

    public Client(String name, int numberOfAccounts) {
        this.nameClient = name;
        this.maxAccounts = numberOfAccounts;
        this.accounts = new Account[maxAccounts];
    }

    public void add(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Мест нет, для нового счета =(");
    }

    public boolean pay(long amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return nameClient;
    }

    public int getMaxNumberOfAccounts() {
        return maxAccounts;
    }

    @Override
    public boolean accept(int money) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].add(money)) {
                System.out.println("Успешная операция");
                return true;
            }

        }
        System.out.println("Не удалось провести операцию");
        return false;
    }
}
