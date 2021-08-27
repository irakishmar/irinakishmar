package LoginTest;

import org.testng.annotations.Test;

public class DependClass {
    @Test(dependsOnGroups={"Login"})
    public void dependClass() {
        System.out.println("I'm depend Class");
    }

}
