package com.RSComponents.page_obj;

import com.RSComponents.Common;
import com.cucumber.listener.ExtentCucumberFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingBasket_RS {


    public static void increaseProductCount(WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//td[@class='quantityTd']/input[@type='text']"));
            element.clear();
            element.sendKeys("5");
            element = driver.findElement((By.xpath("//td[@class='quantityTd']/div/a/span[contains(text(),'Update')] [1]")));
            element.click();
            ExtentCucumberFormatter.setTestRunnerOutput("increased Product Count");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to increase product count");
        }
    }

    public static void CheckOutButton(WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            //element = driver.findElement(By.xpath("//a[@id='shoppingBasketForm']//span[@class='toggleBtnState']"));
            element = driver.findElement(By.xpath("//span[@class='toggleBtnState']//a[contains(@id,'shoppingBasketForm')][1]"));
            element.click();
            ExtentCucumberFormatter.setTestRunnerOutput("Check out securely");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to check out");
            //throw e;
        }
    }

}
