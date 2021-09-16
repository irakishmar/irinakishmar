package PageObjectTest;

import PageObject.LoginPage;
import PageObject.MainPage;
import org.testng.annotations.Test;

public class InvalidLoginTets extends BaseTest {
    @Test
    public void loginTest(){
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("11")
                .setPassword("11!1")
                .clickLoginButton()
                .getInvalidMessage("Your username is invalid!");






    }

}
