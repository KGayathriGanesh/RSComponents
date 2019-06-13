package com.RSComponents;

import com.cucumber.listener.ExtentCucumberFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

    private static WebDriverFactory webDriverFactory;
    private WebDriver driver;

    protected synchronized WebDriver SharedDriver() {
        String browser = "chrome";
        if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/mac/chromedriver");
            driver = new ChromeDriver();
        } else if (System.getProperty("os.name").contains("Windows")) {
            if (!browser.equals("chrome")) {
                if (browser.equals("IE")) {
                    System.setProperty("webdriver.ie.driver", "src\\test\\resources\\driver\\windows\\MicrosoftWebDriver.exe");
                    driver = new InternetExplorerDriver();
                }
            } else {
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\windows\\chromedriver.exe");
                driver = new ChromeDriver();
            }
        }
        driver.manage().window().maximize();
        ExtentCucumberFormatter.setTestRunnerOutput(browser.toUpperCase() + " browser is initiated successfully");

        setDriver(driver);
        return driver;
    }

    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
