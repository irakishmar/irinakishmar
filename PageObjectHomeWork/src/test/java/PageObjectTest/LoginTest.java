package PageObjectTest;

import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.SecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @Test
   public void loginTest(){
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton()
                .getMessage("You logged into a secure area!")
                .logout();





    }

}
