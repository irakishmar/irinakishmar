package HomeWork16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    protected BasePage(){
        this.driver = DriverSingleton.getDriver();
        wait = new WebDriverWait(this.driver,10);
        actions = new Actions(this.driver);
    }

    protected void setValue(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }
}
