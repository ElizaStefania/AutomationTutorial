package helperMethods;

import lombok.AllArgsConstructor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class WindowsMethods {

    public WebDriver driver;

    //Metode generale pentru interactiunea cu tab/window
    public void switchSpecificTab(Integer index){
        List<String> window = new ArrayList<>(driver.getWindowHandles()); ///gaseste cate tab-uri/windows sunt deschise in momentul definirii
        //Ne mutam cu focusul pe un anumit tab
        driver.switchTo().window(window.get(index));
    }

    public void closeCurentTab(){
        driver.close();
    }
}
