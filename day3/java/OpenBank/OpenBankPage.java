package OpenBank;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class OpenBankPage {

    public Double UsdBuy() {
            return Double.parseDouble($(By.xpath("//td[2]/div/span")).text().replaceAll(",","."));
        }
    public Double UsdSell() {
        return Double.parseDouble($(By.xpath("//td[4]/div/span")).text().replaceAll(",","."));
        }
    public Double EuroBuy() {
        return Double.parseDouble($(By.xpath("//tr[3]/td[2]")).text().replaceAll(",","."));
    }
    public Double EuroSell() {
        return Double.parseDouble($(By.xpath("//tr[3]/td[4]/div/span")).text().replaceAll(",","."));
    }
}
