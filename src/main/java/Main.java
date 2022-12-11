import accounts.*;
import client.Client;

public class Main {
    public static void main(String[] args) {

        Client client2 = new Client("Василий", 3);
        System.out.println("У клиента " + client2.getName() + " " + client2.getMaxNumberOfAccounts() + " cчета(ов)");
        CheckingAccount checkingAccount2 = new CheckingAccount("Счет", 10_000_000);
        long checkingAccountClient = checkingAccount2.getBalance();
        System.out.println("На основном счету: " + checkingAccountClient + " руб");

        CreditAccount creditAccount2 = new CreditAccount("Кредитка", -3_000_000);
        long creditAccountClient = creditAccount2.getBalance();
        System.out.println("На кредитке: " + creditAccountClient + " руб");

        SavingsAccount savingsAccountClient = new SavingsAccount("Сберегательный", 5_000_000, 1_000_000);
        long savingsAccount3 = savingsAccountClient.getBalance();
        System.out.println("На сберегательном счету: " + savingsAccount3 + " руб");

        Client client = new Client("Петр", 4);
        CheckingAccount checkingAccount1 = new CheckingAccount("Счет", 4_000_000);
        CreditAccount creditAccount1 = new CreditAccount("Кредитный", -500_000);
        SavingsAccount savingsAccount1 = new SavingsAccount("Первый сберегательный", 10_000, 1_000);
        SavingsAccount savingsAccount2 = new SavingsAccount("Второй сберегательный", 650_000, 200_000);
        System.out.println("У клиента " + client.getName() + " " + client.getMaxNumberOfAccounts() + " cчета(ов)");
        System.out.println("На основном счету: " + checkingAccount1.getBalance() + " руб");
        System.out.println("Задолженость по кредиту: " + creditAccount1.getBalance() + " руб");
        System.out.println("Первый сберегательный: " + savingsAccount1.getBalance() + " руб" + " Минимальная сумма на карте " + savingsAccount1.minimalBalance + " руб");
        System.out.println("Финансовая подушка: " + savingsAccount2.getBalance() + " руб" + " Минимальная сумма на карте " + savingsAccount2.minimalBalance + " руб");

        System.out.println();

        Client client1 = new Client("Инокентий", 3);
        System.out.println("У клиента " + client1.getName() + " " + client1.getMaxNumberOfAccounts() + " cчета(ов)");
        CheckingAccount checkingAccount = new CheckingAccount("Счет", 1_000_000);
        long checkingAccountBalance = checkingAccount.getBalance();
        System.out.println("На основном счету: " + checkingAccountBalance + " руб");

        CreditAccount creditAccount = new CreditAccount("Кредитка", -200_000);
        long creditAccountBalance = creditAccount.getBalance();
        System.out.println("На кредитке: " + creditAccountBalance + " руб");

        SavingsAccount savingsAccount = new SavingsAccount("Сберегательный счет", 1_000_000, 500_000);
        long savingsAccountBalance = savingsAccount.getBalance();
        savingsAccount.setMinimalBalance(100_000);
        System.out.println("На сберегательном счету: " + savingsAccountBalance + " руб" + " Минимальная сумма на карте " + savingsAccount.minimalBalance + " руб");

        System.out.println();


        CreditAccount creditAccount3 = new CreditAccount("На ремонт", -1_000_000);
        client2.add(creditAccount3);
        client2.add(creditAccount2);
        client2.add(checkingAccount2);
        client2.pay(savingsAccount3);
        client2.accept(50_000);
        creditAccount2.accept(10_000);
    }

}
