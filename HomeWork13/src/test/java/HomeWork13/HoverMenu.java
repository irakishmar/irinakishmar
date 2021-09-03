package HomeWork13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HoverMenu extends BaseTest {
    @Test
    public void hoverMenu() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");


       driver.findElement(By.xpath("//a[contains(text(),'Dropdown ')]")).click();
        sleep();
       driver.findElement(By.xpath("//a[contains(text(),'Secondary Menu ')]")).click();
        sleep();

        driver.findElement(By.xpath("//a[contains(text(),'Secondary Action')]")).click();
        sleep();

        WebElement text = driver.findElement(By.xpath("//div[@class='jumbotron secondary-clicked']/h1"));
        String textOnPage = text.getText();

        System.out.printf(textOnPage);



             }
            private void sleep(){
              try{
               Thread.sleep(1000);
             } catch (InterruptedException e){}
             }

        }
