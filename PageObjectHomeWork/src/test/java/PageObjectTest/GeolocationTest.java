package PageObjectTest;

import PageObject.GeolocationPage;
import PageObject.MainPage;
import org.testng.annotations.Test;

public class GeolocationTest extends BaseTest{
    @Test
    public void geolocationTest(){
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToGeolocation();

        GeolocationPage geolocationPage = new GeolocationPage(driver);
        geolocationPage.clickButton().getLocation();



    }
}
