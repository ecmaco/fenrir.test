package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class ChargePlannerPage {

    public ChargePlannerPage(){
        //PageFactory.initElements((WebDriver)Driver.getAndroidDriver(),this);
       PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);

    }



    @FindBy(xpath = "//*[@text='Allow only while using the app']")
    public MobileElement allowLocation;

    @FindBy(xpath = "//*[@index='21']")
    public MobileElement Location;

    @FindBy(xpath = "(//*[@class='android.view.View']//*[@index='3'])[2]")
    public MobileElement settings;

    @FindBy(xpath = "//*[@text='Email address']")
    public MobileElement emailAdressLabel;


    @FindBy(xpath = "//*[@text='Password']")
    public MobileElement passwordLabel;

    @FindBy(xpath = "(//*[@text='Login'])[2]")
    public MobileElement loginButton;


    @FindBy(xpath = "//*[@text='Full Name']")
    public MobileElement fullNameLabel;

    @FindBy(xpath = "//*[@text='Email address']")
    public MobileElement emailLabel;

    @FindBy(xpath = "//*[@text='Password']")
    public MobileElement passwordSignUpLabel;

    @FindBy(xpath = "//*[@text='Confirm Password']")
    public MobileElement confirmPasswordLabel;

    @FindBy(xpath = "//*[@text='Sign Up']")
    public MobileElement signUpLabel;

    @FindBy(xpath = "//*[@text='Add My Car']")
    public  MobileElement addMyCarButton;

    @FindBy(xpath = "//*[@text='Opel Astra Electric']")
    public MobileElement searchResultCarList;

    @FindBy (xpath = "//*[@text='Profile Settings']")
    public MobileElement profileSettingsButton;

    @FindBy(xpath = "//*[@class='android.widget.ImageView']")
    public MobileElement searchCarResultAllList;

}
