package test.myPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorXpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@onclick='button1()']"));
        driver.findElement(By.xpath("//*[@onclick='button1()']")); // * means ALL --> search everywhere in html

        driver.findElement(By.cssSelector("button[onclick='button1()']")); // same as xpath but starts without // and no @




    }
}
