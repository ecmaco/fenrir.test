package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot) Driver.getAndroidDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
        //Driver.quitAppiumDriver();
        //System.out.println(Driver.getAndroidDriver().removeApp("io.appium.uiautomator2.server"));
        //System.out.println(Driver.getAndroidDriver().removeApp("io.appium.uiautomator2.server.test"));

    }

}
