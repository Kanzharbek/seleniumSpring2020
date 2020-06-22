package test.myPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class LocatorByLinkText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        WebElement linkText1 = driver.findElement(By.linkText("Context Menu"));

        WebElement linkText2 = driver.findElement(By.linkText("Dynamic Content"));


    }
}
