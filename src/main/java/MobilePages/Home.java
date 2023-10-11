package MobilePages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class Home extends PageBase {

    public Home(AppiumDriver driver) {
        super (driver);

    }

    private By postAnAd = By.id("navgraph_postad");
    public void clickToPostAnAd(){
       driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

     driver.findElement(postAnAd).click();

    }




}
