package MobileTestPages;

import MobilePages.Login;
import org.testng.annotations.Test;

public class TestLogin extends MobileTestBase{
    Login login;

    @Test(description = "Login from the AdPost")
    public void LoginToPost(){
        login=new Login(driver);
        login.enterPhoneNumber("00000111");
        login.enterPassword("4saleTest");
        login.clickToLogin();


    }
}
