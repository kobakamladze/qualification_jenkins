package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;

public class GoogleSearchTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new SafariDriver();
    }

    @Test
    public void testGoogleSearchInputIsVisible() {
        driver.get("https://www.google.com");
        WebElement searchBtn = driver.findElement(By.xpath("//*[@aria-label='Gmail ']"));
        assertTrue(searchBtn.isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}