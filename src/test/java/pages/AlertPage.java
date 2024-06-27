package pages;

import helperMethods.AlertMethods;
import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;
    public AlertMethods alertMethods;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        pageMethods  = new PageMethods(driver);
        alertMethods = new AlertMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "alertButton")
    public WebElement alertButtonOK;

    @FindBy(id = "confirmButton")
    public WebElement alertConfirmButton;

    @FindBy(id = "promtButton")
    public WebElement alertPromptButton;

    @FindBy(id = "timerAlertButton")
    public  WebElement alertWait;

    public  void interacteAlertOK(){
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
        elementMethods.clickElement(alertPromptButton);
        alertWait.click();
        elementMethods.clickElement(alertWait);

    }

}
