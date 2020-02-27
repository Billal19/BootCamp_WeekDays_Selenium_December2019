package TestHomePage;

import common.CommonWebApi;
import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static homepage.HomePage.*;
import static webelements.HomePageWebElements.*;

public class TestHomePage extends CommonWebApi {


//    @Test(priority = 0)
//    public void Demo () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver, HomePage.class);
//        home.Demo();
//    }
//
//    @Test (priority = 1)
//    public void Plugin () {
//        HomePage home = PageFactory.initElements(driver, HomePage.class);
//        home.Plugin();
//    }
//
//    @Test (priority = 2)
//    public void CheckBoxRadio () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver, HomePage.class);
//        home.CheckBoxRadio();
//
//    }

//    @Test (priority = 3)
//    public void FrameCheckRadioBox () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver, HomePage.class);
//        home.FrameCheckBoxRadio();
//
//    }
//
//    @Test (priority = 4)
//    public void MoveToContribute () throws InterruptedException {
//        HomePage home = PageFactory.initElements(driver, HomePage.class);
//        home.MoveToContribute();
//
//    }
//

    @Test(priority = 5)
    public static void testHomePage() throws InterruptedException {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        sleepFor(2);
        setValidateHomePage();
    }
    @Test(priority = 6)
    public void testResizeElement() throws InterruptedException {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickResizeButton();
        sleepFor(2);
        resizeElement(xPathResizeFrameLocator, xPathResizeSnippet);
        sleepFor(2);
    }
    @Test(priority = 7)
    public void testDragAndDrop() throws InterruptedException {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        clickOnElement(xPathDragAndDropButton);
        iframeHandle(dragAndDropFrame);
        sleepFor(2);
        dragAndDrop(xPathDragFrom, xPathDropTo);
        sleepFor(2);
    }
    @Test (priority = 8)
    public void testIsPopUpDisplayed() throws InterruptedException {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        clickOnElement(xPathDialogTab);
        //clickOnElement(xPathDialogiFrame);
        sleepFor(3);
        Assert.assertTrue(driver.findElement(By.xpath(xPathDialogPopUp)).isDisplayed());

    }
    @Test (priority = 9)
    public void testIsPopUpClosed() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        clickOnElement(xPathDialogTab);
        iframeHandle(dialogiFrame);
        clickOnElement("/html[1]/body[1]/div[1]/div[1]");
        driver.switchTo().alert().accept();
    }
    @Test(priority = 10)
    public void testJQueryTitle(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        clickOnElement(xPathJQueryImage);
        if (driver.getTitle().equals("jQuery UI")) {
            System.out.println("Jquery is our current website ");
        } else {
            System.out.println("Jquery is NOT our current website");
        }
    }
    @Test(priority = 11)
    public void testRightMouseClick() throws InterruptedException {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        sleepFor(5);
        rightClickMouse(xPathResizeableButton);
        sleepFor(2);
    }










}
