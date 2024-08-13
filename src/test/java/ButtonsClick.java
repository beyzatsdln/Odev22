import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ButtonsPage;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class ButtonsClick {
    @BeforeTest
    public static void setUp() {
        Configuration.browserSize = "1920x1080";

        Configuration.browser = "chrome";
    }

    @Test
    public void testClickButton() {

        open("https://demoqa.com/elements");


        ButtonsPage buttonsPage = new ButtonsPage();

        buttonsPage.clickButtonsMenuItem();

        buttonsPage.clickClickMeButton();


        String expectedMessage = "You have done a dynamic click";
        Assert.assertEquals(expectedMessage, buttonsPage.getClickMessageText());
    }
}
