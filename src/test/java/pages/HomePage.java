package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsMenu;

    @FindBy(xpath = "//h5[text()='Forms']")
    private  WebElement formMenu;

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementMenu;

    public void navigateToAlertsMenu(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(alertsMenu);
        LoggerUtility.info("The user clicks on Alerts menu");
    }

    public void navigateToFormMenu(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(formMenu);
        LoggerUtility.info("The user clicks on Form menu");
    }

    public void navigateToElementMenu(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(elementMenu);
        LoggerUtility.info("The user clicks on Element menu");
    }
}
