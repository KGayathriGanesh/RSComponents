package com.RSComponents.step_def;

import com.RSComponents.BaseClass;
import com.RSComponents.Constants;
import com.RSComponents.page_obj.HomePage_RS;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver = BaseClass.get_instance().getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    // RS Component Links
    @Then("^\"([^\"]*)\" should be displayed$")
    public void navigateToHomePageLink(String linkName) {
        ExtentCucumberFormatter.setTestRunnerOutput("Link Name : " + linkName);
        try {
                Assert.assertTrue(HomePage_RS.lnk_Menu(linkName, driver).isDisplayed());
            }
        catch (Exception e){
            Assert.fail("Navigate to Home PageLink is Failed" + e);
        }
    }

    @Then("^I verify and click on All products link$")
    public void i_verify_and_click_on_All_products_link() throws Throwable {
        HomePage_RS.all_product(driver);
    }

//    @When("^\"([^\"]*)\" I click on Passive Components$")
//    public void i_click_on_Passive_Components(String compName) throws Throwable {
//        HomePage_RS.passiveComponent(compName, driver);
//    }

    @Given("^I launch the RSComponent HomePage URL$")
    public void homePage() {
        driver.get(Constants.getURL());
        ExtentCucumberFormatter.setTestRunnerOutput("User is in HomePage");
        Assert.assertEquals("https://uk.rs-online.com/web/",driver.getCurrentUrl());
    }

    @Then("^I click on Passive Components$")
    public void i_click_on_Passive_Components() throws Throwable {
        HomePage_RS.passiveComponent(driver);
    }

    @Then("^I Click on Capacitors$")
    public void i_Click_on_Capacitors() throws Throwable {
        HomePage_RS.capacitor_Link(driver);
    }

    @Then("^I click on Login Link and Navigate to login page$")
    public void login_Hompage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePage_RS.login_Hompage(driver);
    }


}
