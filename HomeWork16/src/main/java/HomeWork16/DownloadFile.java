package HomeWork16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Paths;


public class DownloadFile extends BasePage{

    public DownloadFile(WebDriver driver) {

    }

    public DownloadFile clickDownload () throws InterruptedException {
        driver.findElement(By.linkText("text.txt")).click();


        System.out.println("done");

        boolean downloadCompleted = false;
        File file = new  File(Paths.get( "target/" +"text.txt").toFile().getAbsolutePath());
        while (true){
        if(!file.exists()){
         Thread.sleep(100);
        } else {
            break;
        }
        }
        return new DownloadFile(driver);
    }
}
