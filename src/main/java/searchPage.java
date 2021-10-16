import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

public class searchPage extends basePage{
    public searchPage(AppiumDriver driver){
        super(driver);
    }
    public searchPage search(String keyword){
        driver.findElement(By.id("com.xueqiu.android:id/search_input_text")).sendKeys(keyword);
        return this;
    }

    public searchPage backMain(){
        driver.findElement(By.id("com.xueqiu.android:id/action_close")).click();
        return this;
    }

    public List<String> getSearchlist(){
        return Arrays.asList("阿里巴巴","2","3");
    }

    public double getPrice(){
        return 1.1;
    }

}
