package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "alertButton")
    private WebElement alertButtonOK;

    @FindBy(id = "confirmButton")
    private WebElement alertConfirmButton;

    @FindBy(id = "promtButton")
    private WebElement alertPromptButton;

    @FindBy(id = "timerAlertButton")
    private  WebElement alertWait;

    public void interacteAlertOK(){
        pageMethods.scrollPage(0, 150);
        LoggerUtility.info("The user scrolls down the page");
        elementMethods.clickElement(alertButtonOK);
        LoggerUtility.info("The user clicks on the alertOK button");
        alertMethods.acceptAlert();
        LoggerUtility.info("The user interacts with the alertOK successfully");
    }

    public void interacteWinthConfirmation(){
        pageMethods.scrollPage(0, 150);
        LoggerUtility.info("The user scrolls down the page");
        elementMethods.clickElement(alertConfirmButton);
        LoggerUtility.info("The user clicks on the confirmAlert button");
        alertMethods.dismissAlert();
        LoggerUtility.info("The user interacts with the confirmAlert successfully");
    }

    public void interacteWithPromptButton(String text){
        elementMethods.clickElement(alertPromptButton);
        LoggerUtility.info("The user clicks on the prompt button");
        alertMethods.fillAlert(text);
        LoggerUtility.info("The user submits the text in the prompt");
    }

    public void interacteWithTimerAlert(){
        elementMethods.clickElement(alertWait);
        LoggerUtility.info("The user clicks on the alertDelay button");
        alertMethods.acceptAlert();
        LoggerUtility.info("The user interacts with the alertDelay successfully");
    }

}
