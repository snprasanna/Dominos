package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources",
glue = {"stepdefinition"},
dryRun = false,
monochrome = false,

plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")



public class Dominos_testrunner {

}
