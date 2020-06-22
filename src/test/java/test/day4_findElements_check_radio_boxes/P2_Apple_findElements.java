package test.day4_findElements_check_radio_boxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P2_Apple_findElements {

    public static void main(String[] args) {
        //TC #02: FINDELEMENTS_APPLE
        //1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // 3.Click to iPhone
        //WebElement iPhone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        WebElement iPhone = driver.findElement(By.xpath("//a[@href='/iphone/'][1]"));
        iPhone.click();
        // 4.Print out the texts of all links
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//html//a"));
        int linkWithText = 0;
        int linkWithoutText = 0;
        for(WebElement each : listOfLinks){
            String textOfEachLink = each.getText();
            if(textOfEachLink.isEmpty()){
                linkWithoutText++;
            }else{
                linkWithText++;
            }
        }
        // 5.Print out how many link is missing text
        System.out.println("Number of links that are missing text: " +linkWithoutText);
        // 6.Print out how many link has text
        System.out.println("Number of links that have text: " +linkWithText);
        // 7.Print out how many total link
        System.out.println("Total links on " + driver.getTitle() + listOfLinks.size());
    }
}
