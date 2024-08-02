package tests;

import objectData.WebTableObject;
import org.testng.annotations.Test;
import pages.ElementPage;
import pages.HomePage;
import pages.WebTablePage;
import shareData.ShareData;

public class WebTableTest extends ShareData {

    @Test
    public void metodaTest() {

        WebTableObject testData=new WebTableObject("src/test/resources/testData/WebTable.json");

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToElementMenu();

        ElementPage elementPage = new ElementPage(getDriver());
        elementPage.navigateToWebTables();

        WebTablePage webTablePage = new WebTablePage(getDriver());
        webTablePage.addEntry(testData);
        webTablePage.editEntry(testData);
        webTablePage.deleteEntry();

    }
}
