package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage extends BasePage {

    public MainPage(WebDriver driver){
        super(driver);
    }

    public LoginPage goToLoginPage(){
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);

    }

    public void goToGeolocation(){
        driver.findElement(By.linkText("Geolocation")).click();

    }
    public void goToChallengingDOM(){
        driver.findElement(By.linkText("Challenging DOM")).click();

    }

    public void goToHovers(){
        driver.findElement(By.linkText("Hovers")).click();

    }
}
