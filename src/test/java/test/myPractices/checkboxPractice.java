package test.myPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class checkboxPractice {

    public static void main(String[] args) throws Exception {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();
//        Thread.sleep(2000);
        //find all elements "input" and store them in List checkboxes
        List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
        //loop through this list of checkboxes
        for(WebElement checkbox : checkboxes){
            Thread.sleep(2000);
            //if checkbox is not selected yet
            if(!checkbox.isSelected()){
                //check this checkbox
                checkbox.click();
            }
        }


    }
}
