package com.RSComponents.step_def;

import com.RSComponents.BaseClass;
import com.RSComponents.page_obj.Product_RS;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product {
    WebDriver driver = BaseClass.get_instance().getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Then("^I Choose Any one of the Aluminiumn Capacitors$")
    public void i_Choose_Any_one_of_the_Aluminiumn_Capacitors() throws Throwable  {
        Product_RS.AddProduct(driver);
    }

    @Then("^I navigate to Shopping Cart$")
    public void i_navigate_to_Shopping_Cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         Product_RS.ClickBasket(driver);
    }

    //Search
    @Then("^I click on \"([^\"]*)\" to filter$")
    public void SelectBrand(String FilterType)  {
        // Write code here that turns the phrase above into concrete actions
        Product_RS.Select_Brand(FilterType, driver);

    }

    @Then("^I select \"([^\"]*)\" Brand$")
    public void SelectKemet(String Kemet)   {
        // Write code here that turns the phrase above into concrete actions
        Product_RS.Select_Subproduct(Kemet, driver);
    }

    @Then("^I select Apply filter button$")
    public void i_select_Apply_filter_button()  {
        // Write code here that turns the phrase above into concrete actions
        Product_RS.Select_ApplyFilterButton(driver);
    }

}
