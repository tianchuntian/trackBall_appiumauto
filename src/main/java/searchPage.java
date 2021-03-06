import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class searchPage extends basePage {

    By name = By.id("com.xueqiu.android:id/name");

    public searchPage(AndroidDriver driver) {
        super(driver);
    }

    public searchPage search(String keyword) {
//        driver.findElement(By.id("com.xueqiu.android:id/search_input_text")).sendKeys(keyword);
        do {
            sendKeys(By.id("com.xueqiu.android:id/search_input_text"), keyword);
        }while(driver.findElements(name).size()<=0);



        return this;
    }

    public searchPage backMain() {
//        driver.findElement(By.id("com.xueqiu.android:id/action_close")).click();
        click(By.id("com.xueqiu.android:id/action_close"));
        return this;
    }

    public List<String> getSearchlist() {
        List<String> nameList = new ArrayList<>();
//        for (Object element : driver.findElements(name)) {
//            nameList.add(((WebElement) element).getText());
//        }
        //以下lambda表达式可代替上面for循环处理
        driver.findElements(name).forEach(element-> nameList.add(element.getText()));
        return nameList;
    }

    public searchPage selectElement(By by) {
//        driver.findElement(by).click();
        click(by);
        return this;
    }


    public double getPrice() {
        selectElement(name);
        return Double.parseDouble(find(By.id("com.xueqiu.android:id/current_price")).getText());
//        return Double.parseDouble(click(By.id("com.xueqiu.android:id/current_price")).getText());
    }

}
