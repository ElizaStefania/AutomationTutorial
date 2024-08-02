package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsWindowsPage extends BasePage {

    public AlertsWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindows;

    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement frameButton;

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertForm;

    public void navigateToWindowPage(){
        pageMethods.scrollPage(0, 100);
        elementMethods.clickElement(browserWindows);
        LoggerUtility.info("The user clicks on Form submenu");
    }

    public void navigateToFramePage(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(frameButton);
        LoggerUtility.info("The user clicks on Frame page");
    }

    public void  navigateToMenuPage(){
        pageMethods.scrollPage(0,350);
        elementMethods.clickElement(alertForm);
        LoggerUtility.info("The user clicks on Alerts form");
    }
}
