package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AddRecordPages {

    private SelenideElement addButton = $x("//button[@id='addNewRecordButton']");
    private static SelenideElement FormTitle = $x("//div[@id='registration-form-modal']");

    private SelenideElement firstname = $x("//input[@id='firstName']");
    private SelenideElement Lastname = $x("//input[@id='lastName']");
    private SelenideElement Email = $x("//input[@id='userEmail']");
    private SelenideElement Age = $x("//input[@id='age']");
    private SelenideElement Salary = $x("//input[@id='salary']");
    private SelenideElement Department = $x("//input[@id='department']");
    private SelenideElement Submit = $x("//button[@id='submit']");

    private SelenideElement EditRecord = $x("//span[@title='Edit']");
    private static SelenideElement controlemail = $x("//div[@class='rt-td'][text()='beyza@mail.com']");


    public void clickAddButton(){
        addButton.click();
    }

    public boolean isFormTitleDisplayed(){
        return FormTitle.isDisplayed();
    }

    public void FillForm(String firstNameText, String lastNameText, String emailText, Integer age, Integer  salary, String departmentText){
        firstname.setValue(firstNameText);
        Lastname.setValue(lastNameText);
        Email.setValue(emailText);
        Age.setValue(String.valueOf(age));
        Salary.setValue(String.valueOf(salary));
        Department.setValue(departmentText);

    }

    public void SubmitForm(){
        Submit.click();
    }

    public void EditButton() {
          EditRecord.click();
    }

    public void EditEmail(String newEmail){
        Email.clear();
        Email.setValue(newEmail);
    }


    public static boolean isEmailDisplayed() {
        return controlemail.isDisplayed();
    }

}
