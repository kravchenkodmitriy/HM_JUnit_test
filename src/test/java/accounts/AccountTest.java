package accounts;

import client.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @BeforeEach
    void setUp() {
        System.out.println("Запуск до выполнения всех тестов");
    }

    @Test
    void getName() {
        CreditAccount creditAccount = new CreditAccount("Кредитка", -3_000_000);
        assertEquals("Кредитка", creditAccount.getName());

    }

    @Test
    void getBalance() {
        SavingsAccount savingsAccount = new SavingsAccount("Сберегательный", 5_000_000, 1_000_000);
        assertEquals(5_000_000, savingsAccount.getBalance());
    }

    @Test
    void checkingBalance() {
        CheckingAccount checkingAccount = new CheckingAccount("Счет", 10_000_000);
        assertEquals(10_000_000, checkingAccount.balance);
    }
}