package test.day4_findElements_check_radio_boxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class P05_SeleniumEasy_checkbox1 {

    public static void main(String[] args) {

        // TC #2: SeleniumEasy CheckboxVerification–Section 1
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // 2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify “Success –Check box is checked” message is NOT displayed.
        WebElement successCheckbox = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        WebElement successMessage = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        if(!successCheckbox.isSelected() && !successMessage.isDisplayed()){
            System.out.println("Success message is not displayed, PASS!");
        }else {
            System.out.println("Success message is displayed, Fail!");
        }
        // 4.Click to checkbox under “Single Checkbox Demo” section
        successCheckbox.click();
        // 5.Verify “Success –Check box is checked” message is displayed.
        if(successCheckbox.isSelected() && successMessage.isDisplayed()){
            System.out.println("Success checkbox is selected, PASS!");
        }else {
            System.out.println("Success checkbox is not selected, Fail!");
        }

    }
}
