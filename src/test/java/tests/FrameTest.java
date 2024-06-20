package tests;

import helperMethods.AlertMethods;
import helperMethods.ElementMethods;
import helperMethods.FrameMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FrameTest {
    public WebDriver driver;

    @Test
    public void metodaTest() {

        //Deschidem un browser
        driver = new ChromeDriver();

        //Accesam un anumit URL
        driver.get("https://demoqa.com");

        //Maximize browser
        driver.manage().window().maximize();

        //Wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        AlertMethods alertMethods = new AlertMethods(driver);
        ElementMethods elementMethods = new ElementMethods(driver);
        PageMethods pageMethods = new PageMethods(driver);
        FrameMethods frameMethods = new FrameMethods(driver);

        pageMethods.scrollPage(0, 350);
        WebElement alertsMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        // alertsMenu.click();
        frameMethods.switchtoFrame(alertsMenu);

        WebElement frameButton = driver.findElement(By.xpath("//span[text()='Frames']"));
        //alertsForm.click();
        frameMethods.switchtoFrame(frameButton);

        //Ne mutam focusul pe un iframe
        //driver.switchTo().frame("frame1");
        frameMethods.switchtoFrame("frame1");
        WebElement iframeText = driver.findElement(By.id("sampleHeading"));
        System.out.println(iframeText.getText());

        //Ne intoarcem cu focusul la frame-ul default
       // driver.switchTo().defaultContent();
        frameMethods.defaultContent();

        frameMethods.switchtoFrame("frame2");
        WebElement iframeText2 = driver.findElement(By.id("sampleHeading"));
        System.out.println(iframeText2.getText());

        frameMethods.defaultContent();

        pageMethods.scrollPage(0, 350);
        WebElement nestedButton = driver.findElement(By.xpath("//span[text()='Nested Frames']"));
        //alertsForm.click();
        elementMethods.clickElement(nestedButton);

        //Interactionam cu iframe in iframe
        frameMethods.switchtoFrame("frame1");
        WebElement childFrame = driver.findElement(By.xpath("'//iframe[@srcdoc='<p>Child Iframe</p>']'"));
        System.out.println(childFrame.getText());

        WebElement text = driver.findElement(By.xpath("//p"));
        System.out.println(text.getText());

        //driver.quit();
    }
}
