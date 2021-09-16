package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    private WebDriver driver;

    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    public  SecurePage getMessage(String message)
    {
         driver.findElement(By.id("flash")).getText().contains(message);
         return this;
    }

    public  SecurePage getInvalidMessage(String message)
    {
        driver.findElement(By.id("flash")).getText().contains(message);
        return this;
    }

    public LoginPage logout(){
        driver.findElement(By.cssSelector("a.button")).click();
        return new LoginPage(driver);
    }
}
