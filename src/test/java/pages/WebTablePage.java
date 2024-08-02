package pages;

import loggerUtility.LoggerUtility;
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
        LoggerUtility.info("The user clicked to add a new entry");
        elementMethods.fillelement(firstNameElement,  testData.getFirstNameValue());
        LoggerUtility.info("The user fills firstname element with the value: " + testData.getFirstNameValue());
        elementMethods.fillelement(lastNameElement, testData.getLastNameValue());
        LoggerUtility.info("The user fills in the lastname element with the value: " + testData.getLastNameValue());
        elementMethods.fillelement(userEmailElement, testData.getEmailValue());
        LoggerUtility.info("The user fills in the useremailelement with the value: " + testData.getEmailValue());
        elementMethods.fillelement(ageElement, testData.getAgeValue());
        LoggerUtility.info("The user fills in the ageelement with the value: " + testData.getAgeValue());
        elementMethods.fillelement(salaryElement, testData.getSalaryValue());
        LoggerUtility.info("The user fills in the salaryelement with the value: " + testData.getSalaryValue());
        elementMethods.fillelement(departmentElement, testData.getDepartmentValue());
        LoggerUtility.info("The user fills in the departmentelement with the value: " + testData.getDepartmentValue());
        pageMethods.scrollPage(0, 150);
        LoggerUtility.info("The user scrolled down the page");
        elementMethods.clickElement(submitElement);
        LoggerUtility.info("The user clicked to submit the form");

    }
    public void editEntry(WebTableObject testData){

        elementMethods.clickElement(updateEntry);
        LoggerUtility.info("The user clicked to edit an existing entry");
        elementMethods.fillelement(editSalaryElement, testData.getEditsalaryValue());
        LoggerUtility.info("The user edits firstname element with the value: " + testData.getEditsalaryValue());
        elementMethods.fillelement(editDepartmentElement, testData.getEditdepartmentValue());
        LoggerUtility.info("The user edits the salaryelement  with the value: " + testData.getEditdepartmentValue());
        elementMethods.clickElement(editSubmitElement);
        LoggerUtility.info("The user clicked to submit the edited values");

    }

    public void deleteEntry(){
        elementMethods.clickElement(deleteEntry);
        LoggerUtility.info("The user clicked to delete the entry");
    }
}
