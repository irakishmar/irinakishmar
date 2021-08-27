package LoginTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginFirst {

    @Test(dataProvider = "Authorization", groups = {"Login"})
    public void LoginFromApp(String login, String password, String role){
       // Assert.assertEquals(login, "login3", "App user is incorrect");
      //  Assert.assertEquals(password, "password3", "App user is incorrect");
        //Assert.assertEquals(role, "role3", "App user is incorrect");

        }
        

    @DataProvider(name = "Authorization")
    public Object[][] generateTestData(){
        Object[][] result = {
                {"login1","password1","role1" },
                {"login2","password2","role2" },
                {"login3","password3","role3" }};
        return result;
    }

}