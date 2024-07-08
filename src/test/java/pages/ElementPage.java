package pages;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementPage {
    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    public ElementPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        pageMethods  = new PageMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    public WebElement webTables;



    public void navigateToWebTables(){
        elementMethods.clickJSElement(webTables);
    }
}
