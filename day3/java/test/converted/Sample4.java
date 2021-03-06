package test.converted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Sample4 {

    @Test
    public void Sample4() {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");

        String baseUrl = "http://demo.guru99.com/test/yahoo.html";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement downloadButton = driver.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");


        String wgetCommand = "wget -P /Users/kilde.000/Downloads/test --no-check-certificate " + sourceLocation;
        System.out.println(wgetCommand);
        try {
            Process exec = Runtime.getRuntime().exec(wgetCommand);
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        } finally {
            // remove file
            driver.quit();
        }

    }

}
