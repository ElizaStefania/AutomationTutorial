package pages;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "addNewRecordButton")
    public WebElement addElement;

    @FindBy(id = "firstName")
    public WebElement firstNameElement;

    @FindBy(id = "lastName")
    public WebElement lastNameElement;

    @FindBy(id = "userEmail")
    public WebElement userEmailElement;

    @FindBy(id = "age")
    public WebElement ageElement;

    @FindBy(id = "salary")
    public WebElement salaryElement;

    @FindBy(id = "department")
    public WebElement departmentElement;

    @FindBy(id = "submit")
    public WebElement submitElement;

    @FindBy(id = "edit-record-4")
    public WebElement updateEntry;

    @FindBy(id = "salary")
    public WebElement editSalaryElement;

    @FindBy(id = "departament")
    public WebElement editDepartmentElement;

    @FindBy(id = "submit")
    public WebElement editSubmitElement;

    @FindBy(id = "delete-record-4")
    public WebElement deleteEntry;



    public void addEntry(String firstNameValue, String lastNameValue, String userEmailValue,
                         String ageValue, String salaryValue, String departmentValue){
        elementMethods.clickElement(addElement);
        elementMethods.fillelement(firstNameElement, firstNameValue);
        elementMethods.fillelement(lastNameElement, lastNameValue);
        elementMethods.fillelement(userEmailElement, userEmailValue);
        elementMethods.fillelement(ageElement, ageValue);
        elementMethods.fillelement(salaryElement, salaryValue);
        elementMethods.fillelement(departmentElement, departmentValue);
        elementMethods.clickElement(submitElement);

    }
    public void editEntry(String editSalaryValue, String editDepartamentValue){

        elementMethods.clickElement(updateEntry);
        elementMethods.fillelement(editSalaryElement, editSalaryValue);
        elementMethods.fillelement(editDepartmentElement, editDepartamentValue);
        elementMethods.clickElement(editSubmitElement);

    }

    public void deleteEntry(){
        elementMethods.clickElement(deleteEntry);
    }
}
