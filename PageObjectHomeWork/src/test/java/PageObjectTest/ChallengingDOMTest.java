package PageObjectTest;

import PageObject.ChallengingDOM;
import PageObject.MainPage;
import org.testng.annotations.Test;

public class ChallengingDOMTest extends BaseTest{
    @Test
    public void ChallengingDOM(){
        driver.get("https://the-internet.herokuapp.com");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToChallengingDOM();

        ChallengingDOM challengingDOM = new ChallengingDOM(driver);
        challengingDOM.clickFirstButton()
                .clickSecondButton()
                .clickThirdButton()
                .getElements();

    }
}
