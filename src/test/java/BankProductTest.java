import Products.BankProduct;
import Products.cards.CreditCard;
import Products.cards.DebitCard;
import Products.bankproducts.Deposit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankProductTest {

    @Test
    public void testDeposit() {
        BankProduct debitCard = new DebitCard("USD", 1000.0, "Debit Card");
        debitCard.deposit(500.0);
        assertEquals(1500.0, debitCard.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        BankProduct debitCard = new DebitCard("EUR", 1000.0, "Debit Card");
        debitCard.withdraw(500.0);
        assertEquals(500.0, debitCard.getBalance(), 0.001);
    }

    @Test
    public void testCheckBalance() {
        BankProduct creditCard = new CreditCard("USD", -1000.0, "Credit Card", 18.0);
        creditCard.checkBalance();
        assertEquals(-1000.0, creditCard.getBalance(), 0.001);
    }

    @Test
    public void testCheckDebt() {
        CreditCard creditCard = new CreditCard("EUR", -500.0, "Credit Card", 12.0);
        creditCard.checkDebt();
        assertEquals(500.0, creditCard.getBalance(), 0.001);
    }

    @Test
    public void testCloseDeposit() {
        Deposit deposit = new Deposit("USD", 10000.0, "Deposit");
        deposit.closeDeposit();
        assertEquals(10000.0, deposit.getBalance(), 0.001);
    }
}