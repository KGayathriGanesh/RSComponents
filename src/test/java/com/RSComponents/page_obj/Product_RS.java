package com.RSComponents.page_obj;

import com.RSComponents.Common;
import com.cucumber.listener.ExtentCucumberFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Product_RS {

       //final product
    public static void AddProduct(WebDriver driver) throws InterruptedException {
        WebElement element = null;
        try {
           Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//span[@data-recsku='5194059']"));
            element.click();
            Thread.sleep(2000);
            ExtentCucumberFormatter.setTestRunnerOutput("All Products link is displayed");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("All Products is not displayed");
            throw e;
        }
    }

    //Navigate to Basket
    public static void ClickBasket(WebDriver driver) {
        WebElement element = null;
        try {
//            switch to frames

            element = driver.findElement(By.xpath("//div[@class='shBasket js-basket']/a[contains(@title,'basket')]"));
            element.click();
            Thread.sleep(2000);
            ExtentCucumberFormatter.setTestRunnerOutput("All Products link is displayed");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("All Products is not displayed");

        }
    }

    //Filter 1st Level
    public static void Select_Brand(String FilterType, WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//div[@class='row']//a[contains(text(),'" + FilterType + "')]"));
            element.click();
            Thread.sleep(2000);
            ExtentCucumberFormatter.setTestRunnerOutput("Brand has selected successfully");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to select Brand");
        }
    }

    //Filter 2nd  Level
    public static void Select_Subproduct(String Kemet, WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//span[contains(text(),'" + Kemet + "')]"));

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
            /* element.click(); */
            Thread.sleep(2000);
            ExtentCucumberFormatter.setTestRunnerOutput("Subproduct has selected successfully");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to select Subproduct");
        }
    }

    public static void Select_ApplyFilterButton(WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//div[@class='popover-content']/div/rs-apply-button/button[text()[contains(.,'Apply filters')]]"));
            element.click();
            ExtentCucumberFormatter.setTestRunnerOutput("Filter applied successfully");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to apply filter button");
        }

    }

}

