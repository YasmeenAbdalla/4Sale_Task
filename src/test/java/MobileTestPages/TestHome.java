package MobileTestPages;

import MobilePages.Home;
import io.appium.java_client.AppiumDriver;
import mobileTestBase.MobileTestBase;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHome extends MobileTestBase {
    Home home;

    @Test(description = "Open 4Sale app and click to Post Ad")
    public void openPostAnAd(){
        home = new Home( driver);
       driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
        home.clickToPostAnAd();

    }
}
