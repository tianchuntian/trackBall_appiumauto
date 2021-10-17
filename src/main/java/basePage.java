import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class basePage {

    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    public basePage() {

        URL remoteUrl = null;
        try {
            remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.exit(1);
        }
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "hogwarts");
        desiredCapabilities.setCapability("appPackage", "com.xueqiu.android");
        desiredCapabilities.setCapability("appActivity", ".view.WelcomeActivityAlias");
        desiredCapabilities.setCapability("noReset", "true");
        desiredCapabilities.setCapability("udid", "");

        this.driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait =new WebDriverWait(this.driver,20);
    }

    //
    public basePage(AndroidDriver driver) {
        this.driver = driver;
        wait =new WebDriverWait(this.driver,20);
    }

    public MobileElement find(By by){
        return driver.findElement(by);
    }

    public void click(By by) {
//        wait.until(ExpectedConditions.elementToBeClickable(by));移动端不需要wait.until处理,所有控件出现即可点击
        driver.findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void quit() {
        driver.quit();
    }
}
