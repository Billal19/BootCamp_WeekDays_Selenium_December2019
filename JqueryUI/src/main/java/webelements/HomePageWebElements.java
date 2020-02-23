package webelements;

import common.WebAPI;

public class HomePageWebElements extends WebAPI {

    public static final String DemoXpath="//a[contains(text(),'Demos')]";
    public static final String PluginXpath="//a[contains(text(),'Plugins')]";
    public static final String CheckBoxRadioXpath ="//a[contains(text(),'Checkboxradio')]";
    public static final String FrameXpath = "//iframe[@class='demo-frame']";
    public static final String NewYorkXpath ="//label[contains(text(),'New York')]";
    public static final String ParisXpath ="//label[contains(text(),'Paris')]";
    public static final String LondonXpath ="//label[contains(text(),'London')]";
    public static final String ContributeXpath ="//a[contains(text(),'Contribute')]";
    public static final String DocumentationXpath="//li[@class='dropdown']//ul//li//a[contains(text(),'Documentation')]";

    public static  final String xPathValidateHomePage="//p[@class='intro']";
    public static final String xPathResizeableButton = "//a[contains(text(),'Resizable')]";

    public static final String xPathDragAndDropFrame = "//iframe[@class='demo-frame']";

    public static final String xPathDialogiFrame = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/iframe[1]";

    public static final String xPathJQueryCalenderIFrame = "//iframe[@class='demo-frame']";

    public static final String xPathJQuerySelectMenuIFrmae = "//iframe[@class='demo-frame']";

    public static final String xPathPracticeOpenNewTab = "//a[@id='opentab']";






}
