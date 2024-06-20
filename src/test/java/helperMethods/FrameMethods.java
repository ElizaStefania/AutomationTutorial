package helperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FrameMethods {

    public WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }
    public void switchtoFrame(String text){
        driver.switchTo().frame(text);
    }

    public void switchtoFrame(WebElement element){
        driver.switchTo().frame(element);
    }

    public void defaultContent(){
        driver.switchTo().defaultContent();
    }
}
