package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Hovers extends BasePage{

    public Hovers(WebDriver driver){
        super(driver);
    }

    public Hovers moveToFirstElement(){
        actions.moveToElement(driver.findElement(By.xpath("//h5[contains(text(),'name: user1')]/../.."))).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'name: user1')]"))).getText().contains("name: user1");
        return this;
    }
    public Hovers moveToSecondElement(){
        actions.moveToElement(driver.findElement(By.xpath("//h5[contains(text(),'name: user2')]/../.."))).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//h5[contains(text(),'name: user2')]")))).getText().contains("name: user2");
        return this;
    }
    public Hovers moveToThirdElement(){
        actions.moveToElement(driver.findElement(By.xpath("//h5[contains(text(),'name: user3')]/../.."))).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'name: user3')]"))).getText().contains("name: user3");
        return this;
    }

}
