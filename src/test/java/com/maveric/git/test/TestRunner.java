package com.maveric.git.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "com.maveric.git.stepdefs",
		// plugin = {"pretty", "html:Reports/HtmlReports/GitTest-reports.html"}
		// plugin = { "pretty", "json:Reports/JSONReports/GitTest-reports.json" }
		// plugin = { "pretty", "junit:Reports/JunitReports/Cucumber-reports.xml" }
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestRunner {

}
