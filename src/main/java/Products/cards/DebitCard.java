package Products.cards;

import Products.BankProduct;

public class DebitCard extends BankProduct {
    public DebitCard(String currency, double balance, String name) {
        super(currency, balance, name);
    }
}