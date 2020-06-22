package test.myPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class LocatorXpath_relative {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        driver.manage().window().wait(2);
        WebElement searchLine = driver.findElement(By.xpath("tabindex='19'"));
        driver.navigate().refresh();
        WebElement searchBox = driver.findElement(By.xpath("class='nav-search-submit nav-sprite'"));
        driver.navigate().refresh();




    }
}
