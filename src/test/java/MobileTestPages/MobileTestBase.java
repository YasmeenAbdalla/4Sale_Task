package MobileTestPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTestBase {
public static AndroidDriver driver;



    @BeforeSuite
    public void startDriver() throws MalformedURLException {

        DesiredCapabilities AndroidObject = new DesiredCapabilities();

        AndroidObject.setCapability("platformName", "Android");

        AndroidObject.setCapability("platformVersion", "11.0");

        AndroidObject.setCapability("udid", "3422152382001CN");

        AndroidObject.setCapability("automationName", "UiAutomator2");
        AndroidObject.setCapability("app", System.getProperty("user.dir")+"/App/base.apk");
        driver = new AndroidDriver <WebElement>(new URL("http://localhost:4723/"), AndroidObject);


    }

    public void clickToSelectCarType(){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Audi\").instance(0))").click();

    }


    @AfterSuite
    public void endDriver(){
        driver.quit();
    }



}
