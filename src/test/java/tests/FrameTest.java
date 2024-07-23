package tests;

import helperMethods.AlertMethods;
import helperMethods.ElementMethods;
import helperMethods.FrameMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.FramePage;
import pages.HomePage;
import pages.NestedFramePage;
import shareData.ShareData;

import java.time.Duration;

public class FrameTest extends ShareData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToAlertsMenu();

        AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage(getDriver());
        alertsWindowsPage.navigateToFramePage();

        FramePage framePage = new FramePage(getDriver());
        framePage.interectWithBigIFrame();
        framePage.interectWithSmallIFame();
        framePage.navigateToNastedFrame();

        NestedFramePage nestedFramePage = new NestedFramePage(getDriver());
        nestedFramePage.interectWithNestedFrame();

    }
}
