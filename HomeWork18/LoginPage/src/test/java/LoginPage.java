
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
    @Test
    public void loginPageValid(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://the-internet.herokuapp.com/login");
        WebElement inputLogin = driver.findElement(By.cssSelector("#username"));
        inputLogin.clear();
        inputLogin.sendKeys("tomsmith");


        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("SuperSecretPassword!");

        driver.findElement(By.tagName("button")).click();

        WebElement message = driver.findElement(By.xpath("//div[@class='flash success']"));
        String textValid= message.getText();

        System.out.println(textValid);


        driver.close();
    }
    @Test
    public void loginPageInvalid(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://the-internet.herokuapp.com/login");
        WebElement inputLogin = driver.findElement(By.cssSelector("#username"));
        inputLogin.clear();
        inputLogin.sendKeys("user");


        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("password!");

        driver.findElement(By.tagName("button")).click();

        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='flash error']"));

        String textInvalid= errorMessage.getText();

        System.out.println(textInvalid);

        driver.close();
    }
}
