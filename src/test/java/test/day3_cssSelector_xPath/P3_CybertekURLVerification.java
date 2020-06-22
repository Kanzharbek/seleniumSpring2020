package test.day3_cssSelector_xPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_CybertekURLVerification {

    public static void main(String[] args) {

//        TC #3: Practice
//        Cybertek/ForgotPassword URL verification
//        1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
//        3.Enter any email into input box
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("dakmatova91@gmail.com");
//        4.Click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();
//        5. Verify URL contains: Expected: “email_sent”
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "email_sent";
        System.out.println("Current URL: " + actualURL);

        if (actualURL.contains(expectedURL)) {
            System.out.println("Url verification passed!");
        } else {
            System.out.println("Url verification failed!");
        }
//        6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”
        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String actualMessage = driver.findElement(By.name("confirmation_message")).getText();

        System.out.println(actualMessage);
        if (actualMessage.contains("Your e-mail's been sent!")) {
            System.out.println("\"Your e-mail's been sent!\" verification passed!");
        } else {
            System.out.println("\"Your e-mail's been sent!\" verification failed!");
        }

        if (confirmationMessage.isDisplayed()) { // isDisplayed(): returns a boolean
            System.out.println("Message is displayed, verification passed!"); // if true: passed
        } else {
            System.out.println("Message is displayed, verification failed!"); // if false: failed
        }
//        Hint: You need to use getText method for this practice.


    }
}
