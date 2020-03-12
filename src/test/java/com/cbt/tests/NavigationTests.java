package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void chromeDriver() {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
        String title1 = driver.getTitle();
        driver.get("https://www.etsy.com/");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.quit();
    }

    public static void firefoxDriver() {
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://www.google.com/");
        String title1 = driver.getTitle();
        driver.get("https://www.etsy.com/");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.quit();
    }

    public static void edgeDriver() {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("https://www.google.com/");
        String title1 = driver.getTitle();
        driver.get("https://www.etsy.com/");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title1,driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) {
        edgeDriver();
        chromeDriver();
        firefoxDriver();


    }
}
