package com.RSComponents.page_obj;

import com.RSComponents.Common;
import com.cucumber.listener.ExtentCucumberFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_RS {


    public static void enterGuestEmailID(String eMailid, WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//input[@id='guestCheckoutForm:GuestWidgetAction_emailAddress_decorate:GuestWidgetAction_emailAddress']"));
            element.clear();
            element.sendKeys(eMailid);
            ExtentCucumberFormatter.setTestRunnerOutput("Guest Email ID set");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Guest Email ID Not set");
            throw e;
        }
    }

    public static void GuestLogin(WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//input[contains(@value,'Guest checkout')]"));
            element.click();
            ExtentCucumberFormatter.setTestRunnerOutput("Guest Checkout completed");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Guest Checkout Failed");
            throw e;
        }
    }

    public static void enterUserName(String UserName, WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
            element.clear();
            element.sendKeys(UserName);
            ExtentCucumberFormatter.setTestRunnerOutput("User Email ID set");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("User Email ID Not set");

        }
    }

    public static void enterPassword(String Password, WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
            element.clear();
            element.sendKeys(Password);
            ExtentCucumberFormatter.setTestRunnerOutput("User password set");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("User password Not set");
            throw e;
        }
    }

    public static void clickLoginBtn(WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//div[@id='loginEnabled']//input[contains(@id,'loginForm')]"));
            element.click();
            ExtentCucumberFormatter.setTestRunnerOutput("User Checkout completed");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("User Checkout Failed");
            throw e;
        }
    }
    //Homepge Login


    public static void Homelogin_enterUserName(String UserName, WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
            element.clear();
            element.sendKeys(UserName);
            ExtentCucumberFormatter.setTestRunnerOutput("User Email ID set");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("User Email ID Not set");

        }
    }


    public static void Homelogin_enterPassword(String Password, WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//input[@name='j_password']"));
            element.clear();
            element.sendKeys(Password);
            ExtentCucumberFormatter.setTestRunnerOutput("User password set");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("User password Not set");
            throw e;
        }
    }
    public static void Homelogin_clickLoginBtn(WebDriver driver) {
        WebElement element = null;
        try {
            Common.handleUnexpectdScenario(driver);
            element = driver.findElement(By.xpath("//input[@name='loginBtn']"));
            element.click();
            Thread.sleep(2000);
            ExtentCucumberFormatter.setTestRunnerOutput("Login Completed");
        } catch (Exception e) {
            ExtentCucumberFormatter.setTestRunnerOutput("Login Failed");

        }
    }

}
