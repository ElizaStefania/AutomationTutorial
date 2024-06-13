package tests;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import helperMethods.WindowsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest {

    public WebDriver driver;

    @Test
    public void metodaTest() {

        //Deschidem un browser
        driver = new ChromeDriver();

        //Accesam un anumit URL
        driver.get("https://demoqa.com");

        //Maximize browser
        driver.manage().window().maximize();

        //Definim un obliect de tipul Window Methods
        WindowsMethods windowsMethods = new WindowsMethods(driver);
        ElementMethods elementMethods = new ElementMethods(driver);
        PageMethods pageMethods  = new PageMethods(driver);

        //scroll
    /*
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
    */
        pageMethods.scrollPage(0, 350);

        WebElement alertsMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        //alertsMenu.click();
        elementMethods.clickElement(alertsMenu);

        //js.executeScript("window.scrollBy(0,100)");
        pageMethods.scrollPage(0, 100);
        WebElement browserWindows = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        //browserWindows.click();
        elementMethods.clickElement(alertsMenu);

       // js.executeScript("window.scrollBy(0,150)");
        pageMethods.scrollPage(0, 150);
        WebElement newTab = driver.findElement(By.id("tabButton"));
        //newTab.click();
        elementMethods.clickElement(alertsMenu);

        //Interactionam cu un tab/window
        System.out.println(driver.getCurrentUrl()); //url-ul paginii curente pe care ne aflam
    /*
        List<String> tabs = new ArrayList<>(driver.getWindowHandles()); ///gaseste cate tab-uri/windows sunt deschise in momentul definirii
        //Ne mutam cu focusul pe un anumit tab
        driver.switchTo().window(tabs.get(1));
     */
        windowsMethods.switchSpecificTab(1);
        System.out.println(driver.getCurrentUrl());

        //Inchidem tab-ul curent
       // driver.close();
        windowsMethods.closeCurentTab();

        //driver.switchTo().window(tabs.get(0));
        windowsMethods.switchSpecificTab(0);

        //js.executeScript("window.scrollBy(0,150)");
        pageMethods.scrollPage(0, 150);
        WebElement newWindow = driver.findElement(By.id("windowButton"));
        newWindow.click();

        System.out.println(driver.getCurrentUrl());
        /*
        List<String> window = new ArrayList<>(driver.getWindowHandles()); ///gaseste cate tab-uri/windows sunt deschise in momentul definirii
        //Ne mutam cu focusul pe un anumit tab
        driver.switchTo().window(window.get(1));
         */
        windowsMethods.switchSpecificTab(1);
        System.out.println(driver.getCurrentUrl());

        //driver.close();
        windowsMethods.closeCurentTab();

        driver.quit();

        }
    }
