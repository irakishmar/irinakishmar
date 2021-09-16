package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeolocationPage extends BasePage{

    public GeolocationPage(WebDriver driver){

        super(driver);
    }

    public GeolocationPage clickButton(){
        driver.findElement(By.xpath("//div[@class='example']/button")).click();
        return new GeolocationPage(driver);

    }
    public void getLocation(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='lat-value']"))).getText();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='long-value']"))).getText();
    }


}
