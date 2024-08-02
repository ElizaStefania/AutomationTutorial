package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementPage extends BasePage {

    public ElementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTables;

    public void navigateToWebTables(){
        elementMethods.clickJSElement(webTables);
        LoggerUtility.info("The user clicked on the Web Table submenu");
    }
}
