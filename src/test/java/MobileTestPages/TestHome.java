package MobileTestPages;

import MobilePages.Home;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHome extends MobileTestBase {
    Home home;

    @Test
    public void openPostAnAd(){
        home = new Home((AppiumDriver<MobileElement>) driver);
       driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
        home.clickToPostAnAd();

    }
}
