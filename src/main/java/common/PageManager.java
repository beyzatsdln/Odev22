package common;

import driver.DriverFactory;
import pages.AddRecordPages;
import pages.ButtonsPage;


public class PageManager {
    public AddRecordPages addRecordPages;
    public ButtonsPage buttonsPage;

    public PageManager() {

        DriverFactory.initDriver();

        addRecordPages = PageFactory.buildAddRecordPage();
       buttonsPage = PageFactory.buildButtonsPage();

    }
}