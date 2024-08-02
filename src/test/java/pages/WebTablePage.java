package pages;

import objectData.WebTableObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage{

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addRecordButton;

    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement userEmailElement;

    @FindBy(id = "age")
    private WebElement ageElement;

    @FindBy(id = "salary")
    private WebElement salaryElement;

    @FindBy(id = "department")
    private WebElement departmentElement;

    @FindBy(id = "submit")
    private WebElement submitElement;

    @FindBy(id = "edit-record-4")
    private WebElement updateEntry;

    @FindBy(id = "salary")
    private WebElement editSalaryElement;

    @FindBy(id = "departament")
    private WebElement editDepartmentElement;

    @FindBy(id = "submit")
    private WebElement editSubmitElement;

    @FindBy(id = "delete-record-4")
    private WebElement deleteEntry;

    public void addEntry(WebTableObject testData){
        pageMethods.scrollPage(0, 150);
        elementMethods.clickElement(addRecordButton);
        elementMethods.fillelement(firstNameElement,  testData.getFirstNameValue());
        elementMethods.fillelement(lastNameElement, testData.getLastNameValue());
        elementMethods.fillelement(userEmailElement, testData.getEmailValue());
        elementMethods.fillelement(ageElement, testData.getAgeValue());
        elementMethods.fillelement(salaryElement, testData.getSalaryValue());
        elementMethods.fillelement(departmentElement, testData.getDepartmentValue());
        pageMethods.scrollPage(0, 150);
        elementMethods.clickElement(submitElement);

    }
    public void editEntry(WebTableObject testData){

        elementMethods.clickElement(updateEntry);
        elementMethods.fillelement(editSalaryElement, testData.getEditsalaryValue());
        elementMethods.fillelement(editDepartmentElement, testData.getEditdepartmentValue());
        elementMethods.clickElement(editSubmitElement);

    }

    public void deleteEntry(){
        elementMethods.clickElement(deleteEntry);
    }
}
