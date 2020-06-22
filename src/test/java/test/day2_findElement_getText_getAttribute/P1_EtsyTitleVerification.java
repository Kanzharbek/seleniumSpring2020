package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_EtsyTitleVerification {
    /*
            TC #1: Etsy Title Verification
    */
    public static void main(String[] args) {
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.Go to https://www.etsy.com
        driver.get("http://www.etsy.com");

        //3.Search for “wooden spoon”
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon");
        driver.findElement(By.className("wt-input-btn-group__btn")).click();

        //4. Verify title: Expected: “Wooden spoon | Etsy”
        if (driver.getTitle().equals("Wooden spoon | Etsy")) {
            System.out.println("Etsy Wooden Spoon page passed");
        } else {
            System.out.println("Etsy Wooden Spoon page failed");
        }

        driver.close();

    }
}
