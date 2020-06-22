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

public class AddRemoveElements {
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
    public void test1() {
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));

        if (deleteButton.isDisplayed()) {
            System.out.println("Delete button is displayed. Verification Passed!");
        } else {
            System.out.println("Delete button is not displayed. Verification Failed!");
        }

//        deleteButton.click();
//
//        if (!deleteButton.isDisplayed()) {
//            System.out.println("Delete button is not displayed after clicking DELETE button. Verification Passed!");
//        } else {
//            System.out.println("Delete button is displayed after clicking DELETE button. Verification Failed!");
//        }
        try {
            deleteButton.click();
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
