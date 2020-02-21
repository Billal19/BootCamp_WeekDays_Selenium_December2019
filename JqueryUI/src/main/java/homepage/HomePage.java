package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webelements.HomePageWebElements;

public class HomePage extends HomePageWebElements {


    @FindBy(xpath = DemoXpath)
    WebElement Demo ;
    public void Demo () throws InterruptedException {
        Demo.click();
        sleepFor(5);

    }

    @FindBy(xpath = PluginXpath)
    WebElement Plugin;
    public void Plugin (){
        Plugin.click();
    }

    @FindBy(xpath = CheckBoxRadioXpath)
    WebElement CheckBoxRadio;
    public void CheckBoxRadio() throws InterruptedException {
        CheckBoxRadio.click();
        sleepFor(3);


    }
}
