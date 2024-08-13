import com.codeborne.selenide.Configuration;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AddRecordPages;

import static com.codeborne.selenide.Selenide.open;

public class AddRecordTest {
    @BeforeTest
    public static void setUp() {
        Configuration.browserSize = "1920x1080";

        Configuration.browser = "chrome";
}
    @Test
    public void Test(){
        open("https://demoqa.com/webtables");

        AddRecordPages addRecordPages = new AddRecordPages();

       addRecordPages.clickAddButton();

        Assert.assertTrue(addRecordPages.isFormTitleDisplayed(), "Registration Form");

        addRecordPages.FillForm("Beyza", "Tasdelen", "beyzakavgacii@gmail.com", 30, 25000, "Yazılım");
        addRecordPages.SubmitForm();

        addRecordPages.EditButton();
        addRecordPages.EditEmail("beyza@mail.com");
        addRecordPages.SubmitForm();

        Assert.assertTrue(addRecordPages.isEmailDisplayed(), "beyza@mail.com");

    }

}
