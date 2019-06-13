package com.RSComponents.step_def;

import com.RSComponents.BaseClass;
import com.RSComponents.page_obj.ShoppingBasket_RS;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingBasket {

    WebDriver driver = BaseClass.get_instance().getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);


    @Then("^I update the Product quantity$")
    public void i_update_the_Product_quantity()  {
        ShoppingBasket_RS.increaseProductCount(driver);
    }
    @Then("^I Click on Checkout Securely button Present on the bottom page$")
    public void i_Click_on_Checkout_Securely_button_Present_on_the_bottom_page() throws Throwable {
        ShoppingBasket_RS.CheckOutButton(driver);
    }

}
