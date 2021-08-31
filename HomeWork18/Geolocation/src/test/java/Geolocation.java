import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Geolocation {
    @Test
    public void geolocation() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/geolocation");

        driver.findElement(By.xpath("//div[@class='example']/button")).click();
        sleep();

        WebElement Latitude = driver.findElement(By.xpath("//div[@id='lat-value']"));
        String textLatitude= Latitude.getText();

        System.out.println("Latitude: " + textLatitude);

        WebElement Longitude = driver.findElement(By.xpath("//div[@id='long-value']"));
        String textLongitude= Longitude.getText();

        System.out.println("Longitude: " + textLongitude);
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
