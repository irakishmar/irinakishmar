package LoginTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExternalParameters {
    @Parameters({"login","password","role"})
    @Test
    public void extParametrs(String login, String password, String role){
        System.out.println("Username " + login + " has role is " + role + " with password: " + password);
    }
}
