package test.converted;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertDemo {


    @Test
    public void AlertDemo() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        // Alert Message handling
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).click();

        wait.until(ExpectedConditions.alertIsPresent());
        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage= alert.getText();

        // Displaying alert message
        System.out.println(alertMessage);
        // Accepting alert
        alert.accept();

        wait.until(ExpectedConditions.alertIsPresent());

        // Switching to Alert
        Alert alert2 = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage2 = driver.switchTo().alert().getText();
        System.out.println(alertMessage2);

        alert2.accept();

        driver.quit();

    }
    }




