package MobileTestPages;

import MobilePages.Login;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class TestLogin extends MobileTestBase{
    Login login;

    @Test
    public void LoginToPost(){
        login=new Login((AppiumDriver< MobileElement >) driver);
        login.enterPhoneNumber("00000111");
        login.enterPassword("4saleTest");
        login.clickToLogin();


    }
}
