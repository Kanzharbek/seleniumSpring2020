package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_VS_getAttribute2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://apple.com");
        String text1 = driver.findElement(By.className("ac-gn-link ac-gn-link-mac")).getText();
        System.out.println(text1);
    }
}
