package com.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},monochrome=true,
features= {"src/test/resources/skeleton/login.feature"})
public class cucumberRunner {

}
