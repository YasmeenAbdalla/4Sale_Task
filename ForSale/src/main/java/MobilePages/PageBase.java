package MobilePages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    AppiumDriver <MobileElement> driver;

    public PageBase(AppiumDriver <MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver=driver;
    }






}
