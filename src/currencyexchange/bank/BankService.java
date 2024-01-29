package currencyexchange.bank;

import currencyexchange.Constants;

import java.util.Arrays;

public class BankService {
    public static Bank[] populateBanks() {
        Bank[] banks = new Bank[Constants.NUMBER_OF_BANKS];
        for (int i = 0; i < banks.length; i++) {
            banks[i] = new Bank(Constants.NAMES_BANKS[i]);
        }

        return banks;
    }

    public static Bank[] findMostProfitableBanks(Bank[] banks) {
        sortBanks(banks);
        double max = banks[0].getCurrencyPrice();
        int count = 0;
        for (int i = 0; i < banks.length; i++) {
            if (max == banks[i].getCurrencyPrice()) {
                count++;
            }
        }

        return Arrays.copyOf(banks, count);
    }

    private static void sortBanks(Bank[] banks) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < banks.length - 1; i++) {
                if (banks[i].getCurrencyPrice() < banks[i + 1].getCurrencyPrice()) {
                    Bank temp = banks[i];
                    banks[i] = banks[i + 1];
                    banks[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public static void showBanks(Bank[] banks) {
        for (Bank bank : banks) {
            System.out.println(bank);
        }
    }
}
