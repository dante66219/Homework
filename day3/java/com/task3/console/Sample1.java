package com.task3.console;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Sample1 {
    public static void main(String[] args) {
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
