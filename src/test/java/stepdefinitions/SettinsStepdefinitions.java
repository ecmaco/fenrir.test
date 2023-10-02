package stepdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.ChargePlannerPage;
import pages.SettingsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class SettinsStepdefinitions {

    SettingsPage settingsPage=new SettingsPage();


    TouchAction action=new TouchAction(Driver.getAndroidDriver());

    ChargePlannerPage chargePlannerPage= new ChargePlannerPage();
    TouchAction touchAction=new TouchAction(Driver.getAndroidDriver());


    AndroidDriver driver;

    @Given("Kullanıcı Mobil uygulamayı açar")
    public void kullanıcı_mobil_uygulamayı_açar() {

        settingsPage.allowButton.click();
        settingsPage.crossButton.click();

    }
    @When("Kullanıcı Ana sayfada herhangi bir oturum açma işlemi yapmadan {string} bölümüne gider.")
    public void kullanıcı_ana_sayfada_herhangi_bir_oturum_açma_işlemi_yapmadan_bölümüne_gider(String string) {

        settingsPage.continueWithoutLoginButton.click();
        settingsPage.settingsButton.click();

    }
    @Then("Kullanıcı uygulamanın yüklenip yüklenmediğini kontrol eder.")
    public void kullanıcı_uygulamanın_yüklenip_yüklenmediğini_kontrol_eder() {

        Assert.assertTrue(settingsPage.profilSettingsButton.isDisplayed());
    }
    @Then("Kullanıcı uygulamada bir hata mesajı veya giriş yapma isteği olup olmadığını kontrol eder.")
    public void kullanıcı_uygulamada_bir_hata_mesajı_veya_giriş_yapma_isteği_olup_olmadığını_kontrol_eder() {
        settingsPage.profilSettingsButton.click();
        Assert.assertTrue(settingsPage.errorMessage.isDisplayed());

    }
    @Then("Kullanıcının mobil uygulamada üye olmadan {string} bölümüne giriş yapamamasını doğrulamalıdır.")
    public void kullanıcının_mobil_uygulamada_üye_olmadan_bölümüne_giriş_yapamamasını_doğrulamalıdır(String string) {



       if (settingsPage.errorMessage.isDisplayed()) {
           ReusableMethods.waitForVisibility(settingsPage.errorMessage);
            String alertText =settingsPage.errorMessage.getText();
            Assert.assertEquals(alertText, "Please sign-up to use this function.");
        } else {
            Assert.fail("Uyarı penceresi görünmüyor veya beklenen şartlar sağlanmıyor.");
        }
        System.out.println(settingsPage.errorMessage.getText());

    }




    @When("Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.")
    public void kullanıcıDoğruKullanıcıAdıVeŞifreBilgileriIleBaşarılıBirŞekildeGirişYapar() {
        settingsPage.emailAdressTextBox.click();
        Driver.getAndroidDriver().getKeyboard().pressKey(ConfigReader.getProperty("mail"));
        settingsPage.passwordTextBox.click();
        Driver.getAndroidDriver().getKeyboard().pressKey(ConfigReader.getProperty("password"));
        settingsPage.loginButton.click();
        settingsPage.loginButton.click();
        ReusableMethods.wait(2);

        
    }

    @Then("Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapabildiğini doğrular.")
    public void kullanıcıDoğruKullanıcıAdıVeŞifreBilgileriIleBaşarılıBirŞekildeGirişYapabildiğiniDoğrular() {
        settingsPage.settingsButton.click();
        ReusableMethods.waitForVisibility(settingsPage.profilSettingsButton);
        String actualMailText=settingsPage.mailText.getText();
        String expectedMailText=ConfigReader.getProperty("mail");
        Assert.assertEquals(expectedMailText, actualMailText);
    }


    @And("Kullanıcı {string} seçeneği görünür ve dokunabilir durumda olduğunu doğrulamalıdır.")
    public void kullanıcıSeçeneğiGörünürVeDokunabilirDurumdaOlduğunuDoğrulamalıdır(String button) {

        switch (button) {
            case "Profil Ayarlari":{
                Assert.assertTrue(settingsPage.profilSettingsButton.isDisplayed());
            break;
            }
            case "Remove My Account":{
                Assert.assertTrue(settingsPage.removeMyAccountButton.isDisplayed());
                break;
            }
        }

    }

    @Then("Kullanıcı ana ekranın üst kısmında kullanıcının adını veya profil resmini görüntüleyen bir bölüm olduğunu doğrular.")
    public void kullanıcıAnaEkranınÜstKısmındaKullanıcınınAdınıVeyaProfilResminiGörüntüleyenBirBölümOlduğunuDoğrular() {

        settingsPage.settingsButton.click();
        ReusableMethods.waitForVisibility(settingsPage.profilSettingsButton);
        Assert.assertTrue(settingsPage.mailText.isDisplayed());
    }

    @And("Kullanıcı {string} veya {string} 'ne tıklayarak profil menüsüne erişir.")
    public void kullanıcıVeyaNeTıklayarakProfilMenüsüneErişir(String username, String profilIcon) {

        settingsPage.profilIcon.click();
        ReusableMethods.waitForVisibility(settingsPage.removeMyAccountButton);
    }


    @But("Kullanıcı Profil Ayarları sayfasında kullanıcının adı, e-posta, telefon numarası gibi profil bilgilerini kontrol eder ve bilgilerin doğru olduğunu doğrular.")
    public void kullanıcıProfilAyarlarıSayfasındaKullanıcınınAdıEPostaTelefonNumarasıGibiProfilBilgileriniKontrolEderVeBilgilerinDoğruOlduğunuDoğrular() {

        String actualMailText=settingsPage.mailText.getText();
        System.out.println("actualMailText = " + actualMailText);
        String expectedMailText=ConfigReader.getProperty("mail");
        System.out.println("expectedMailText = " + expectedMailText);
        Assert.assertEquals(expectedMailText, actualMailText);
        String actualNameText=settingsPage.nameText.getText();
        System.out.println("actualNameText = " + actualNameText);
        String expectedNameText=ConfigReader.getProperty("name");
        System.out.println("expectedNameText = " + expectedNameText);
        Assert.assertEquals(expectedNameText, actualNameText);
    }

    @Then("Kullanıcı Profil Ayarları sayfasında güncellenebilir bilgileri \\( ad, soyad, e-posta, telefon numarası) bulur ve bu bilgileri günceller.")
    public void kullanıcıProfilAyarlarıSayfasındaGüncellenebilirBilgileriAdSoyadEPostaTelefonNumarasıBulurVeBuBilgileriGünceller() {

        settingsPage.usernameBox.sendKeys("Mustafa");
        settingsPage.fullAdressBox.sendKeys("İstanbul");
        settingsPage.phoneNumberBox.sendKeys("05427548965");



    }

    @Then("Kullanıcı bilgileri güncelledikten sonra {string} ve {string} butonuna tıklar.")
    public void kullanıcıBilgileriGüncellediktenSonraVeButonunaTıklar(String arg0, String arg1) {

        settingsPage.saveButton.click();
    }

    @But("Kullanıcı bilgilerin başarıyla güncellendiğini ve {string} butonunun işlevsel olduğunu doğrular.")
    public void kullanıcıBilgilerinBaşarıylaGüncellendiğiniVeButonununIşlevselOlduğunuDoğrular(String updateText) {

        ReusableMethods.waitForVisibility(settingsPage.updateText);
        Assert.assertTrue(settingsPage.updateText.isDisplayed());
    }

    @Then("Kullanıcı {string} butonuna tıkladığında bir uyarı mesajı aldığını goğrulamalıdır.")
    public void kullanıcıButonunaTıkladığındaBirUyarıMesajıAldığınıGoğrulamalıdır(String removeMessage) {

        settingsPage.removeMyAccountButton.click();
        ReusableMethods.waitForVisibility(settingsPage.removeText);
        Assert.assertTrue(settingsPage.removeText.isDisplayed());

    }

    @Then("Kullanıcı, uyarı mesajını okumalı ve talimatları takip ederek hesabını kaldırmayı onaylamalıdır.")
    public void kullanıcıUyarıMesajınıOkumalıVeTalimatlarıTakipEderekHesabınıKaldırmayıOnaylamalıdır() {

        settingsPage.removeCancelButton.click();
    }

    @But("Kullanıcı hesabın kaldırıldığını doğrulamalıdır.")
    public void kullanıcıHesabınKaldırıldığınıDoğrulamalıdır() {
        ReusableMethods.waitForVisibility(settingsPage.saveButton);
        Assert.assertTrue(settingsPage.saveButton.isDisplayed());
    }

    @When("Kullanıcı Login olmadan uygulamayı açar.")
    public void kullanıcıLoginOlmadanUygulamayıAçar() {





    }

    @When("Kullanıcı  footer bölümünde {string} bölümünü bulur ve seçer.")
    public void kullanıcıFooterBölümündeBölümünüBulurVeSeçer(String arg0) {





    }

    @Then("Kullanıcı açılan sayfada {string} bölümünü bulur ve seçer.")
    public void kullanıcıAçılanSayfadaBölümünüBulurVeSeçer(String arg0) {





    }

    @But("Kullanıcı {string} sayfasının açıldığını doğrular.")
    public void kullanıcıSayfasınınAçıldığınıDoğrular(String arg0) {





    }

    @And("Kullanıcı Theme bölümünden tema rengini {string} olarak değiştirir.")
    public void kullanıcıThemeBölümündenTemaRenginiOlarakDeğiştirir(String arg0) {




    }

    @But("Kullnıcı tema renginin {string} olarak değiştiğini doğrular.")
    public void kullnıcıTemaRengininOlarakDeğiştiğiniDoğrular(String arg0) {




    }

    @And("Kullanıcı Language bölümünden dili {string} olarak değiştirir.")
    public void kullanıcıLanguageBölümündenDiliOlarakDeğiştirir(String arg0) {





    }

    @But("Kullnıcı dil seçeneğinin {string} olarak değiştiğini doğrular.")
    public void kullnıcıDilSeçeneğininOlarakDeğiştiğiniDoğrular(String arg0) {




    }

    @And("Kullanıcı Unit bölümünden birimi {string} olarak değiştirir.")
    public void kullanıcıUnitBölümündenBirimiOlarakDeğiştirir(String arg0) {




    }

    @But("Kullnıcı unit seçeneğinin {string} olarak değiştiğini doğrular.")
    public void kullnıcıUnitSeçeneğininOlarakDeğiştiğiniDoğrular(String arg0) {




    }

    @But("Kullanıcı {string} başlığının belirtilen dille uyumluluğunu doğrular.")
    public void kullanıcıBaşlığınınBelirtilenDilleUyumluluğunuDoğrular(String arg0) {





    }

    @Then("Kullanıcı {string} başlığına tiklar.")
    public void kullanıcıBaşlığınaTiklar(String arg0) {





    }

    @But("Kullanıcı {string} bölümünde yer alan bilgilerin içerikle uyumluluğunu doğrular.")
    public void kullanıcıBölümündeYerAlanBilgilerinIçerikleUyumluluğunuDoğrular(String arg0) {




    }

    @Then("Kullanıcı Profil menüsünde {string} seçeneğini arar ve ona dokunur.")
    public void kullanıcıProfilMenüsündeSeçeneğiniArarVeOnaDokunur(String button) {

        settingsPage.settingsButton.click();
        ReusableMethods.waitForVisibility(settingsPage.profilIcon);
        settingsPage.profilSettingsButton.click();
        ReusableMethods.waitForVisibility(settingsPage.removeMyAccountButton);
    }


 /*   @Given("ilk ekran ayarlari yapin")
    public void ilkEkranAyarlariYapin() {
        do {
            ReusableMethods.clickWithTimeOut(settingsPage.allowButton, 3);
            ReusableMethods.wait(5);
        } while (ReusableMethods.control());

        for (int i = 0; i < 4; i++) {
            action.press(PointOption.point(957, 1893))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .release().perform();
        }
    }*/

    @Then("Mesajlar butonunun gorunur oldugu kontrol edilir")
    public void mesajlarButonununGorunurOlduguKontrolEdilir() {
        ReusableMethods.wait(1);
        Assert.assertTrue(settingsPage.messagesButton.isDisplayed());
    }

    @Given("Mesajlar butonuna  tiklanmalidir")
    public void mesajlarButonunaTiklanmalidir() {
        chargePlannerPage.settingsButton.click();
        ReusableMethods.wait(2);

        settingsPage.messagesButton.click();
    }

    @Then("Mesajlar sekmesinin acildigi dogrulanmalidir")
    public void mesajlarSekmesininAcildigiDogrulanmalidir() {
        ReusableMethods.wait(1);
        Assert.assertTrue(settingsPage.noMessagesText.isEnabled());
    }

    @Then("Kullanıcı profil bölümüne erişir")
    public void kullanıcıProfilBölümüneErişir() {
        settingsPage.settingsButton.click();
        ReusableMethods.waitForVisibility(settingsPage.profilSettingsButton);
    }
}