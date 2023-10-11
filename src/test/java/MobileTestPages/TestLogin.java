package MobileTestPages;

import MobilePages.Login;
import io.appium.java_client.AppiumDriver;

import mobileTestBase.MobileTestBase;
import org.testng.annotations.Test;

public class TestLogin extends MobileTestBase {
    Login login;

    @Test (description = "Login to can create post ad")
    public void LoginToPost(){
        login=new Login( driver);
        login.enterPhoneNumber("00000111");
        login.enterPassword("4saleTest");
        login.clickToLogin();


    }
}
