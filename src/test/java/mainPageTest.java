import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//public class mainPageTest {

//    @BeforeAll
//    static void beforeAll(){
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "android");
//        desiredCapabilities.setCapability("deviceName", "hogwarts");
//        desiredCapabilities.setCapability("appPackage", "com.xueqiu.android");
//        desiredCapabilities.setCapability("appActivity", ".view.WelcomeActivityAlias");
//        desiredCapabilities.setCapability("noReset", "true");
//        desiredCapabilities.setCapability("udid", "");
//        URL remoteUrl = null;
//        try {
//            remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//            System.exit(1);
//        }
//
//        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    }
//    @Test
//    void mainTest(){
//        MobileElement el1 = (MobileElement) driver.findElementById("com.xueqiu.android:id/home_search");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementById("com.xueqiu.android:id/search_input_text");
//        el2.click();
//        el2.sendKeys("阿里巴巴");
//
//
//    }
//
//}
