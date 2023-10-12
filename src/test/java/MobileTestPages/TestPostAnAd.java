package MobileTestPages;

import MobilePages.PageBase;
import MobilePages.PostAnAd;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestPostAnAd extends MobileTestBase{

    PostAnAd postAnAd;


    @Test(priority = 0, description = "Check Validation Message will Appear")
    public void checkValidationMessageAppeared(){
        postAnAd=new PostAnAd(driver);
        postAnAd.clickOkButton();
        postAnAd.clickChooseCategory();
        scrollDownIntoText("Audi").click();
        postAnAd.clickToSelectVersionCar();
        postAnAd.clickToNext();
        assertEquals("Validation Messages of Location are not the same","Location information is mandatory",postAnAd.getValidationOfLocation());
        assertEquals("Validation Messages of Title are not the same","Required",postAnAd.getValidationOfTitle());
        assertEquals("Validation Messages of Price are not the same","Required",postAnAd.getValidationOfPrice());


    }

    @Test(priority = 1, description = "Check Next Screen will open")
    public void checkNextScreenOpened(){
        postAnAd=new PostAnAd((AppiumDriver)driver);
        postAnAd.clickToLocation();
        postAnAd.enterPostTitle("Ad To Audi Car");
        postAnAd.enterPrice("50");
        postAnAd.clickToNext();
        assertEquals("Next screen don't open successfully",postAnAd.getTitleOfNextScreen(),"Add Media");


    }
}
