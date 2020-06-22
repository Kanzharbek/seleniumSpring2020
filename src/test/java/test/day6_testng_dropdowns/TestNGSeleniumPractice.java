package test.day6_testng_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TestNGSeleniumPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        Thread.sleep(10000);
        driver.close();
    }

    @Test(priority = 2) // this Test will run second
    public void google_title_test() {
        //Open Browser: go to https://www.google.com
        //WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");

        //2-Verify title: Google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        //If you use assertTrue
        //argument you're passing is supposed to be returning boolean
        Assert.assertTrue(actualTitle.equals(expectedTitle));

        //If you are using assertEquals
        //you need to pass 2 arguments of the same type
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 1) // this Test will run first
    public void google_search_title_verification() {
        //1-open browser

        //2-go to https://www.google.com
        driver.get("https://www.google.com");

        //3-search "apple"
        WebElement appleSearchBox = driver.findElement(By.name("q"));
        appleSearchBox.sendKeys("apple" + Keys.ENTER);

        //4-verify title contains "apple"
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }
}
