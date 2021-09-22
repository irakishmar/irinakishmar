package DynamicControlTest;

import DynamicControlSelenide.DynamicControl;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DynamicControlTest {
    @Test
    public void checkboxButtonTest() {
        open("https://the-internet.herokuapp.com/dynamic_controls");

        DynamicControl dynamicControl = new DynamicControl();

        dynamicControl.clickCheckbox();
        dynamicControl.removeCheckbox();
        dynamicControl.addCheckbox();
        dynamicControl.actionEnable();
        dynamicControl.actionDisable();

        System.out.println("done");
    }

}
