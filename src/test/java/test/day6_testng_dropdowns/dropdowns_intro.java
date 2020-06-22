package test.day6_testng_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class dropdowns_intro {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //1.Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");

        //2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void test1_default_value_verification() {
        // 3.Verify “Simple dropdown” default selected value is correct
        // Expected: “Please select an option”
        //Select select = new Select(driver.findElement(By.id("dropdown")));
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String actualDefaultOfSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedSimpleDropdownText = "Please select an option";

        Assert.assertEquals(actualDefaultOfSimpleDropdown, expectedSimpleDropdownText);

        // 4.Verify“State selection” default selected value is correct
        // Expected: “Select a State”
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualDefaultStateDropdown = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropdownText = "Select a State";

        Assert.assertEquals(actualDefaultStateDropdown, expectedStateDropdownText);
    }

    @Test
    public void stateDropdown_verification() throws InterruptedException {
//        TC #2: Selecting state from State dropdown and verifying result
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        // first 2 steps are implemented in BeforeMethod

        //locating state dropdown
        Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
//        3. Select Illinois
        Thread.sleep(5000);
        selectDropdown.selectByValue("IL");
//        4. Select Virginia
        selectDropdown.selectByVisibleText("Virginia");
//        5. Select California
        selectDropdown.selectByIndex(5);
//        6. Verify final selected option is California.
        String selectedCalifornia = selectDropdown.getFirstSelectedOption().getText();
        String californiaText = "California";

        Assert.assertEquals(selectedCalifornia, californiaText);
//        Use all Select options. (visible text, value, index)
    }


}
