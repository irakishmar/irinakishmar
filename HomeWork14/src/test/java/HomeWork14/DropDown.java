package HomeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown extends BaseTest {
    @Test
    public void dropDown() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");




        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Dropdown ')]"))).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Secondary Menu ')]"))).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Secondary Action')]"))).click();

        WebElement text = driver.findElement(By.xpath("//div[@class='jumbotron secondary-clicked']/h1"));
        String textOnPage = text.getText();

        System.out.println(textOnPage);



    }

}
