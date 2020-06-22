package test.myPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.WebDriverFactory;

public class RadioButtons_practice {
    public static void main(String[] args) throws Exception {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[text()='Black']/preceding-sibling::input")).click();




    }
}
