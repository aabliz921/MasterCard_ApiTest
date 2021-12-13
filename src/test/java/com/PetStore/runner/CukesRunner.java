package com.PetStore.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumber.json",
                "html:target/cucumber-reports"},
        glue = "com/PetStore/stepDefs",
        features = "src/test/resources/feature",
        dryRun = false,
        tags = "@getPet"

)
public class CukesRunner {
}
