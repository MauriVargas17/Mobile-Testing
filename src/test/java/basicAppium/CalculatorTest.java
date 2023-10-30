package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class CalculatorTest {
    AppiumDriver phone;

    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Mobile Testing");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
        phone = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

//    @Test
//    public void verifyAddTwoNumbers() throws InterruptedException {
//        // click  5
//        phone.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
//        // click +
//        phone.findElement(By.id("com.google.android.calculator:id/op_add")).click();
//        // click 7
//        phone.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
//        // click  =
//        phone.findElement(By.id("com.google.android.calculator:id/eq")).click();
//        // verification  expectedResult 12 = actualResult 12
//        Thread.sleep(5000);
//        String expectedResult="12";
//        String actualResult= phone.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
//        Assertions.assertEquals(expectedResult,actualResult,"ERROR la suma esta mal");
//        Thread.sleep(5000);
//    }

    @Test
    public void verifyAddTwoNumbersWithXPath() throws InterruptedException {
        phone.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"5\"]")).click();
        // click +
        phone.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]")).click();
        // click 7
        phone.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"7\"]")).click();
        // click  =
        phone.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]")).click();
        // verification  expectedResult 12 = actualResult 12
        Thread.sleep(5000);
        String expectedResult="12";
        String actualResult= phone.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/result_final\"]")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR la suma esta mal");
    }

    @AfterEach
    public void closeApp(){
        phone.quit();
    }

//    @Test
//    public void verifyCalculatorTest() throws InterruptedException {
//        Thread.sleep(5000);
//    }

}
