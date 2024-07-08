package tests;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.ElementPage;
import pages.HomePage;
import pages.WebTablePage;

public class WebTableTest {

    public WebDriver driver;

    @Test
    public void metodaTest() {

        //Deschidem un browser
        driver = new ChromeDriver();

        //Accesam un anumit URL
        driver.get("https://demoqa.com");

        //Maximize browser
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        homePage.navigateToElementMenu();

        ElementPage elementPage = new ElementPage(driver);
        elementPage.navigateToWebTables();

        WebTablePage webTablePage = new WebTablePage(driver);
        webTablePage.addEntry("Eliza", "Visan", "eliza@yahoo.com", "32", "2300", "IT");
        webTablePage.editEntry("1000", "Testing");
        webTablePage.deleteEntry();


        driver.quit();
    }
}
