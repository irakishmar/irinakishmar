package HomeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class Users extends BaseTest{
    @Test
    public void users() {
        driver.get("https://the-internet.herokuapp.com/hovers");


        WebElement user1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[contains(text(),'name: user1')]/../..")));
        new Actions(driver).moveToElement(user1).build().perform();
        WebElement name1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'name: user1')]")));
        String userName1 = name1.getText();
        System.out.println(userName1);


        WebElement user2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[contains(text(),'name: user2')]/../..")));
        new Actions(driver).moveToElement(user2).build().perform();
        WebElement name2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'name: user2')]")));
        String userName2 = name2.getText();
        System.out.println(userName2);


        WebElement user3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h5[contains(text(),'name: user3')]/../..")));
        new Actions(driver).moveToElement(user3).build().perform();
        WebElement name3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[contains(text(),'name: user3')]")));
        String userName3 = name3.getText();
        System.out.println(userName3);

    }


}
