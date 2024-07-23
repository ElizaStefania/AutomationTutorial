package pages;

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
        elementMethods.clickElement(alertButtonOK);
        alertMethods.acceptAlert();
    }

    public void interacteWinthConfirmation(){
        pageMethods.scrollPage(0, 150);
        elementMethods.clickElement(alertConfirmButton);
        alertMethods.dismissAlert();
    }

    public void interacteWithPromptButton(String text){
        elementMethods.clickElement(alertPromptButton);
        alertMethods.fillAlert(text);
    }

    public void interacteWithTimerAlert(){
        elementMethods.clickElement(alertWait);
        alertMethods.acceptAlert();
    }

}
