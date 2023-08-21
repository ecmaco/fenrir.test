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
       // PageFactory.initElements((WebDriver)Driver.getAndroidDriver(),this);
       PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);

    }



    @FindBy(xpath = "//*[@text='Allow only while using the app']")
    public WebElement allowLocation;
}
