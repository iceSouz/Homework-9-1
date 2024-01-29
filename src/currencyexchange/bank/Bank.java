package currencyexchange.bank;


import currencyexchange.Constants;
import currencyexchange.Formatter;

import java.util.Random;

public class Bank {
    private String name;
    private double currencyPrice;
    private final Random random = new Random();

    public Bank(String name) {
        this.name = name;
        currencyPrice = random.nextDouble()
                * (Constants.MAX_CURRENCY_PRICE - Constants.MIN_CURRENCY_PRICE)
                + Constants.MIN_CURRENCY_PRICE;
        currencyPrice = Formatter.roundValue(currencyPrice);
    }

    public double getCurrencyPrice() {
        return currencyPrice;
    }

    @Override
    public String toString() {
        return "Bank {name = " + name + ", currencyPrice = " + currencyPrice + '}';
    }
}
