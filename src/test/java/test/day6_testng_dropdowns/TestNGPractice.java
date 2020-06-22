package test.day6_testng_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGPractice {

    @BeforeClass
    public void before_class() {
        System.out.println("BeforeClass is running! ==========================================");
    }

    @AfterClass
    public void after_class() {
        System.out.println("AfterClass is running!=========================================");
    }

    @BeforeMethod
    public void setup() {
        System.out.println("BeforeMethod is running");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("AfterMethod is running");
    }

    @Test
    public void test1() {
        System.out.println("test1 is running...");

        String actualTitle = "HomePage";
        String expectedTitle = "HomePage";

        Assert.assertEquals(actualTitle, expectedTitle);

//        if (actualTitle.equals(expectedTitle)) {
//            System.out.println("Title verification Passed!");
//        } else {
//            System.out.println("Title verification Failed!");
//        }
    }

    @Ignore // to ignore this test to run
    @Test
    public void test2() {
        System.out.println("test2 is running...");

        String str1 = "Java";
        String str2 = "Python";

        Assert.assertEquals(str1, str2);
    }

    //@Test to ignore this test to run
    public void test3() {
        System.out.println("test3 is running...");

        String actualTitle = "Amazon Prime";
        String expectedTitle = "Prime";
        String testString = "adlsdnfkl";

        System.out.println(actualTitle.contains(expectedTitle)); // true
        Assert.assertTrue(actualTitle.contains(expectedTitle)); // true

        Assert.assertFalse(actualTitle.contains(testString)); // false, it will not give an error
    }
}
