package tests;

import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.HomePage;
import pages.WindowsPage;
import shareData.ShareData;

public class WindowTest extends ShareData {

    @Test
    public void metodaTest() {

        //Definim un obliect de tipul Window Methods
        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToAlertsMenu();

        AlertsWindowsPage alertsWindows = new AlertsWindowsPage(getDriver());
        alertsWindows.navigateToWindowPage();

        WindowsPage windowsPage = new WindowsPage(getDriver());
        windowsPage.interactWithNewTab();
        windowsPage.interactWithNewWindow();
        }
    }
