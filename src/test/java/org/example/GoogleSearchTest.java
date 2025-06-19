package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new SafariDriver();
    }

    @Test
    public void googleSearchTest() {
        driver.get("https://www.google.com");
        WebElement searchBtn = driver.findElement(By.xpath("//*[@aria-label='Gmail ']"));
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}