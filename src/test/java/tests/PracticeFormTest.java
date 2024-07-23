package tests;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import shareData.ShareData;

import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends ShareData {

    @Test
    public void metodaTest() {

        //Obiecte
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToFormMenu();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.navigateToPracticeForm();

        String firstNameValue = "Mircea";
        String lastNameValue = "Andreea";
        String emailNameValue = "absct@yahoo.com";
        String genderValue= "Male";
        String mobileNumberValue = "0723423451";
        String daysOfBirthValue = "1";
        String subjectInputValue = "Accounting";
        String picturePathValue = "Screenshot 2023-09-14 194516.png";
        String addressElementValue = "adresa";
        String stateInputValue = "Uttar Pradesh";
        String cityInputValue = "Agra";
        List<String> hobbiesValues = Arrays.asList("Sports", "Music");

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.fillEntireForm(firstNameValue, lastNameValue, emailNameValue, genderValue, mobileNumberValue, daysOfBirthValue,
                subjectInputValue, picturePathValue, addressElementValue, stateInputValue, cityInputValue, hobbiesValues);

        practiceFormPage.validateEntireForm(firstNameValue, lastNameValue, emailNameValue, genderValue, mobileNumberValue,
                subjectInputValue, hobbiesValues, picturePathValue, addressElementValue, stateInputValue, cityInputValue);

        // validam tabelul cu valorile introduse


    }
}