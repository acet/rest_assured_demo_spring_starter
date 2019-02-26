package com.acet.testphases.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"classpath:features/myFeature.feature"},
    glue = {"com.acet.testphases.demo"})
public class TestRunner {

}
