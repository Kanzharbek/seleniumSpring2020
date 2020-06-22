package test.day3_cssSelector_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class ccsSelectorExample {

    public static void main(String[] args) {

        // Search on amazon
        // 1. Open a browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // 2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        // 3. Enter any search term (use css selector search box)
        WebElement amazonSearch = driver.findElement(By.cssSelector("input[tabindex='19']"));
        amazonSearch.sendKeys("wooden spoon" + Keys.ENTER);
        // 4. Verify title contains search term
        String actualTitle = driver.getTitle();
        String expectedInTitle = "wooden spoon";

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }

        driver.close();


    }
}
