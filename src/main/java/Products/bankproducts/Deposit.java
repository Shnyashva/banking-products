package Products.bankproducts;

import Products.BankProduct;

public class Deposit extends BankProduct {
    public Deposit(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    public void closeDeposit() {
        System.out.println("Closing deposit: " + name);
    }
}
