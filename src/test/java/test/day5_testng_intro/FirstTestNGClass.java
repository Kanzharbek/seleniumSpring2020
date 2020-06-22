package test.day5_testng_intro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGClass {

    @BeforeMethod // runs once before every @Test method
    public void setUp() {
        System.out.println("Before method is running...");
    }

    @AfterMethod // runs after each @Test method
    public void tearDown() {
        System.out.println("After method is running");
    }

    @Test // test in testNG, mandatory to specify it here to import
    public void test1() {
        System.out.println("Test1 is running...");
    }

    @Test
    public void test2() {
        System.out.println("Test2 is running");
    }



}
