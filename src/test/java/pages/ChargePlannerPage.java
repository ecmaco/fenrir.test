package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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

    @FindBy(xpath = "//*[@index='3']")
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

    @FindBy(xpath = "//*[@text='Invalid login credentials']")
    public MobileElement gecersizgirismesaji;
    @FindBy(xpath = "//*[@text='Forgot Password?']")
    public MobileElement forgatPassword;
    @FindBy(xpath = "//*[@text='Email address']")
    public MobileElement sifirlamaEmail;
    @FindBy(xpath = "//*[@text='Reset My Password']")
    public MobileElement resetMyPassword;
    @FindBy(xpath = "//*[@text='Please Check your email']")
    public MobileElement checkEmailMessage;
    @FindBy(xpath = "//*[@bounds='[810,2013][1080,2148]']")
    public MobileElement settingsButton;
    @FindBy(xpath = "//*[@text='OK']")
    public MobileElement OKbutton;
    @FindBy(xpath = "//*[@text='Login With Google']")
    public MobileElement googleGirisButonu;

    @FindBy(xpath = "//*[@text='NEXT']")
    public MobileElement nextButonuG;
    @FindBy(xpath = "//*[@bounds='[66,707][1006,853]']")
    public MobileElement emailGirisG;
    @FindBy(xpath = "//*[@bounds='[66,745][1014,905]']")
    public MobileElement passwordGirisG;
    @FindBy(xpath = "//*[@text='DON’T TURN ON']")
    public MobileElement dontTurnButtonG;
    @FindBy(xpath = "//*[@text='I agree']")
    public MobileElement iagreeButtonG;
    @FindBy(xpath = "//*[@text='MORE']")
    public MobileElement moreButtonG;
    @FindBy(xpath = "//*[@text='ACCEPT']")
    public MobileElement acceptButtonG;
    @FindBy(xpath = "//*[@text='alexmahone2324@gmail.com']")
    public MobileElement mailTextG;
    @FindBy(xpath = "//*[@bounds='[72,1088][964,1246]']")
    public MobileElement googleGirisYeni;

    @FindBy(xpath = "//*[@text='Sign Up']")
    public MobileElement signUpButton;
    @FindBy(xpath = "//*[@bounds='[22,813][1058,978]']")
    public MobileElement nameSignup;
    @FindBy(xpath = "//*[@bounds='[22,1000][1058,1165]']")
    public MobileElement emailSignUp;
    @FindBy(xpath = "//*[@bounds='[22,1187][1058,1352]']")
    public MobileElement passwordSignUp;
    @FindBy(xpath = "//*[@text='Confirm Password']")
    public MobileElement password2SingUp;
    @FindBy(xpath = "//*[@text='mahmut14@mail.com']")
    public MobileElement mailTextGenel;
    @FindBy(xpath = "//*[@text='Please check both passwords']")
    public MobileElement ayniSifre;
    @FindBy(xpath = "//*[@text='User already registered']")
    public MobileElement kayitemailinfo;

    @FindBy(xpath = "(//*[@bounds='[959,1231][1025,1298]'])[1]")
    public MobileElement gozisareti;

    @FindBy(xpath = "//*[@text='1234abcd']")
    public MobileElement gozsifre;

    @FindBy(xpath = "(//*[@bounds='[959,1044][1025,1111]'])[1]")
    public MobileElement gozisaretiLogin;
    @FindBy(xpath = "//*[@text='Password']")
    public MobileElement passwordTextBox;
    @FindBy(xpath = "//*[@text='qwer1234']")
    public MobileElement gozTestiSifre;

    @FindBy(xpath = "//*[@bounds='[978,182][1028,237]']")
    public MobileElement aramaCubugu;
    @FindBy(xpath = "//*[@text='Search Location']")
    public MobileElement searchLocation;
    @FindBy(xpath = "//*[@text='Edremit']")
    public MobileElement edremitLocation;
    @FindBy(xpath = "//*[@text='Bostancı mah. Bataklar Küme Evleri No:17 Edremit/Balıkesir']")
    public MobileElement edremitLocation2;

}
