package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_LinkTextLocator {

    public static void main(String[] args) {

        // 1-open a chrome browser and go to google.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //2-Click to Gmail link from top right corner
        driver.findElement(By.linkText("Gmail")).click();

        //3-Verify Title contains Gmail, expected: "Gmail"
        String actualGmailTitle = driver.getTitle();
        String expectedInTitle = "Gmail";
        if (actualGmailTitle.contains(expectedInTitle)) {
            System.out.println("Gmail title verification passed!");
        } else {
            System.out.println("Gmail title verification failed!");
        }

        // Go back with .bach() method
        driver.navigate().back();

        // Google Title verification
        String actualGoogleTitle = driver.getTitle();
        String expectedGoogleTitle = "Google";
        if (actualGmailTitle.contains(expectedInTitle)) {
            System.out.println("Google page title verification passed!");
        } else {
            System.out.println("Google page title verification failed!");
        }

        driver.close();


    }
}
