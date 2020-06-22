package test.CybertekPracticeWebPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ForgotPassword {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");
        Thread.sleep(5000);

        // locate all elements in current page
        WebElement pageLink = driver.findElement(By.xpath("//a[.='Home']"));
        WebElement pageHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement emailLink = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));
        WebElement homeButton = driver.findElement(By.xpath("//a[.='Home']"));
        WebElement footerSign = driver.findElement(By.xpath("//a[.='Cybertek School']"));

        if(pageLink.isDisplayed() && pageHeader.isDisplayed() && emailLink.isDisplayed() && searchBox.isDisplayed()
        && retrievePasswordButton.isDisplayed() && homeButton.isDisplayed() && footerSign.isDisplayed()) {
            System.out.println("All elements are located-Passed!");
        }else {
            System.out.println("Fail!!!");
        }





    }
}
