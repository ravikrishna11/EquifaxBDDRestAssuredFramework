package com.TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Features\\Library.feature",

plugin = {"json:target/JsonReports/Report.json","html:target/htmlReports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
glue= {"com.stepDefinitions"},
dryRun = false,
//tags= {"@Book_PublisherId"},
monochrome = true)

public class TestRunner1 {

}
