package com.walmart.automation.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
//        tags = "@smoke",
//        tags = "@debug",
//        tags = "@links",
//        dryRun = true,

        features = "src/test/resources/features/homePageFunctionality.feature",
//        features = "src/test/resources/features/",

        glue = {"com.walmart.automation.steps",
                "com.walmart.automation.framework.hooks"},


//        strict = true,
        monochrome = true,

        plugin = {"pretty:target/cucumber-test-report/cucumber-pretty.txt",
                  "html:target/cucumber-html-report"}
        )
public class WalmartRunner {
}
