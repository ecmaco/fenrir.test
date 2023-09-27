package stepdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


import io.cucumber.java.en.And;

import io.cucumber.java.en.But;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;
import pages.ChargePlannerPage;


import pages.SettingsPage;


import pages.SettingsPage;

import utilities.ConfigReader;

import utilities.Driver;
import utilities.ReusableMethods;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import java.util.ArrayList;
import java.util.List;

import java.util.List;
import java.util.Scanner;

import java.util.concurrent.TimeUnit;

public class ChargePlannerStepdefinitions {

    ChargePlannerPage chargePlannerPage=new ChargePlannerPage();
    SettingsPage settingsPage=new SettingsPage();
    TouchAction action=new TouchAction(Driver.getAndroidDriver());

    SoftAssert softAssert=new SoftAssert();

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


    @Given("ilk ekran ayarlarini yapin  {string} a tiklayin ve programa giris yapin")
    public void ilkEkranAyarlariniYapinATiklayinVeProgramaGirisYapin(String string) {

        ReusableMethods.wait(5);
        ReusableMethods.clickWithTimeOut(chargePlannerPage.allowLocation,3);

        for (int i=0; i<4; i++){
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




    @Given("ilk ekran ayarlarini yapin ve {string} butonuna tiklayarak yeni hesap olusturarak Login girisi yapin")
    public void ilkEkranAyarlariniYapinVeButonunaTiklayarakYeniHesapOlusturarakLoginGirisiYapin(String arg0) {

        ReusableMethods.wait(5);
        ReusableMethods.clickWithTimeOut(chargePlannerPage.allowLocation,3);

        for (int i=0; i<5; i++){
            Driver.getAndroidDriver().findElementByXPath("(//*[@class='android.view.ViewGroup'])[30]").click();
            ReusableMethods.wait(1);

        }

        ReusableMethods.wait(1);

        //ReusableMethods.wait(1);
        chargePlannerPage.emailAdressLabel.sendKeys("yusufk@gmail.com");
        chargePlannerPage.passwordLabel.sendKeys("Yk3683542");
        ReusableMethods.wait(1);

        chargePlannerPage.loginButton.click();
        ReusableMethods.wait(10);
        //ReusableMethods.fluentWait(chargePlannerPage.settings);
        //ReusableMethods.waitForVisibility(chargePlannerPage.settings);

        //ReusableMethods.waitForClickablility(Driver.getAndroidDriver(),chargePlannerPage.locationSearchButton,20);


    }

    @Then("Settings tusuna basilarak ayarlar kismina gidilir")
    public void settingTusunaBasilarakAyarlarKisminaGidilir() {

        chargePlannerPage.settingsButton.click();
        ReusableMethods.wait(2);
    }

    @And("Add My Car butonuna tiklanir")
    public void addMyCarButonunaTiklanir() {
        ReusableMethods.wait(2);
        chargePlannerPage.settingsButton.click();
        ReusableMethods.wait(2);
        settingsPage.addMyCarButton.click();
        ReusableMethods.wait(2);

    }

    @And("Istenilen araba modeli secilir")
    public void istenilenArabaModeliSecilir() {
            settingsPage.searchCarBox.sendKeys("Opel Astra Electric");
            ReusableMethods.wait(2);
            settingsPage.chosenCar.click();
            ReusableMethods.wait(2);
            settingsPage.carSavedButton.click();
            ReusableMethods.wait(2);
            settingsPage.allowCarInformation.click();
            ReusableMethods.wait(2);

    }

    @Then("Settings kisminda secilen arabanin kayitli oldugu dogrulanir")
    public void settingKismindaSecilenArabaninKayitliOlduguDogrulanir() {
       String actual= settingsPage.chosenCar.getText();
       String expected="Opel Astra Electric";
        softAssert.assertEquals(expected,actual);
        ReusableMethods.wait(2);



    }



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





    @Then("kullanici\\(yusuf) girisi yapin")
    public void kullaniciYusufGirisiYapin() {

        chargePlannerPage.emailAdressLabel.sendKeys(ConfigReader.getProperty("mail3"));
        chargePlannerPage.passwordLabel.sendKeys(ConfigReader.getProperty("password3"));
        chargePlannerPage.loginButton.click();
    }

    @Then("Eklenecek arac modeli yazilir")
    public void eklenecekAracModeliYazilir() {
        settingsPage.searchCarBox.sendKeys("Opel Astra Electric");
        ReusableMethods.wait(1);
    }

    @And("Sonuclarin dogru filitrelendigi dogrulanir")
    public void sonuclarinDogruFilitrelendigiDogrulanir() {
        String result=chargePlannerPage.searchResultCarList.getText();
        String expected="Opel Astra Electric";
        softAssert.assertEquals(expected,result);
    }

    @Then("Ayarlar sekmesinde Aracim sayfasinin gorunur oldugu dogrulanir")
    public void ayarlarSekmesindeAracimSayfasininGorunurOlduguDogrulanir() {
        softAssert.assertTrue(chargePlannerPage.addMyCarButton.isDisplayed());
        ReusableMethods.wait(1);

    }

    @Given("Profile Settings sekmesine tiklanir")
    public void profileSettingsSekmesineTiklanir() {
        ReusableMethods.wait(2);
        chargePlannerPage.settingsButton.click();
        ReusableMethods.wait(2);
        chargePlannerPage.profileSettingsButton.click();
        ReusableMethods.wait(1);
    }

    @Then("Car sekmesine tiklanir")
    public void carSekmesineTiklanir() {
        chargePlannerPage.searchResultCarList.click();
        ReusableMethods.wait(1);
    }

    @And("Arac modeli degistirmek icin listenin acildigi dogrulanir")
    public void aracModeliDegistirmekIcinListeninAcildigiDogrulanir() {

       String listcar=chargePlannerPage.searchCarResultAllList.getText();
        softAssert.assertTrue(!(listcar.isEmpty()));
        softAssert.assertAll();


    }


    @When("Kullanıcı, yanlis kullanıcı adı ve  yanlis şifre bilgileri ile  giriş yapamaz.")
    public void kullanıcıYanlisKullanıcıAdıVeYanlisŞifreBilgileriIleGirişYapamaz() {
        chargePlannerPage.emailAdressLabel.sendKeys(ConfigReader.getProperty("gecersizmail"));
        chargePlannerPage.passwordLabel.sendKeys(ConfigReader.getProperty("gecersizsifre"));
        chargePlannerPage.loginButton.click();
    }

    @Then("Kullanıcı, giris yapilamadigini dogrular")
    public void kullanıcıGirisYapiLamadiginiDogrular() {
        String expected="Invalid login credentials";
        String actual=chargePlannerPage.gecersizgirismesaji.getText();
        Assert.assertEquals(expected,actual);
    }

    @Then("Program kaptilir.")
    public void programKaptilir() {
        Driver.quitAppiumDriver();
    }

    @When("Kullanici Forgot Password bolumune girer.")
    public void kullaniciForgotPasswordBolumuneGirer() {
        chargePlannerPage.forgatPassword.click();
    }

    @Then("Kullanici gecerli emailini girerek Reset My Password tusuna basar")
    public void kullaniciGecerliEmailiniGirerekResetMyPasswordTusunaBasar() {
        ReusableMethods.wait(3);
        chargePlannerPage.sifirlamaEmail.sendKeys(ConfigReader.getProperty("gecersizmail"));
        chargePlannerPage.resetMyPassword.click();
    }

    @And("Mail gonderildigi bilgis ana ekranda dogrulanir.")
    public void mailGonderildigiBilgisAnaEkrandaDogrulanir() {
        String expected="Please Check your email";
        String actual=chargePlannerPage.checkEmailMessage.getText();
        Assert.assertEquals(expected,actual);
    }

    @And("Kullanici settings bolumune tiklar ve cikis yapar.")
    public void kullaniciSettingsBolumuneTiklarVeCikisYapar() {

       chargePlannerPage.settingsButton.click();
       ReusableMethods.wait(3);
        action.press(PointOption.point(1010, 232))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .release().perform();
        ReusableMethods.waitForVisibility(chargePlannerPage.OKbutton);
        chargePlannerPage.OKbutton.click();
    }

    @Then("Kullanicinin cikis yaptigi dogrulanir.")
    public void kullanicininCikisYaptigiDogrulanir() {
        ReusableMethods.wait(2);
        Assert.assertTrue(chargePlannerPage.loginButton.isDisplayed());
    }

    @When("Kullanici Google ile griris yap bolumune tiklar")
    public void kullaniciGoogleIleGririsYapBolumuneTiklar() {
        chargePlannerPage.googleGirisButonu.click();
    }

    @Then("Google hesap bilgileri girilir")
    public void googleHesapBilgileriGirilir() {
        ReusableMethods.wait(8);
        boolean sart;
        try {
            sart=chargePlannerPage.nextButonuG.isEnabled();
        }
        catch (NoSuchElementException e){
            sart=false;
        }

        if (sart){

            /*
            Scanner scan=new Scanner(System.in);
            System.out.println("email giriniz");
            String email=scan.nextLine();
            System.out.println("sifre giriniz");
            String sifre=scan.nextLine();
            ReusableMethods.wait(3);
             */

            chargePlannerPage.emailGirisG.click();
            Driver.getAndroidDriver().getKeyboard().sendKeys("alexmahone2324@gmail.com");
            ReusableMethods.wait(2);
            chargePlannerPage.nextButonuG.click();
            ReusableMethods.wait(2);
            chargePlannerPage.passwordGirisG.click();
            Driver.getAndroidDriver().getKeyboard().sendKeys("Mahmut1989");
            ReusableMethods.wait(2);
            chargePlannerPage.nextButonuG.click();
            ReusableMethods.wait(2);
            chargePlannerPage.iagreeButtonG.click();
            ReusableMethods.wait(2);
            chargePlannerPage.moreButtonG.click();
            ReusableMethods.wait(2);
            chargePlannerPage.acceptButtonG.click();
            ReusableMethods.wait(5);
            chargePlannerPage.googleGirisButonu.click();
        }
        else {
            ReusableMethods.wait(3);
            chargePlannerPage.googleGirisYeni.click();
        }
    }

    @And("Google ile giris yapildigi dogrulanir")
    public void googleIleGirisYapildigiDogrulanir() {

        ReusableMethods.wait(3);
        chargePlannerPage.settingsButton.click();
        String actualMailText=chargePlannerPage.mailTextG.getText();
        String expectedMailText="@gmail.com";
        Assert.assertTrue(actualMailText.contains(expectedMailText));
    }

    @Given("Sing up bolumune tiklanir")
    public void singUpBolumuneTiklanir() {
        chargePlannerPage.signUpButton.click();
    }

    @Then("Gecerli isim,email,sifre,ikinci sifre ile kayit yapilir")
    public void gecerliIsimEmailSifreIkinciSifreIleKayitYapilir() {
        Actions actions=new Actions(Driver.getAndroidDriver());
        ReusableMethods.wait(2);
        chargePlannerPage.nameSignup.click();
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitisim"));
        ReusableMethods.wait(2);
        chargePlannerPage.emailSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitmail"));
        chargePlannerPage.passwordSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitsifre"));
        actions.sendKeys(Keys.ENTER).sendKeys(ConfigReader.getProperty("kayitsifre")).
                sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(2);
        chargePlannerPage.signUpButton.click();
    }

    @And("Kayit olusturuldugu dogrulanir")
    public void kayitOlusturulduguDogrulanir() {
        ReusableMethods.wait(3);
        chargePlannerPage.settingsButton.click();
        String actualMailText=chargePlannerPage.mailTextGenel.getText();
        String expectedMailText=ConfigReader.getProperty("kayitmail");
        Assert.assertEquals(expectedMailText,actualMailText);
    }

    @Then("Basarisiz {string} \\(@icermeyen,.com icermeyen, bosluk iceren) ile kayit yapilamadigi dogrulanir")
    public void basarisizIcermeyenComIcermeyenBoslukIcerenIleKayitYapilamadigiDogrulanir(String email) {
        Actions actions=new Actions(Driver.getAndroidDriver());
        ReusableMethods.wait(2);
        chargePlannerPage.nameSignup.click();
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitisim"));
        ReusableMethods.wait(2);
        chargePlannerPage.emailSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(email);
        chargePlannerPage.passwordSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitsifre"));
        actions.sendKeys(Keys.ENTER).sendKeys(ConfigReader.getProperty("kayitsifre")).
                sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(2);
        chargePlannerPage.signUpButton.click();
        Assert.assertTrue(chargePlannerPage.emailSignUp.isDisplayed());
    }

    @Then("Basarisiz sifre \\(Sekiz karakter olmayan) ile kayit yapilamamasi dogrulanir")
    public void basarisizSifreSekizKarakterOlmayanIleKayitYapilamamasiDogrulanir() {
        Actions actions=new Actions(Driver.getAndroidDriver());
        ReusableMethods.wait(2);
        chargePlannerPage.nameSignup.click();
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitisim"));
        ReusableMethods.wait(2);
        chargePlannerPage.emailSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitmail"));
        chargePlannerPage.passwordSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitgecersizsifre1"));
        actions.sendKeys(Keys.ENTER).sendKeys(ConfigReader.getProperty("kayitgecersizsifre1")).
                sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(2);
        chargePlannerPage.signUpButton.click();
        Assert.assertTrue(chargePlannerPage.passwordSignUp.isDisplayed());

    }

    @Then("Basarisiz ikici sifre\\(ilk sifre ile ikinci sifrenin ayni olmamasi) ile kayit yapilamamasi dogrulanir.")
    public void basarisizIkiciSifreIlkSifreIleIkinciSifreninAyniOlmamasiIleKayitYapilamamasiDogrulanir() {
        Actions actions=new Actions(Driver.getAndroidDriver());
        ReusableMethods.wait(2);
        chargePlannerPage.nameSignup.click();
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitisim"));
        ReusableMethods.wait(2);
        chargePlannerPage.emailSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitmail"));
        chargePlannerPage.passwordSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitsifre"));
        actions.sendKeys(Keys.ENTER).sendKeys(ConfigReader.getProperty("kayitgecersizsifre2")).
                sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(2);
        chargePlannerPage.signUpButton.click();
        String expected="Please check both passwords";
        String actual=chargePlannerPage.ayniSifre.getText();
        Assert.assertEquals(expected,actual);
    }

    @Then("Onceden kayit yapilmis email ile kayit yapilamamsi dogrulanir.")
    public void oncedenKayitYapilmisEmailIleKayitYapilamamsiDogrulanir() {
        Actions actions=new Actions(Driver.getAndroidDriver());
        ReusableMethods.wait(2);
        chargePlannerPage.nameSignup.click();
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitisim"));
        ReusableMethods.wait(2);
        chargePlannerPage.emailSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitliemail"));
        chargePlannerPage.passwordSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitsifre"));
        actions.sendKeys(Keys.ENTER).sendKeys(ConfigReader.getProperty("kayitsifre")).
                sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(2);
        chargePlannerPage.signUpButton.click();
        String expected="User already registered";
        String actual=chargePlannerPage.kayitemailinfo.getText();
        Assert.assertEquals(expected,actual);
    }

    @Then("Sifre bolumune sifre yazilir")
    public void sifreBolumuneSifreYazilir() {
        chargePlannerPage.passwordSignUp.click();
        ReusableMethods.wait(2);
        Driver.getAndroidDriver().getKeyboard().sendKeys(ConfigReader.getProperty("kayitsifre"));
    }

    @And("Goz isaretine tiklanir")
    public void gozIsaretineTiklanir() {
        chargePlannerPage.gozisareti.click();
        ReusableMethods.wait(2);
        chargePlannerPage.gozisareti.click();

    }

    @Then("Yazilan sifrenin gorunurlugu dogrulanir.")
    public void yazilanSifreninGorunurluguDogrulanir() {
        String expected=ConfigReader.getProperty("kayitsifre");
        String actual=chargePlannerPage.gozsifre.getText();
        Assert.assertEquals(expected,actual);
    }

    @Then("Sifre bolumune sifre gonderilir")
    public void sifreBolumuneSifreGonderilir() {
        chargePlannerPage.passwordTextBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Password bolumundeki goz isaretine tiklanir")
    public void passwordBolumundekiGozIsaretineTiklanir() {
        chargePlannerPage.gozisaretiLogin.click();
    }

    @Then("Yazilan sifrenin gorunur oldugu dogrulanir")
    public void yazilanSifreninGorunurOlduguDogrulanir() {
        String expected=ConfigReader.getProperty("password");
        String actual=chargePlannerPage.gozTestiSifre.getText();
        Assert.assertEquals(expected,actual);
    }

    @Then("Arama kutusuna tiklanir")
    public void aramaKutusunaTiklanir() {
        ReusableMethods.wait(2);
        chargePlannerPage.aramaCubugu.click();
    }

    @Then("Arama kutusuna location girilir")
    public void aramaKutusunaLocationGirilir() {
        ReusableMethods.wait(2);
        chargePlannerPage.searchLocation.sendKeys("edremit");
        ReusableMethods.wait(2);
        chargePlannerPage.edremitLocation.click();
    }

    @And("Girilen location ın dogru oldugu kontrol edilir")
    public void girilenLocationInDogruOlduguKontrolEdilir() {
        ReusableMethods.wait(3);
        action.press(PointOption.point(760,1730))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).
                moveTo(PointOption.point(60,1730)).release().perform();
        ReusableMethods.wait(3);
        action.press(PointOption.point(760,1730))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).
                moveTo(PointOption.point(60,1730)).release().perform();
        String expected="Edremit";
        String actual=chargePlannerPage.edremitLocation2.getText();
        Assert.assertTrue(actual.contains(expected));

    }

}

