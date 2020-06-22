package test.myPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Locator_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        String mainPageTitle = driver.getTitle();
        System.out.println("Title: " + mainPageTitle);

        driver.get("http://practice.cybertekschool.com/registration_form");
        String regFormPageTitle = driver.getTitle();
        System.out.println(regFormPageTitle);

        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ali");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Kanjar");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("alishko");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("ali@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("alikanjar19");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("777-777-7777");
        driver.findElement(By.cssSelector("input[value='male']")).click();
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("11/24/1991");

        Select select1 = new Select(driver.findElement(By.cssSelector("select[name='department']")));
        select1.selectByVisibleText("Department of Engineering");

        Select select2 = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
        select2.selectByVisibleText("SDET");

        driver.findElement(By.cssSelector("input[value='java']")).click();

        driver.findElement(By.id("wooden_spoon")).click();


    }
}
