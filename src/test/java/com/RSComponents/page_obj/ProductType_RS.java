package com.RSComponents.page_obj;

import com.RSComponents.Common;
import com.cucumber.listener.ExtentCucumberFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductType_RS {


    public static void Aluminium_Capacitor(WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//h2[@title='Aluminium Capacitors']"));
            element.click();
            Thread.sleep(2000);
            ExtentCucumberFormatter.setTestRunnerOutput("Aluminium capacitor has selected successfully");

        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to select Aluminium capacitor");
        }
    }
    //final product
    public static void AddProduct(WebDriver driver) throws InterruptedException {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//span[@data-recsku='5194059']"));
            element.click(); //
            ExtentCucumberFormatter.setTestRunnerOutput("Product have added");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to add product");
            throw e;
        }
    }


}
