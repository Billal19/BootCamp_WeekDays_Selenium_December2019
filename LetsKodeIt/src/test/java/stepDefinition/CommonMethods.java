package stepDefinition;

import TestHomePage.TestHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import TestHomePage.TestHomePage;

import java.io.IOException;

public class CommonMethods extends TestHomePage {


    @Given("I am at Letskodeit Homepage")
    public void i_am_at_Letskodeit_Homepage() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        setUp(false,"","windows","10","chrome","79","https://learn.letskodeit.com/");
    }


    @Then("I Close Browser")
    public void i_Close_Browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }
}
