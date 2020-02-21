package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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

    @FindBy(how = How.XPATH,using = FrameXpath)
    public static WebElement radioFrame;
    public static WebElement getRadioFrame(){
        return radioFrame;
    }
    @FindBy(xpath = CheckBoxRadioXpath)
    WebElement Radio;
    public void FrameCheckBoxRadio() throws InterruptedException {
        clickByXpath(CheckBoxRadioXpath);
        iframeHandle(radioFrame);
        sleepFor(3);
        radioButton(NewYorkXpath);
        sleepFor(2);
        radioButton(ParisXpath);
        sleepFor(2);
        radioButton(LondonXpath);




    }
}
