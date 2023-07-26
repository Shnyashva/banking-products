package Products.cards;

import Products.BankProduct;

public class CurrencyDebitCard extends BankProduct {
    public CurrencyDebitCard(String currency, double balance, String name) {
        super(currency, balance, name);
    }
}
