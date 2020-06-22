package test.day4_findElements_check_radio_boxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class P3_apple_findElements {
    public static void main(String[] args) {

        //TC #03: FINDELEMENTS_APPLE
        //1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to all of the headers one by one a.Mac, iPad, iPhone, Watch, TV, Music, Support
        //MAC:
        WebElement mac = driver.findElement(By.linkText("/mac/"));
        mac.click();
        String macTitle = driver.getTitle();
        List<WebElement> listOfLinksMac = driver.findElements(By.xpath("//html/a"));
        int linksWithoutTextMac = 0;
        int linksWithTextMac = 0;
        for (WebElement each : listOfLinksMac) {
            String eachLinkText = each.getText();
            if (eachLinkText.isEmpty()) {
                linksWithoutTextMac++;
            } else {
                linksWithTextMac++;
            }
        }
        //iPad
        WebElement ipad = driver.findElement(By.linkText("/ipad/"));
        ipad.click();
        String iPadTitle = driver.getTitle();
        List<WebElement> listOfLinksIpad = driver.findElements(By.xpath("//html//a"));
        int linksWithoutTextIpad = 0;
        int linksWithTextIpad = 0;
        for (WebElement each : listOfLinksIpad) {
            String eachLinkText = each.getText();
            if (eachLinkText.isEmpty()) {
                linksWithoutTextIpad++;
            } else {
                linksWithTextIpad++;
            }
        }

        //iPhone
        WebElement iphone = driver.findElement(By.linkText("/iphone/"));
        iphone.click();
        String iPhoneTitle = driver.getTitle();
        List<WebElement> listOfLinksIphone = driver.findElements(By.xpath("//html//a"));
        int linksWithoutTextIphone = 0;
        int linksWithTextIphone = 0;
        for (WebElement each : listOfLinksIphone) {
            String eachLinkText = each.getText();
            if (eachLinkText.isEmpty()) {
                linksWithoutTextIphone++;
            } else {
                linksWithTextIphone++;
            }
        }

        //Watch
        WebElement watch = driver.findElement(By.linkText("/watch/"));
        watch.click();
        String watchTitle = driver.getTitle();
        List<WebElement> listOfLinksWatch = driver.findElements(By.xpath("//html//a"));
        int linksWithoutTextWatch = 0;
        int linksWithTextWatch = 0;
        for (WebElement each : listOfLinksWatch) {
            String eachLinkText = each.getText();
            if (eachLinkText.isEmpty()) {
                linksWithoutTextWatch++;
            } else {
                linksWithTextWatch++;
            }
        }

        //TV
        WebElement tv = driver.findElement(By.linkText("/tv/"));
        tv.click();
        String tvTitle = driver.getTitle();
        List<WebElement> listOfLinksTv = driver.findElements(By.xpath("//html//a"));
        int linksWithoutTextTv = 0;
        int linksWithTextTv = 0;
        for (WebElement each : listOfLinksTv) {
            String eachLinkText = each.getText();
            if (eachLinkText.isEmpty()) {
                linksWithoutTextTv++;
            } else {
                linksWithTextTv++;
            }
        }

        //Music

        WebElement music = driver.findElement(By.linkText("/music/"));
        music.click();
        String musicTitle = driver.getTitle();
        List<WebElement> listOfLinksMusic = driver.findElements(By.xpath("//html//a"));
        int linksWithoutTextMusic = 0;
        int linksWithTextMusic = 0;
        for (WebElement each : listOfLinksMusic) {
            String eachLinkText = each.getText();
            if (eachLinkText.isEmpty()) {
                linksWithoutTextMusic++;
            } else {
                linksWithTextMusic++;
            }
        }

        //Support
        WebElement support = driver.findElement(By.linkText("https://support.apple.com"));
        support.click();
        String supportTitle = driver.getTitle();
        List<WebElement> listOfLinksSupport = driver.findElements(By.xpath("//html//a"));
        int linksWithoutTextSupport = 0;
        int linksWithTextSupport = 0;
        for (WebElement each : listOfLinksSupport) {
            String eachLinkText = each.getText();
            if (eachLinkText.isEmpty()) {
                linksWithoutTextSupport++;
            } else {
                linksWithTextSupport++;
            }
        }

        // 4.Printout how many links on each page with the titles of the pages
        System.out.println("Links with titles on Mac: " + macTitle);
        System.out.println("Links with titles on iPad: " + iPadTitle);
        System.out.println("Links with titles on iPhone: " + iPadTitle);
        System.out.println("Links with titles on watch: " + watchTitle);
        System.out.println("Links with titles on TV: " + tvTitle);
        System.out.println("Links with titles on Music: " + musicTitle);
        System.out.println("Links with titles on Support: " + supportTitle);

        // 5.Loop through all
        //Done in step #3

        // 6.Print out how many link is missing textTOTAL
        System.out.println("Number of links without text on Mac: " + linksWithoutTextMac);
        System.out.println("Number of links without text on iPad: " + linksWithoutTextIpad);
        System.out.println("Number of links without text on iPhone: " + linksWithoutTextIphone);
        System.out.println("Number of links without text on Watch: " + linksWithoutTextWatch);
        System.out.println("Number of links without text on TV: " + linksWithoutTextTv);
        System.out.println("Number of links without text on Music: " + linksWithoutTextMusic);
        System.out.println("Number of links without text on Support: " + linksWithoutTextSupport);

        // 7.Print out how many link has textTOTAL
        System.out.println("Number of links with text on Mac: " + linksWithTextMac);
        System.out.println("Number of links with text on iPad: " + linksWithTextIpad);
        System.out.println("Number of links with text on iPhone: " + linksWithTextIphone);
        System.out.println("Number of links with text on Watch: " + linksWithTextWatch);
        System.out.println("Number of links with text on TV: " + linksWithTextTv);
        System.out.println("Number of links with text on Music: " + linksWithTextMusic);
        System.out.println("Number of links with text on Support: " + linksWithTextSupport);
        // 8.Print out how many total linkTOTAL
        System.out.println("Total number of links on Mac: " + listOfLinksMac.size());
        System.out.println("Total number of links on iPad: " + listOfLinksIpad.size());
        System.out.println("Total number of links on iPhone: " + listOfLinksIphone.size());
        System.out.println("Total number of links on Watch: " + listOfLinksWatch.size());
        System.out.println("Total number of links on TV: " + listOfLinksTv.size());
        System.out.println("Total number of links on Music: " + listOfLinksMusic.size());
        System.out.println("Total number of links on Support: " + listOfLinksSupport.size());
    }
}
