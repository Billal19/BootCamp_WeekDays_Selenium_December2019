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

    @FindBy(xpath = ContributeXpath)
    WebElement MoveToContribute;
    public void MoveToContribute() throws InterruptedException {
        mouseHoverByXpath(ContributeXpath);
        sleepFor(3);
        clickByXpath(DocumentationXpath);
    }


    @FindBy(xpath = xPathValidateHomePage)public static WebElement validateHomePage;
    public static WebElement getValidateHomePage(){return validateHomePage;}
    public static void setValidateHomePage(){
        String actual =getValidateHomePage().getText();
        System.out.println("Actual is ::"+actual);
        String expected="jQuery UI is a curated set of user interface interactions";
        System.out.println("Expected is:: "+expected);

    }



    @FindBy(xpath = xPathResizeableButton)public static WebElement ResizeButton;
    public static WebElement getResizeButton(){return ResizeButton;}
    public static void clickResizeButton(){getResizeButton().click();}



    @FindBy(how = How.XPATH, using = xPathDragAndDropFrame)
    public static WebElement dragAndDropFrame;
    public static WebElement getDragAndDropFrame(){
        return dragAndDropFrame;
    }

    @FindBy(how= How.XPATH, using = xPathJQueryCalenderIFrame)
    public static WebElement calenderIFrame;
    public static WebElement getCalenerIFrame(){
        return calenderIFrame;
    }

    @FindBy(how = How.XPATH, using = xPathDialogiFrame)
    public static WebElement dialogiFrame;
    public static WebElement getDialogiFrame(){
        return dialogiFrame;
    }

    @FindBy(how = How.XPATH, using = xPathJQuerySelectMenuIFrmae)
    public static WebElement selectMenuIFrame;
    public static WebElement getSelectMenuIFrame(){
        return selectMenuIFrame;
    }

    @FindBy(how = How.XPATH, using = xPathPracticeOpenNewTab)
    public static WebElement practiceOpenNewTab;
    public static WebElement getPracticeOpenNewTab(){
        return practiceOpenNewTab;
    }














}
