package DynamicControlSelenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DynamicControl {
    private SelenideElement checkbox = $x( "//input[@label='blah']");
    private SelenideElement removeCheckboxButton = $x( "//button[@onclick='swapCheckbox()'][contains(.,'Remove')]");
    private SelenideElement addButton = $x("//button[@onclick='swapCheckbox()'][contains(.,'Add')]");

    public void clickCheckbox(){
        checkbox.shouldBe(Condition.appear).shouldBe(Condition.visible).click();

    }
    public  void removeCheckbox(){
        removeCheckboxButton.shouldBe(Condition.appear).shouldBe(Condition.visible).click();
    }

    public void addCheckbox(){
        addButton.shouldBe(Condition.appear).shouldBe(Condition.visible).click();
    }

    private SelenideElement enableButton = $x("//button[@onclick='swapInput()'][contains(.,'Enable')]");
    private SelenideElement disableButton = $x("//button[@onclick='swapInput()'][contains(.,'Disable')]");

    public void actionEnable(){
        enableButton.shouldBe(Condition.appear).shouldBe(Condition.visible).click();
    }
    public void actionDisable(){
        disableButton.shouldBe(Condition.appear).shouldBe(Condition.visible).click();
    }
}
