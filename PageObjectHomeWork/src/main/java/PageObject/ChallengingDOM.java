package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ChallengingDOM extends BasePage {

    public ChallengingDOM(WebDriver driver) {
        super(driver);
    }

    public ChallengingDOM clickFirstButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button']"))).click();
        return this;
    }

    public ChallengingDOM clickSecondButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button alert']"))).click();
        return this;
    }

    public ChallengingDOM clickThirdButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button success']"))).click();
        return this;
    }

    public void getElements() {
        driver.findElement(By.tagName("tbody"));
        List<WebElement> cell = driver.findElements(By.xpath("//td[contains(text(),'Definiebas')]"));

        for (WebElement item : cell) {
            String text = item.getText();
            System.out.println("Text: " + text);
        }
    }
}
