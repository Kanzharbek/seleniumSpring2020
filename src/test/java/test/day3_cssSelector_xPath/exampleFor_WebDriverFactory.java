package test.day3_cssSelector_xPath;

import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class exampleFor_WebDriverFactory {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");


    }

}
