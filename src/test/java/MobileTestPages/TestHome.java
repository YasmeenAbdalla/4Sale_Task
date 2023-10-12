package MobileTestPages;

import MobilePages.Home;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHome extends MobileTestBase {
    Home home;

    @Test(description = "Open post an ad")
    public void openPostAnAd(){
        home = new Home(driver);
       driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
        home.clickToPostAnAd();

    }
}
