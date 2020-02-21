package TestHomePage;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {

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

    @Test (priority = 2)
    public void FrameCheckRadioBox () throws InterruptedException {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.FrameCheckBoxRadio();

    }
}
