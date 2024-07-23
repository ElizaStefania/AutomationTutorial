package tests;

import helperMethods.AlertMethods;
import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.AlertsWindowsPage;
import pages.HomePage;
import shareData.ShareData;

public class AlertTest extends ShareData {

    @Test
    public void metodaTest() {

        //Definim un obiect de tip alert methods ca sa apelam metodele generale din clasa
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToAlertsMenu();

        AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage(getDriver());
        alertsWindowsPage.navigateToMenuPage();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interacteAlertOK();
        alertPage.interacteWinthConfirmation();
        alertPage.interacteWithPromptButton("Button ok");
        alertPage.interacteWithTimerAlert();

    }
}
