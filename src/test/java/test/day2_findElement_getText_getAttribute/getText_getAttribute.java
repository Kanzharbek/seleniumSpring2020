package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_getAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        System.out.println("get text value: " + driver.findElement(By.linkText("Gmail")).getText());
        String className = driver.findElement(By.className("gb_g")).getText();
        System.out.println(className);



        System.out.println("get attribute of: " + driver.findElement((By.linkText("Gmail"))).getAttribute("href"));



        driver.close();


    }
}
