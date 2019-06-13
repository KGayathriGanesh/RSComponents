package com.RSComponents;

import com.cucumber.listener.ExtentCucumberFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Common {
    public static int timeout = 30;
    public static void handleUnexpectdScenario(WebDriver driver) {
        // Handle chat popup window
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            if (driver.findElement(
                    By.xpath("//button[contains(text(),'No, thanks')]"))
                    .isDisplayed()) {
                driver.findElement(
                        By.xpath("//button[contains(text(),'No, thanks')]")).click();
                Thread.sleep(2000);
                System.out.println("Clicked No thanks button in chat window");
                driver.switchTo().defaultContent();
            }
            driver.manage().timeouts()
                    .implicitlyWait(timeout, TimeUnit.SECONDS);
        } catch (Exception e) {
            driver.manage().timeouts()
                    .implicitlyWait(timeout, TimeUnit.SECONDS);
        }
    }


}