package HomeWork13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragSAndDrop  extends BaseTest{
    @Test
    public void dragAndDrop(){
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        WebElement draggableElement = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content ui-draggable')]"));
        WebElement target = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-header ui-droppable')]"));

        Actions action = new Actions(driver);
        action.clickAndHold(draggableElement).moveToElement(target).release().perform();

        System.out.println("Dropped!");





    }
}
