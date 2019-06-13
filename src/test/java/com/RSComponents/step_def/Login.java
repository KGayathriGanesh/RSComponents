package com.RSComponents.step_def;

import com.RSComponents.BaseClass;
import com.RSComponents.page_obj.HomePage_RS;
import com.RSComponents.page_obj.Login_RS;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    WebDriver driver = BaseClass.get_instance().getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Then("^I login with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_should_enter_the_Username_and_Password(String UserName, String Password) throws Throwable {
        Login_RS.enterUserName(UserName , driver);
        Login_RS.enterPassword(Password, driver);
    }

    @Then("^I Click on the Login Button$")
    public void i_Click_on_the_Login_Button() throws Throwable {
        Login_RS.clickLoginBtn(driver);
    }

    @Then("^I should enter the Email address as \"([^\"]*)\"$")
    public void i_should_enter_the_Email_address(String eMailid) throws Throwable {
        Login_RS.enterGuestEmailID(eMailid, driver);
    }

    @Then("^I Click on the Guest Checkout Button$")
    public void i_Click_on_the_Guest_Checkout_Button() throws Throwable {
        Login_RS.GuestLogin(driver);
    }
    @Then("^I provide the User Credentials as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void User_Credentials(String UserName, String Password) throws Throwable {
        Login_RS.Homelogin_enterUserName(UserName, driver);
        Login_RS.Homelogin_enterPassword(Password, driver);
    }
    @Then("^i click onLogin$")
    public void i_click_onLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Login_RS.Homelogin_clickLoginBtn(driver);
    }
}
