package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.ChargePlannerPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static utilities.Driver.appiumDriver;

public class SettinsStepdefinitions {





    @Given("Kullanıcı Mobil uygulamayı açar")
    public void kullanıcı_mobil_uygulamayı_açar() {

    }
    @When("Kullanıcı Ana sayfada herhangi bir oturum açma işlemi yapmadan {string} bölümüne gider.")
    public void kullanıcı_ana_sayfada_herhangi_bir_oturum_açma_işlemi_yapmadan_bölümüne_gider(String string) {

    }
    @Then("Kullanıcı uygulamanın yüklenip yüklenmediğini kontrol eder.")
    public void kullanıcı_uygulamanın_yüklenip_yüklenmediğini_kontrol_eder() {

    }
    @Then("Kullanıcı uygulamada bir hata mesajı veya giriş yapma isteği olup olmadığını kontrol eder.")
    public void kullanıcı_uygulamada_bir_hata_mesajı_veya_giriş_yapma_isteği_olup_olmadığını_kontrol_eder() {

    }
    @Then("Kullanıcının mobil uygulamada üye olmadan {string} bölümüne giriş yapamamasını doğrulamalıdır.")
    public void kullanıcının_mobil_uygulamada_üye_olmadan_bölümüne_giriş_yapamamasını_doğrulamalıdır(String string) {

    }


    @When("Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapar.")
    public void kullanıcıDoğruKullanıcıAdıVeŞifreBilgileriIleBaşarılıBirŞekildeGirişYapar() {
        
    }

    @Then("Kullanıcı, doğru kullanıcı adı ve şifre bilgileri ile başarılı bir şekilde giriş yapabildiğini doğrular.")
    public void kullanıcıDoğruKullanıcıAdıVeŞifreBilgileriIleBaşarılıBirŞekildeGirişYapabildiğiniDoğrular() {
        
    }

    @And("Kullanıcı, profil menüsüne erişebilmelidir.")
    public void kullanıcıProfilMenüsüneErişebilmelidir() {
        
    }

    @Then("{string} seçeneği görünür ve dokunabilir durumda olmalıdır.")
    public void seçeneğiGörünürVeDokunabilirDurumdaOlmalıdır(String arg0) {
        
    }

    @And("Kullanıcı {string} seçeneği görünür ve dokunabilir durumda olduğunu doğrulamalıdır.")
    public void kullanıcıSeçeneğiGörünürVeDokunabilirDurumdaOlduğunuDoğrulamalıdır(String arg0) {
    }
}