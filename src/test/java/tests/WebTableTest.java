package tests;

import org.testng.annotations.Test;
import pages.ElementPage;
import pages.HomePage;
import pages.WebTablePage;
import shareData.ShareData;

public class WebTableTest extends ShareData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToElementMenu();

        ElementPage elementPage = new ElementPage(getDriver());
        elementPage.navigateToWebTables();

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addEntry("Eliza", "Visan", "eliza@yahoo.com", "32", "2300", "IT");
        webTablePage.editEntry("1000", "Testing");
        webTablePage.deleteEntry();

    }
}
