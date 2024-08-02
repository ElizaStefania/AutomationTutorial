package tests;

import objectData.PracticeFormObject;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import shareData.ShareData;

public class PracticeFormTest extends ShareData {

    @Test
    public void metodaTest() {

        PracticeFormObject testData = new PracticeFormObject("src/test/resources/testData/PracticeFormData.json");

        //Obiecte
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToFormMenu();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.navigateToPracticeForm();

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.fillEntireForm(testData);

        practiceFormPage.validateEntireForm(testData);

        // validam tabelul cu valorile introduse


    }
}