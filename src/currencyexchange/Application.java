package currencyexchange;


import currencyexchange.bank.Bank;
import currencyexchange.bank.BankService;

public class Application {
    public static void main(String[] args) {
        Bank[] banks = BankService.populateBanks();
        BankService.showBanks(banks);

        System.out.println("================================================");

        Bank[] results = BankService.findMostProfitableBanks(banks);

        if (results.length > 1) {
            System.out.println("Самі вигідні банки:");
            BankService.showBanks(results);
        } else {
            System.out.println("Самий вигідний банк:");
            BankService.showBanks(results);
        }
    }
}
