package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.ChargePlannerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static utilities.Driver.appiumDriver;

public class ChargePlannerStepdefinitions {

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
        capabilities.setCapability(MobileCapabilityType.NO_RESET,false);

        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

  /*
    @Given("ilk ekran ayarlarini yapin  {string} a tiklayin ve programa giris yapin")
    public void ilkEkranAyarlariniYapinATiklayinVeProgramaGirisYapin(String string) {

        ReusableMethods.wait(5);
        ReusableMethods.clickWithTimeOut(chargePlannerPage.allowLocation,3);

        for (int i=0; i<5; i++){
            action.press(PointOption.point(957,1893))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .release().perform();
        }
        ReusableMethods.wait(1);
        ReusableMethods.scrollWithUiScrollable(string);
        //ReusableMethods.wait(5);
        ReusableMethods.waitForVisibility((MobileElement) chargePlannerPage.settings);
       // ReusableMethods.fluentWait(chargePlannerPage.Location,150);
        chargePlannerPage.settings.click();
        ReusableMethods.wait(7);
    }

    /*

    @Given("ilk ekran ayarlarini yapin login olmak icin {string} ve {string} girerek  programa giris yapin")
    public void ilkEkranAyarlariniYapinLoginOlmakIcinVeGirerekProgramaGirisYapin(String arg0, String arg1) {
        ReusableMethods.wait(5);
        ReusableMethods.clickWithTimeOut(chargePlannerPage.allowLocation,3);

        for (int i=0; i<5; i++){
            action.press(PointOption.point(957,1893))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .release().perform();
        }
        ReusableMethods.wait(1);
        chargePlannerPage.emailAdressLabel.sendKeys(arg0);
        ReusableMethods.wait(1);
        chargePlannerPage.passwordLabel.sendKeys(arg1);
        ReusableMethods.wait(1);
        //ReusableMethods.textClick("Login");
        chargePlannerPage.loginButton.click();
        ReusableMethods.wait(3);
        ReusableMethods.waitForVisibility((MobileElement) chargePlannerPage.settings);
        // ReusableMethods.fluentWait(chargePlannerPage.Location,150);
        chargePlannerPage.settings.click();
        ReusableMethods.wait(7);
    }

     */

    /*
    @Given("ilk ekran ayarlarini yapin ve {string} butonuna tiklayarak yeni hesap olusturarak Login girisi yapin")
    public void ilkEkranAyarlariniYapinVeButonunaTiklayarakYeniHesapOlusturarakLoginGirisiYapin(String arg0) {
        ReusableMethods.wait(5);
        ReusableMethods.clickWithTimeOut(chargePlannerPage.allowLocation,3);

        for (int i=0; i<5; i++){
            action.press(PointOption.point(957,1893))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .release().perform();
        }
        ReusableMethods.wait(1);
        ReusableMethods.scrollWithUiScrollable(arg0);
        ReusableMethods.wait(1);
        chargePlannerPage.fullNameLabel.sendKeys("ysusuf");
        chargePlannerPage.emailLabel.sendKeys("yusufk@gmail.com");
        chargePlannerPage.passwordSignUpLabel.sendKeys("Yks3683542");
        chargePlannerPage.confirmPasswordLabel.sendKeys("Yks3683542");
        chargePlannerPage.signUpLabel.click();
        ReusableMethods.wait(3);
    }

     */

    @Given("ilk ekran ayarlari yapin")
    public void ilkEkranAyarlariYapin() {
        do {
            ReusableMethods.clickWithTimeOut(chargePlannerPage.allowLocation, 3);
            ReusableMethods.wait(5);
        } while (ReusableMethods.control());

        for (int i = 0; i < 4; i++) {
            action.press(PointOption.point(957, 1893))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .release().perform();
        }
    }

    @Given("yeni hesap olusturun")
    public void yeniHesapOlusturun() {

        ReusableMethods.scrollWithUiScrollable("Sign Up");
        chargePlannerPage.fullNameLabel.sendKeys("test test");
        chargePlannerPage.emailLabel.sendKeys("test@mail.com");
        chargePlannerPage.passwordSignUpLabel.sendKeys("qwer1234");
        chargePlannerPage.confirmPasswordLabel.sendKeys("qwer1234");
        chargePlannerPage.signUpLabel.click();
    }

    @Given("kullanici girisi yapin")
    public void kullaniciGirisiYapin() {

        chargePlannerPage.emailAdressLabel.sendKeys(ConfigReader.getProperty("mail"));
        chargePlannerPage.passwordLabel.sendKeys(ConfigReader.getProperty("password"));
        chargePlannerPage.loginButton.click();
    }
}

