package test.day4_findElements_check_radio_boxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;
import java.util.List;

import java.util.concurrent.TimeUnit;

public class MerriamWebster_FindElements {

    public static void main(String[] args) {

        //TC #0 FINDELEMENTS
        //1. open Chrome Browser
        //2. Go to https://www.merriam-webster.com/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Implicit wait will wait UP TO given seconds
        //If page is loaded before it will continue
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.merriam-webster.com/");

        //3. Print out the texts of all links
        //we are creating a List of WebElements and storing values returned
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        int linkWithoutText = 0;
        int linkWithText = 0;

        for(WebElement each : listOfLinks){
            //System.out.println(each.getText());
            String textOfeachLink = each.getText();

            if (textOfeachLink.isEmpty()) { // if empty
                linkWithoutText++;
            } else {
                System.out.println(textOfeachLink); // if not empty
                linkWithText++;
            }
        }
        //4. Print out how many link is missing text
        System.out.println("The number of links that don't have text: " + linkWithoutText);
        //5. Print out how many link has text
        System.out.println("The number of links that have text: " + linkWithText);
        //6. Print out how many links in total
        System.out.println("Total links on this page: "+listOfLinks.size());



    }
}
