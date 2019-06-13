package com.RSComponents;

import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

// defining the path to execute feature file and extent cucumber Report

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"com.RSComponents.step_def"},
        plugin= {"com.cucumber.listener.ExtentCucumberFormatter"},
        tags = {"@Checkout,@Search,@Setup"}
)

public class RunTest {

    // test trips
    @BeforeClass
    public static void setup() {
        // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
        ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File(Constants.getReportPath()));

        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/extentReportConfig.xml"));

        //Also you can add system information using a hash map
        Map<String, String> systemInfo = new HashMap<>();
        systemInfo.put("Cucumber version", "v1.2.5");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.1");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);

    }
}


