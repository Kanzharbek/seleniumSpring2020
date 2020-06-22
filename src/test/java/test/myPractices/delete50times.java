package test.myPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class delete50times {

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
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        for(int i = 0; i < 50; i++){ // iterating till 50
            addElementButton.click(); // means click 50 times
        }
        List<WebElement> listOfDeleteButtons = driver.findElements(By.xpath("//button[.='Delete']"));
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("Number of DELETE buttons: " + listOfDeleteButtons.size());

        try {
            for(int i = 0; i < 50; i++){ // iterating till 50
                deleteButton.click(); // means click 50 times
            }
            if (!deleteButton.isDisplayed()) {
                System.out.println("Delete button is NOT displayedafter clicking. PASS!");
            } else {
                System.out.println("Delete button is displayed after clicking. FAILED!");
            }
        } catch (StaleElementReferenceException exception) {
            System.out.println("StaleElementException has been thrown.");
            System.out.println("It means element has been completely deleted from the HTML.");
            System.out.println("Delete button is not displayed. Verification PASSED!");
        }


    }
}
