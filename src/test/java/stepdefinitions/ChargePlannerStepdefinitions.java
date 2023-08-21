package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.ChargePlannerPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static utilities.Driver.appiumDriver;

public class ChargePlannerStepdefinitions {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    ChargePlannerPage chargePlannerPage=new ChargePlannerPage();
    TouchAction action=new TouchAction(Driver.getAndroidDriver());
    @Given("Kullanici gerekli kurulumlari yaparak apk yukleme {string} islemini gerceklestirir")
    public void kullanici_gerekli_kurulumlari_yaparak_apk_yukleme_islemini_gerceklestirir(String apk) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver; //android cihazlarin driveri
        final String cihazAdi = "PIXEL2";
        final String platformIsmi = "Android";
        final String version = "10.0";
        final String automation = "UiAutomator2";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, cihazAdi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformIsmi);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, automation);
        capabilities.setCapability(MobileCapabilityType.APP, apk);

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("ilk ekran ayarlarini yapin  {string} a tiklayin ve programa giris yapin")
    public void ilkEkranAyarlariniYapinATiklayinVeProgramaGirisYapin(String string) {


        // 962 1916
        ReusableMethods.wait(5);
        chargePlannerPage.allowLocation.click();

        for (int i=0; i<3; i++){
            action.press(PointOption.point(957,1893))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .release().perform();
        }
        ReusableMethods.scrollWithUiScrollable(string);
    }
}

