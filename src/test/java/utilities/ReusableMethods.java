package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.function.Function;

public class ReusableMethods {

    public static void koordinatTiklama(int xKoordinat, int yKoordinat, int bekleme) throws InterruptedException {
        TouchAction touchAction = new TouchAction<>(Driver.getAndroidDriver());
        touchAction.press(PointOption.point(xKoordinat, yKoordinat)).release().perform();
        Thread.sleep(bekleme);
    }

    public static void ekranAltKaydirma(int xKoordinat, int yKoordinat, int wait, int mxKoordinat, int myKoordinat, int bekleme) throws InterruptedException {
        TouchAction touchAction = new TouchAction<>(Driver.getAndroidDriver());
        touchAction
                .press(PointOption.point(xKoordinat, yKoordinat))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait)))
                .moveTo(PointOption.point(mxKoordinat, myKoordinat))
                .release()
                .perform();
        Thread.sleep(bekleme);
    }

    public static void ekranSagKaydirma(int xKoordinat, int yKoordinat, int wait, int mXkoordinat, int mYkoordinat, int bekleme) throws InterruptedException {
        TouchAction touchAction = new TouchAction<>(Driver.getAndroidDriver());
        touchAction.press(PointOption.point(xKoordinat, yKoordinat))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(wait)))
                .moveTo(PointOption.point(mXkoordinat, mYkoordinat)).release().perform();
        Thread.sleep(bekleme);
    }

    public static void scrollWithUiScrollable(String elementText) {
        AndroidDriver driver = (AndroidDriver) Driver.getAndroidDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + elementText + "\"))");
        driver.findElementByXPath("//*[@text='" + elementText + "']").click();

    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhssmm").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getAndroidDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        public static void scrollDown () {
            int screenHeight = Driver.getAndroidDriver().manage().window().getSize().getHeight();
            int screenWidth = Driver.getAndroidDriver().manage().window().getSize().getWidth();

            int startX = screenWidth / 2;
            int startY = (int) (screenHeight * 0.8);
            int endY = (int) (screenHeight * 0.2);

            new TouchAction<>(Driver.getAndroidDriver())
                    .longPress(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();
        }

        public static void scrollUp () {
            int screenHeight = Driver.getAndroidDriver().manage().window().getSize().getHeight();
            int screenWidth = Driver.getAndroidDriver().manage().window().getSize().getWidth();

            int startX = screenWidth / 2;
            int startY = (int) (screenHeight * 0.2);
            int endY = (int) (screenHeight * 0.8);

            new TouchAction<>(Driver.getAndroidDriver())
                    .longPress(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();
        }

        public static void textClick(String elementText){

            Driver.getAndroidDriver().findElementByXPath("//*[@text='" + elementText + "']").click();


        }

    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getAndroidDriver())
                .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }

    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                ReusableMethods.wait(1);
            }
        }
    }


    public static WebElement waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getAndroidDriver(), 250);
        return  wait.until(ExpectedConditions.visibilityOf(element));
    }
}






