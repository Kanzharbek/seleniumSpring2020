package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        //TC #4: Google search
        //1- Open a chrome browser
        // for manual importing : Windows :alt+enter MAC : option+enter
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //3- Write “apple” in search box
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        //4- Click google search button
        //driver.findElement(By.name("btnK")).click();

        //5- Verify title:
        //Expected: Title should start with “apple” word
        String actualTitle = driver.getTitle();
        String expectedTitle = "Apple";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }

    }
}
