package test.converted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {

    @Test
    public void Sample1() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        try {
            String baseUrl = "http://demo.guru99.com/test/newtours/";


            chromeDriver.get(baseUrl);

            System.out.println("Chrome title = " + chromeDriver.getTitle());
        } finally {

            chromeDriver.quit();
        }
    }
}
