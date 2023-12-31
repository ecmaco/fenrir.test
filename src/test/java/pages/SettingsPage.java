package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;



public class SettingsPage {

    public SettingsPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//*[@text='Allow only while using the app']")
    public MobileElement allowButton;

    @FindBy(xpath = "(//*[@package='com.ecma.smc'])[20]")
    public MobileElement crossButton;

    @FindBy(xpath = "//*[@text='Email address']")
    public MobileElement emailAdressTextBox;

    @FindBy(xpath = "//*[@text='Password']")
    public MobileElement passwordTextBox;

    @FindBy(xpath = "(//*[@text='Login'])[2]")
    public MobileElement loginButton;

    @FindBy(xpath = "//*[@text='Login With Google']")
    public MobileElement loginWithGoogleButton;

    @FindBy(xpath = "//*[@text='Continue Without Login']")
    public MobileElement continueWithoutLoginButton;

    @FindBy(xpath = "//*[@text='Sign Up']")
    public MobileElement signUpButton;

    @FindBy(xpath = "//*[@bounds='[810,2013][1080,2148]']")
    public MobileElement settingsButton;

    @FindBy(xpath = "//*[@text='Profile Settings']")
    public MobileElement profilSettingsButton;

    @FindBy(xpath = "//*[@text='App Settings']")
    public MobileElement appSettingsButton;

    @FindBy(xpath = "//*[@text='Updates']")
    public MobileElement updatesButton;

    @FindBy(xpath = "//*[@text='Remove My Account']")
    public MobileElement removeMyAccountButton;

    @FindBy(xpath = "//*[@text='User Name']")
    public MobileElement usernameBox;

    @FindBy(xpath = "//*[@text='Full Address']")
    public MobileElement fullAdressBox;

    @FindBy(xpath = "//*[@text='+']")
    public MobileElement phoneNumberBox;

    @FindBy(xpath = "//*[@text='Car']")
    public MobileElement carBox;

    @FindBy(xpath = "//*[@text='Save']")
    public MobileElement saveButton;

    @FindBy(xpath = "//*[@bounds='[33,165][143,275]']")
    public MobileElement backButton;

    @FindBy(xpath = "//*[@text='Dark']")
    public MobileElement darkSelect;

    @FindBy(xpath = "//*[@text='Light']")
    public MobileElement lightSelect;

    @FindBy(xpath = "//*[@text='English']")
    public MobileElement englishSelect;

    @FindBy(xpath = "//*[@text='Turkish']")
    public MobileElement turkishSelect;

    @FindBy(xpath = "//*[@text='French']")
    public MobileElement frenchSelect;

    @FindBy(xpath = "//*[@text='Metric']")
    public MobileElement metricSelect;

    @FindBy(xpath = "//*[@text='Imperial']")
    public MobileElement imperialSelect;

    @FindBy(xpath = "(//*[@text='2023 Öne Çıkanlar'])[2]")
    public MobileElement trText;

    @FindBy(xpath = "(//*[@text='Monday, April 3, 2023'])[1]")
    public MobileElement trEnText;

    @FindBy(xpath = "//*[@bounds='[44,716][687,782]']")
    public MobileElement enText;

    @FindBy(xpath = "//*[@bounds='[0,592][1080,1977]']")
    public MobileElement trContainText;

    @FindBy(xpath = "//*[@bounds='[0,592][1080,1977]']")
    public MobileElement enContainText;

    @FindBy(xpath = "//*[@text='Please sign-up to use this function.']")
    public MobileElement errorMessage;

    @FindBy(xpath = "//*[@text='test@mail.com']")
    public MobileElement mailText;

    @FindBy(xpath = "//*[@text='\uE001']")
    public MobileElement profilIcon;

    @FindBy(xpath = "//*[@text='test test']")
    public MobileElement nameText;

    @FindBy(xpath = "//*[@text='Profile informations has been updated']")
    public MobileElement updateText;

    @FindBy(xpath = "//*[@text='Remove My Account']")
    public MobileElement removeText;

    @FindBy(xpath = "//*[@text='OK']")
    public MobileElement removeAcceptButton;

    @FindBy(xpath = "//*[@text='CANCEL']")
    public MobileElement removeCancelButton;

    @FindBy(id = "android:id/contentPanel")
    public MobileElement profilSettingsFrame;

    public WebElement getLocateWithText(String text) {

        return Driver.getAndroidDriver().findElementByXPath("//*[@text='" + text + "']");
    }
    @FindBy(xpath = "//*[@text='Add My Car']")
    public MobileElement addMyCarButton;

    @FindBy(xpath = "//*[@text='Search Car']")
    public MobileElement searchCarBox;

    @FindBy(xpath = "//*[@class='android.widget.ImageView']")
    public MobileElement chosenCar;

    @FindBy(xpath = "//*[@text='Save']")
    public MobileElement carSavedButton;

    @FindBy(xpath = "//*[@text='OK']")
    public MobileElement allowCarInformation;


    @FindBy(xpath = "//*[@text='Messages']")
    public MobileElement messagesButton;

    @FindBy(xpath = "//*[@text='No Messages']")
    public MobileElement noMessagesText;

    @FindBy(xpath = "//*[@text='My Chargers']")
    public MobileElement myChargersButton;

    @FindBy(xpath = "//*[@text='No Chargers']")
    public MobileElement noChargersText;

    @FindBy(xpath = "(//*[@index='1'])[6]")
    public MobileElement listYourChargerButton;

    @FindBy(xpath = "//*[@text='Next']")
    public MobileElement nextButton;

    @FindBy(xpath = "//*[@text='Max kWh']")
    public MobileElement maxKwh;

    @FindBy(xpath = "//*[@text='Kw Price']")
    public MobileElement kwPrice;

    @FindBy (xpath = "//*[@text='Currency']")
    public MobileElement currency;

    @FindBy(xpath = "//*[@text='Plug Type']")
    public MobileElement plugType;

    @FindBy(xpath = "//*[@text='Charger Brand']")
    public MobileElement chargerBrand;

    @FindBy(xpath = "//*[@text='Payment Type']")
    public MobileElement paymentType;

    @FindBy(xpath = "//*[@text='Finish']")
    public MobileElement finishButton;

    @FindBy(xpath = "//*[@text='Description']")
    public MobileElement description;

    @FindBy (xpath = "//*[@text='Your charger station has been added successfully, we will inform you after approve.']")
    public MobileElement addedChargerConfirm;




}

