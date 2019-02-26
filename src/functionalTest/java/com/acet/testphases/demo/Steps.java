package com.acet.testphases.demo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

  Integer total;

  @Given("^I am ready$")
  public void doSomeInitialization() {
  }

  @When("^I add (-?\\d+) and (-?\\d+)$")
  public void testAdd(int num1, int num2) {
    total = FunctionalTestRestClient.getSum(String.valueOf(num1), String.valueOf(num2));
  }

  @Then("^the result should be (-?\\d+)$")
  public void validateResult(int result) {
    assertThat(1, is(result));
  }
}
