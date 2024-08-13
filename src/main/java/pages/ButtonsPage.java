package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ButtonsPage {


    private SelenideElement buttonsMenuItem = $x("//span[text()='Buttons']");

    private SelenideElement clickMeButton = $x("//button[text()='Click Me']");

    private SelenideElement clickMessage = $x("//p[@id='dynamicClickMessage']");


    public void clickButtonsMenuItem() {
        buttonsMenuItem.click();
    }

    public void clickClickMeButton() {
        clickMeButton.click();
    }

    public String getClickMessageText() {
        return clickMessage.getText();
    }
}
