

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Herokuapp {
    @Test
    public void herokuapp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        driver.findElement(By.xpath("//a[@class='button']")).click();
        driver.findElement(By.xpath("//a[@class='button alert']")).click();
        driver.findElement(By.xpath("//a[@class='button success']")).click();
        sleep();

        WebElement table = driver.findElement(By.tagName("tbody"));
        List<WebElement> cell = driver.findElements(By.xpath("//td[contains(text(),'Definiebas')]"));

        for(WebElement item: cell ){
            String text= item.getText();
            System.out.println("Text: " + text);
        }

        driver.close();

    }

    private void sleep() {
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
