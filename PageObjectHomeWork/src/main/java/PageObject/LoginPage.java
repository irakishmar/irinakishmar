package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage setUserName(String username){
        driver.findElement(By.id("username")).sendKeys(username);
        return this;
    }
    public LoginPage setPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    public SecurePage clickLoginButton(){
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        return new SecurePage(driver);
    }

}
