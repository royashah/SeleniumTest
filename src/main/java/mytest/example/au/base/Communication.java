package mytest.example.au.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by pc on 10/12/17.
 */
public class Communication {
    private String url = "http://newtours.demoaut.com/mercurywelcome.php";
    private static WebDriver driver = new FirefoxDriver();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void implicitWait(String idName){
        WebDriverWait wait = new WebDriverWait(getDriver(),WebDriverWait.DEFAULT_SLEEP_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.name(idName))));
    }

    public Communication() {
        getDriver().navigate().to(getUrl());
        implicitWait("login");
    }
}
