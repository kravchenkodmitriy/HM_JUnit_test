package client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client client;
    @BeforeEach
    public void createAccount(){

        client = new Client("Василий", 3);

    }


    @Test
    void getName() {
        Client client = new Client("Василий", 3);
        assertEquals("Василий", client.getName());
    }

    @Test
    void getMaxNumberOfAccounts() {
        Client client = new Client("Инокентий", 3);
        assertEquals(3, client.getMaxNumberOfAccounts());
    }

}