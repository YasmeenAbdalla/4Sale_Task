package MobilePages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Login extends PageBase{

    public Login(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private By phoneNumber= By.xpath("//android.view.View[@resource-id='phoneNumberField']//android.widget.EditText");
    private By password=By.xpath("//android.view.View/android.view.View[2]/android.view.View/android.widget.EditText" );

    private By loginButton=By.xpath("//android.view.View[@resource-id='loginBtn']//android.widget.Button");

    public void enterPhoneNumber(String phone){
        driver.findElement(phoneNumber).click();
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void enterPassword(String Password){
        driver.findElement(password).click();
        driver.findElement(password).sendKeys(Password);
    }

    public void clickToLogin(){
        driver.findElement(loginButton).click();
    }




}
