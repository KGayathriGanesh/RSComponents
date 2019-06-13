package com.RSComponents.step_def;

import com.RSComponents.BaseClass;
import com.RSComponents.Constants;
import com.RSComponents.WebDriverFactory;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestSetup extends WebDriverFactory {

    private WebDriver driver;
    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
        ExtentCucumberFormatter.setTestRunnerOutput("Scenario : " + Constants.getScenarioCounter() + " - " + scenario.getName());
        Constants.setScenarioCounter(Constants.getScenarioCounter() + 1);
    }


    @Given("^I launch the \"([^\"]*)\" browser$")
    public void browserSetup(String browser) {
        if (System.getProperty("os.name").contains("Mac")) {
            if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/mac/chromedriver");
                driver = new ChromeDriver();
            }
        } else if (System.getProperty("os.name").contains("Windows")) {
            if (browser.equals("firefox")) {
                System.setProperty("webdriver.firefox.marionette", "src\\test\\resources\\driver\\windows\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\windows\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equals("IE")) {
                System.setProperty("webdriver.ie.driver", "src\\test\\resources\\driver\\windows\\MicrosoftWebDriver.exe");
                driver = new InternetExplorerDriver();
            }
        }
        driver.manage().window().maximize();
        ExtentCucumberFormatter.setTestRunnerOutput(browser.toUpperCase() + " browser is initiated successfully");
    }


    @And("^Initiate and set the Driver in BaseClass")
    public void initiateDriverClass() {
        BaseClass.get_instance().setDriver(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("Tear down script");
        ExtentCucumberFormatter.setTestRunnerOutput("-------------------------------------------------------------------------------------------------------------------------------------------");
    }
}