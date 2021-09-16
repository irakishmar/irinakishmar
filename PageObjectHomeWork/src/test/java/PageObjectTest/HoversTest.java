package PageObjectTest;

import PageObject.BasePage;
import PageObject.Hovers;
import PageObject.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {

    @Test
    public void hovers(){
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToHovers();

        Hovers hovers = new Hovers(driver);
        hovers.moveToFirstElement()
                .moveToSecondElement()
                .moveToThirdElement();

    }
}
