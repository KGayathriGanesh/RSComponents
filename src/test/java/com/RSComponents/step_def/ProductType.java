package com.RSComponents.step_def;

import com.RSComponents.BaseClass;
import com.RSComponents.page_obj.ProductType_RS;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductType {

    WebDriver driver = BaseClass.get_instance().getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);


      @Then("^I Choose the Aluminium Capacitor$")
    public void i_Choose_the_Aluminium_Capacitor()  {
        ProductType_RS.Aluminium_Capacitor(driver);
    }



}
