package com.qascriptcucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//Belowcommand is used to run script without Junit
@RunWith (Cucumber.class)

@CucumberOptions (

        features = {"src/test/resources/features/Login.feature"},
        plugin = {
                //below command is used to generate the report
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json"
        },
        tags = "@datadriven",
        //below command is generate customize link which is present on cloud
        publish = true
)

public class TestRunner {

}
