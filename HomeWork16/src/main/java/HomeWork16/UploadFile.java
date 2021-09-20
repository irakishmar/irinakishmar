package HomeWork16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class UploadFile extends BasePage{
    public UploadFile(WebDriver driver) {

    }
    public void uploadFileAction(){
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys(new File("target/text1.txt").getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();

        System.out.println("done");
    }
}
