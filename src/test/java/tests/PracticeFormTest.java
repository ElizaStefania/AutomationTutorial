package tests;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormTest {
    public WebDriver driver;

    @Test
    public void metodaTest() {

        //Deschidem un browser
        driver = new ChromeDriver();

        //Accesam un anumit URL
        driver.get("https://demoqa.com");

        //Maximize browser
        driver.manage().window().maximize();

        //Obiecte
        ElementMethods elementMethods = new ElementMethods(driver);
        PageMethods pageMethods = new PageMethods(driver);

        HomePage homePage = new HomePage(driver);
        homePage.navigateToFormMenu();

        FormsPage formsPage = new FormsPage(driver);
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

        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.fillEntireForm(firstNameValue, lastNameValue, emailNameValue, genderValue, mobileNumberValue, daysOfBirthValue,
                subjectInputValue, picturePathValue, addressElementValue, stateInputValue, cityInputValue, hobbiesValues);

        practiceFormPage.validateEntireForm(firstNameValue, lastNameValue, emailNameValue, genderValue, mobileNumberValue,
                subjectInputValue, hobbiesValues, picturePathValue, addressElementValue, stateInputValue, cityInputValue);

        // validam tabelul cu valorile introduse


    }
}