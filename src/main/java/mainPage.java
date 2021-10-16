import org.openqa.selenium.By;

public class mainPage extends basePage {

    public searchPage toSearch() {
//        driver.findElement(By.id("com.xueqiu.android:id/home_search")).click();
        click(By.id("com.xueqiu.android:id/home_search"));
        return new searchPage(driver);
    }

    public stock toStock() {
//        driver.findElement(By.id("com.xueqiu.android:id/tab_icon"));
        click(By.id("com.xueqiu.android:id/tab_icon"));
        return new stock();
    }
}
