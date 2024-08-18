package common;

import pages.AddRecordPages;
import pages.ButtonsPage;


public class PageFactory {

    public static AddRecordPages buildAddRecordPage() {
        return new AddRecordPages();
    }

    public static ButtonsPage buildButtonsPage() {
        return new ButtonsPage();
    }

}