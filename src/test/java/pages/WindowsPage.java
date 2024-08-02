package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsPage extends BasePage{

    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    private WebElement newTab;

    @FindBy(id = "windowButton")
    private WebElement newWindow;

    public void interactWithNewTab(){
        pageMethods.scrollPage(0, 150);
        LoggerUtility.info("The user scrolled down the page");
        elementMethods.clickElement(newTab);
        LoggerUtility.info("The user clicked on new tab button");
        System.out.println(driver.getCurrentUrl()); //url-ul paginii curente pe care ne aflam
        windowsMethods.switchSpecificTab(1);
        LoggerUtility.info("The user switched on second tab");
        System.out.println(driver.getCurrentUrl());
        LoggerUtility.info("The user closed the current tab");
        windowsMethods.closeCurentTab();
        windowsMethods.switchSpecificTab(0);
        LoggerUtility.info("The user switched back on the default tab");
    }

    public void interactWithNewWindow(){
        pageMethods.scrollPage(0, 150);
        LoggerUtility.info("The user scrolled down the page");
        newWindow.click();
        LoggerUtility.info("The user performed a click");
        System.out.println(driver.getCurrentUrl());
        windowsMethods.switchSpecificTab(1);
        LoggerUtility.info("The user switched to another tab");
        System.out.println(driver.getCurrentUrl());
        windowsMethods.closeCurentTab();
        LoggerUtility.info("The user closed the current tab");
    }
}
