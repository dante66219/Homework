package OpenBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumOpenBank {
    public String baseUrl = "https://www.open.ru/";
    public WebDriver driver;


    @BeforeClass
    public void initThis() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void bank() {

        Double UsdBuy;
        Double UsdSell;
        Double EuroBuy;
        Double EuroSell;

        UsdBuy = Double.parseDouble(driver.findElement(By.xpath("//tr[2]//td[2]//*[@class=\"main-page-exchange__rate\"]")).getText().replaceAll(",","."));
        UsdSell = Double.parseDouble(driver.findElement(By.xpath("//tr[2]//td[4]//*[@class=\"main-page-exchange__rate\"]")).getText().replaceAll(",","."));
        EuroBuy = Double.parseDouble(driver.findElement(By.xpath("//tr[3]//td[2]//*[@class=\"main-page-exchange__rate\"]")).getText().replaceAll(",","."));
        EuroSell = Double.parseDouble(driver.findElement(By.xpath("//tr[3]//td[4]//*[@class=\"main-page-exchange__rate\"]")).getText().replaceAll(",","."));

        System.out.println(UsdBuy + " - Банк покупает за $");
        System.out.println(UsdSell + " - Банк продает за $");
        System.out.println(EuroBuy + " - Банк покупает за €");
        System.out.println(EuroSell + " - Банк продает за €");

        Assert.assertTrue(UsdBuy < UsdSell);
        Assert.assertTrue(EuroBuy < EuroSell);

        driver.quit();


    }
    }
