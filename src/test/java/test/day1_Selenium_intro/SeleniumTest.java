package test.day1_Selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        //1-set up the web driver. This line creates a connection between selenium
        WebDriverManager.chromedriver().setup();

        //2-create the instance of the ChromeDriver to be able to do action on ChromeDriver
        WebDriver driver = new ChromeDriver();

        //3-test if driver is working. Get browser
        driver.get("https://www.google.com");
        System.out.println("driver.getTitle() --> "+driver.getTitle());
        System.out.println("driver.getCurrentUrl() --> "+driver.getCurrentUrl());
        driver.manage().window().maximize();

        //BROWSER NAVIGATION
        //this line will take a user to the previous page after 2 seconds
        Thread.sleep(2000);
        driver.navigate().back();

        //Thread.sleep is being added just to be able to see selenium movements
        Thread.sleep(2000);
        driver.navigate().forward(); // This line will go to next page

        Thread.sleep(2000);
        driver.navigate().refresh(); // This line will refresh the page

        driver.navigate().to("https://www.facebook.com");

        System.out.println("driver.getTitle --> "+driver.getTitle());

        System.out.println("driver.getCurrentUrl() --> "+driver.getCurrentUrl());

        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        driver.close();


    }

}
