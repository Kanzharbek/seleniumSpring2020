package test.myPractices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_getAttribute_methods {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

       String text =  driver.findElement(By.xpath("//a[text()='Context Menu']")).getText();
       String element = driver.findElement(By.xpath("//a[text()='Context Menu']")).getAttribute("href");

        System.out.println(text);
        System.out.println(element);




    }
}
