package com.RSComponents.page_obj;

import com.RSComponents.Common;
import com.cucumber.listener.ExtentCucumberFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage_RS {
    private WebElement element;

    public HomePage_RS(WebElement element){
        this.element = element;
    }

    public static WebElement lnk_Menu(String lnk, WebDriver driver) throws Exception {
        WebElement element = null;
        try {
             element = driver.findElement(By.xpath("//a[@title='"+ lnk +"']"));
             ExtentCucumberFormatter.setTestRunnerOutput( lnk + "Home Page is displayed");
            return element;
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput(lnk + "HomePage is not displayed");
            throw e;
        }
    }

    public static void all_product(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//a[@title='All Products']"));
            element.click();
            Thread.sleep(1000);
            ExtentCucumberFormatter.setTestRunnerOutput("All Products link is displayed");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("All Products is not displayed");
            throw e;
        }
    }

    public static void passiveComponent(WebDriver driver) throws Exception {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            Actions action = new Actions(driver);
            element = driver.findElement(By.xpath("//a[text()[contains(.,'Passive Components')]]"));
            action.moveToElement(element).click().build().perform();
            Thread.sleep(2000);
            ExtentCucumberFormatter.setTestRunnerOutput("Passive Components link have selected");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to select Passive Components link");
            throw e;
        }
    }

    public static void capacitor_Link(WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//h2[@title='Capacitors']"));
            element.click();
            Thread.sleep(2000);
            ExtentCucumberFormatter.setTestRunnerOutput("Capacitor link have selected");

        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to select Capacitor link");

        }
    }

    public static void login_Hompage(WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
            element.click();
            Thread.sleep(2000);
            ExtentCucumberFormatter.setTestRunnerOutput("Login from Homepage ");

        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Failed to login from Homepage");

        }
    }




}
