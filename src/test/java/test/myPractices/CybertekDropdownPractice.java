package test.myPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CybertekDropdownPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select optionButton = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        optionButton.selectByVisibleText("Option 1");

        Select dob = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        dob.selectByValue("1991");
        dob.selectByValue("November");
        dob.selectByValue("24");

        Select state = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        state.selectByValue("CA");

        Select language = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        language.selectByValue("Java");

        Select website = new Select(driver.findElement(By.xpath("//a[@id='dropdownMenuLink']")));
        website.selectByValue("Google");


    }
}
