package MobilePages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class PostAnAd extends PageBase{
    public PostAnAd(AppiumDriver driver) {
        super(driver);
    }


    private By okButton= By.xpath("//android.widget.LinearLayout//android.widget.Button[@resource-id='android:id/button1']");
    private By chooseCategory=By.id("chooseCategoryField");

    private By selectAutomotive= By.xpath("//*[@text='Automotive']");

  private By selectCar=By.xpath("//*[@text='Cars']");
  private By selectVersionCar=By.xpath("//*[@text='A1']");

  private By nextButton= By.xpath("//*[@text='Next']");

  private By validationOfLocation=By.xpath("//android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");

    private By validationOfRequired=By.xpath("//android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView");

    private By titlePost=By.id("adTitleField");
    private By priceField=By.id("adPriceField");

    private By addMedia=By.xpath("//*[@text='Add Media']");

    private By location=By.id("chooseDistrictField");
     private By chooseDistrict= By.id("locationSelectorText");
     private By districtList=By.xpath("//*[@text='Ahmadi']");
     private By doneButton= By.id("btnProceed");

     private By area=By.xpath("//*[@text='Choose Area']");

     private By areaList=By.xpath("//*[@text='Middle of Ahmadi']" );

    private By chooseBlock=By.xpath("//*[@text='Choose Block']");
     private By blockList= By.xpath("//*[@text='Block 9']");

     private By doneLocation=By.xpath("//*[@text='Done']");

     private By selectCarType= By.xpath("//*[@text='Audi']");


    public void clickChooseCategory(){
        driver.findElement(chooseCategory).click();
        clickToSelectAutomotive();
        clickToSelectCar();
    }

    private void clickToSelectAutomotive(){
        driver.findElement(selectAutomotive).click();
    }

    private void clickToSelectCar(){
        driver.findElement(selectCar).click();

    }

    public void clickToSelectVersionCar(){

        driver.findElement(selectVersionCar).click();

    }

    public void clickToNext(){
        driver.findElement(nextButton).click();

    }

    public String getValidationOfLocation(){
        return driver.findElement(validationOfLocation).getText();
    }

    public String getValidationOfTitle(){
        return driver.findElement(validationOfRequired).getText();
    }

    public String getValidationOfPrice(){
        return driver.findElement(validationOfRequired).getText();
    }

    public void enterPostTitle(String postTitle){
        driver.findElement(titlePost).click();
        driver.findElement(titlePost).sendKeys(postTitle);
    }

    public void enterPrice(String price){
        driver.findElement(priceField).click();
        driver.findElement(priceField).sendKeys(price);
        driver.navigate().back();

    }

    public String getTitleOfNextScreen(){
        return driver.findElement(addMedia).getText();
    }

    public void clickToLocation(){
        driver.findElement(location).click();
        clickChooseDistrict();
        clickToChooseArea();
        clickToChooseBlock();
        driver.findElement(doneLocation).click();
    }

    private void clickChooseDistrict(){
        driver.findElement(chooseDistrict).click();
        driver.findElement(districtList).click();
        driver.findElement(doneButton).click();
    }
    private void clickToChooseArea(){
        driver.findElement(area).click();
        driver.findElement(areaList).click();
        driver.findElement(doneButton).click();
    }

    private void clickToChooseBlock(){
        driver.findElement(chooseBlock).click();
        driver.findElement(blockList).click();
        driver.findElement(doneButton).click();
    }

    public void clickOkButton(){
        driver.findElement(okButton).click();
    }




}
