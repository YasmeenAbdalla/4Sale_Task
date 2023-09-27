package MobileTestPages;

import MobilePages.PageBase;
import MobilePages.PostAnAd;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestPostAnAd extends MobileTestBase{

    PostAnAd postAnAd;


    @Test(priority = 0)
    public void checkValidationMessageAppeared(){
        postAnAd=new PostAnAd((AppiumDriver< MobileElement >)driver);
        postAnAd.clickOkButton();
        postAnAd.clickChooseCategory();
        clickToSelectCarType();
        postAnAd.clickToSelectVersionCar();
        postAnAd.clickToNext();
        assertEquals("Validation Messages of Location are not the same","Location information is mandatory",postAnAd.getValidationOfLocation());
        assertEquals("Validation Messages of Title are not the same","Required",postAnAd.getValidationOfTitle());
        assertEquals("Validation Messages of Price are not the same","Required",postAnAd.getValidationOfPrice());


    }

    @Test(priority = 1)
    public void checkNextScreenOpened(){
        postAnAd=new PostAnAd((AppiumDriver< MobileElement >)driver);
        postAnAd.clickToLocation();
        postAnAd.enterPostTitle("Ad To Audi Car");
        postAnAd.enterPrice("50");
        postAnAd.clickToNext();
        assertEquals("Next screen don't open successfully",postAnAd.getTitleOfNextScreen(),"Add Media");


    }
}
