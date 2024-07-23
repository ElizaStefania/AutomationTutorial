package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement iframeText;

    @FindBy(id = "sampleHeading")
    private WebElement iframeText2;

    @FindBy(xpath = "//span[text()='Nested Frames']")
    private WebElement nestedButton;

    public void interectWithBigIFrame(){
        frameMethods.switchtoFrame("frame1");
        System.out.println(iframeText.getText());
        frameMethods.defaultContent();
    }

    public void interectWithSmallIFame(){
        frameMethods.switchtoFrame("frame2");
        System.out.println(iframeText2.getText());
        frameMethods.defaultContent();
    }

    public void navigateToNastedFrame(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(nestedButton);
    }
}
