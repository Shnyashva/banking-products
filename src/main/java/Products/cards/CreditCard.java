package Products.cards;

import Products.BankProduct;

public class CreditCard extends BankProduct {
    private double interestRate;

    public CreditCard(String currency, double balance, String name, double interestRate) {
        super(currency, balance, name);
        this.interestRate = interestRate;
    }

    public void checkDebt() {
        System.out.println("Debt: " + (-balance) + " " + currency);
    }
}
