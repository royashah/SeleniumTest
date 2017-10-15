package mytest.example.au.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by pc on 10/13/17.
 */
public abstract class ExtendedPage {

    WebDriver driver = Communication.getDriver();

    public void setTextBoxWithName(String name,String value){
        driver.findElement(By.name(name)).sendKeys(value);
    }

    public void selectWithName(String name){
        driver.findElement(By.name(name)).click();
    }
    public void selectWithXpath(String name){
        driver.findElement(By.xpath(name)).click();
    }

    public void selectDropDownList(String name,String value){
        Select dropdown = new Select(driver.findElement(By.name(name)));
        dropdown.selectByVisibleText(value);
    }

    public void selectNameWithSpecificValue(String name, String value){
        driver.findElement(By.name(name)).findElement(By.xpath("//input[@value="+'"'+value+'"'+"]")).click();
    }

    public void continueAction(String name){
        driver.findElement(By.name(name)).click();
    }

    public abstract void init();
}
