package pages;

import objectData.PracticeFormObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;
import java.util.List;

public class PracticeFormPage extends BasePage{

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement emailElement;

    @FindBy(xpath = "//div[@id='genterWrapper']/div/div/label[@class='custom-control-label']")
    private List<WebElement> genderElements;

    @FindBy(id = "userNumber")
    private WebElement mobileNumberElement;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirth;

    @FindBy(className = "react-datepicker__month-select")
    private WebElement dateOfBirthMonthElement;

    @FindBy(xpath = "//div[@class='react-datepicker__month']//div[not(contains(@class,'--outside-month')) and @role='option']")
    private List<WebElement> daysOfBirthElements;

    @FindBy(className = "react-datepicker__year-select")
    private WebElement yearOfBirth;

    @FindBy(id = "subjectsInput")
    private WebElement subjectInputElement;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']/div/div/label[@class='custom-control-label']")
    private List<WebElement> hobbiesElements;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPictureElement;

    @FindBy(id = "currentAddress")
    private WebElement addressElement;

    @FindBy(id = "state")
    private WebElement stateElement;

    @FindBy(id = "react-select-3-input")
    private WebElement stateInputElement;

    @FindBy(id = "react-select-4-input")
    private WebElement cityInputElement;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitForm;


    @FindBy(xpath = "//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr")
    private List<WebElement> tableValue;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement thankYouMessageElement;


    public void fillEntireForm(PracticeFormObject testData){
        elementMethods.fillelement(firstNameElement, testData.getFirstNameValue());
        elementMethods.fillelement(lastNameElement, testData.getLastNameValue());
        elementMethods.fillelement(emailElement, testData.getEmailValue());
        pageMethods.scrollPage(0, 350);
      switch (testData.getGenderValue()){
            case "Male":
                elementMethods.clickElement(genderElements.get(0));
                break;
            case "Female":
                elementMethods.clickElement(genderElements.get(1));
                break;
            case  "Other":
                elementMethods.clickElement(genderElements.get(2));
                break;
        }
        elementMethods.fillelement(mobileNumberElement, testData.getUserNumberValue());
        elementMethods.clickElement(dateOfBirth);
        elementMethods.selectByTextElement(dateOfBirthMonthElement, "September");
        elementMethods.selectByValueElement(yearOfBirth, "2024");
        for (Integer index = 0; index<daysOfBirthElements.size(); index++){
            if(daysOfBirthElements.get(index).getText().equals(testData.getChooseDayValue())){
                elementMethods.clickElement(daysOfBirthElements.get(index));
                break;
            }
        }
        pageMethods.scrollPage(0, 150);
        elementMethods.fillelement(subjectInputElement, testData.getSubjectValue());
        elementMethods.pressElement(subjectInputElement, Keys.ENTER);
         pageMethods.scrollPage(0, 350);
        for(Integer index = 0; index<hobbiesElements.size(); index++) {
            String hobbieText = hobbiesElements.get(index).getText();
            if(testData.getActivitatiValue().contains(hobbieText)){
                elementMethods.clickJSElement(hobbiesElements.get(index));
            }
        }
        File file = new File("src/test/resources/" + testData.getTerminatiePath());
        uploadPictureElement.sendKeys(file.getAbsolutePath());

        elementMethods.fillelement(addressElement, testData.getUserAddressValue());

        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(stateElement);

        elementMethods.fillelement(stateInputElement, testData.getStateinputValue());
        elementMethods.pressElement(stateInputElement, Keys.ENTER);

        elementMethods.fillelement(cityInputElement, testData.getCityinputValue());
        elementMethods.pressElement(cityInputElement, Keys.ENTER);
        pageMethods.scrollPage(0, 350);
        elementMethods.clickJSElement(submitForm);
    }

    public void validateEntireForm(PracticeFormObject testData){

        Assert.assertEquals(thankYouMessageElement.getText(), "Thanks for submitting the form");

        Assert.assertEquals(tableValue.get(0).getText(), "Student Name " + testData.getFirstNameValue() + " " + testData.getLastNameValue());
        Assert.assertEquals(tableValue.get(1).getText(), "Student Email " + testData.getEmailValue());
        Assert.assertEquals(tableValue.get(2).getText(), "Gender " + testData.getGenderValue());
        Assert.assertEquals(tableValue.get(3).getText(), "Mobile " + testData.getUserNumberValue());
        Assert.assertEquals(tableValue.get(5).getText(), "Subjects " + testData.getSubjectValue());
        String exceptedHobbiesText = "Hobbies " + String.join(", ", testData.getActivitatiValue());
        Assert.assertEquals(tableValue.get(6).getText(), exceptedHobbiesText);
        Assert.assertEquals(tableValue.get(7).getText(), "Picture " + testData.getTerminatiePath());
        Assert.assertEquals(tableValue.get(8).getText(), "Address " + testData.getUserAddressValue());
        Assert.assertEquals(tableValue.get(9).getText(), "State and City " + testData.getStateinputValue() + " " + testData.getCityinputValue());

        WebElement closeElement = driver.findElement(By.id("closeLargeModal"));
        //js.executeScript("arguments[0].click;", closeElement);
        elementMethods.clickJSElement(closeElement);

    }

}
