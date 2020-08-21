package VTB;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class VTB_LessThan3 {

    public String RurUsdSell (String text) {

        $(By.id("method2")).scrollTo().click();
        $(By.xpath("//input[@id='method2']")).sendKeys(text);
        $(By.xpath("/html/body/main/div/section[3]/div/div[2]/div[2]/div[2]")).click();
        $(By.xpath("//input[@id='method1']")).waitUntil(exist,40000).click();
        return $(By.xpath("//input[@id='method1']")).getValue().replaceAll("\u00a0", "").replaceAll(",",".");

    }


    public Double CostOneDollarRurUsdSell() {

        return Double.parseDouble($(By.xpath("//td[3]/div/span")).text().replaceAll(",","."));
    }

    public Double checkCourseRurUsdSell(double cash) {

        return (cash * this.CostOneDollarRurUsdSell());
    }

    public String RurUsdBuy (String text) {

        $(By.xpath("//div[3]/div/span/span/span/span[2]")).click();
        $(By.xpath("/html/body/main/div/section[3]/div/div[2]/div[1]/div/div[3]/div/span[2]/span/span[2]/div/ul/li[3]")).hover().click();
        $(By.xpath("//div[2]/div/div[3]/div/span/span/span/span")).click();
        $(By.xpath("/html/body/main/div/section[3]/div/div[2]/div[2]/div[1]/div[3]/div/span[2]/span/span[2]/div/ul/li[1]")).hover().click();
        $(By.id("method1")).click();
        $(By.id("method1")).clear();
        $(By.id("method1")).click();
        $(By.xpath("//input[@id='method1']")).sendKeys(text);
        $(By.xpath("/html/body/main/div/section[4]/div/h2")).click();
        $(By.xpath("//input[@id='method2']")).waitUntil(exist,40000).click();
        return  $(By.xpath("//input[@id='method2']")).getValue().replaceAll("\u00a0", "").replaceAll(",",".");
    }

    public Double CostOneDollarRurUsdBuy() {

        return Double.parseDouble($(By.xpath("//td[2]/div/span")).text().replaceAll(",","."));
    }

    public Double checkCourseRurRurUsdBuy(double cash) {

        return (cash * this.CostOneDollarRurUsdBuy());
    }

}
