package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_SmartBears_LogInVerification {
    /*
        TC#5:	Basic	login	authentication
    */
    public static void main(String[] args) {

        // -Open	a	chrome	browser2
        // -Go to:	http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders");
        driver.manage().window().maximize();

        // -Verify	title	equals: Expected:	Web	Orders	Login4
        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("HomePage title is passed!");
        } else {
            System.out.println("HomePage title is failed!");
        }

        // -Enter	username:	Tester5
        // -Enter	password:	test6
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        // -Click	“Sign	In”	button7
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        // -Verify	title.equals: Expected:	"Web Order"
        if (driver.getTitle().equals("Web Orders")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        driver.close();

    }
}

