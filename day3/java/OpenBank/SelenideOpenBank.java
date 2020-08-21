package OpenBank;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SelenideOpenBank {



    @Test
    public void SelenideOpenBank() {

        OpenBankPage bank = open("https://www.open.ru/", OpenBankPage.class);

        printExchangeRate(bank);

        checkBuySell(bank);

    }

    private void checkBuySell(OpenBankPage bank) {
        Assert.assertTrue(bank.UsdBuy() < bank.UsdSell());
        Assert.assertTrue(bank.EuroBuy() < bank.EuroSell());
    }

    private void printExchangeRate(OpenBankPage bank) {
        System.out.println(bank.UsdBuy() + " - Банк покупает за $");
        System.out.println(bank.UsdSell() +  " - Банк продает за $");
        System.out.println(bank.EuroBuy() + " - Банк покупает за €");
        System.out.println(bank.EuroSell() + " - Банк продает за €");
    }
}







