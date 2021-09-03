package HomeWork13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public  class BaseTest {
    protected WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }


}