package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SettingsPage {
    public SettingsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
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
}
