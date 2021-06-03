package com.sqa.opencartAutomation.stepdefinitions;

import com.sqa.opencartAutomation.models.DataUser;
import com.sqa.opencartAutomation.steps.HomeOpencartStep;
import com.sqa.opencartAutomation.steps.RegisterOpencartStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterOpencartStepDefinition {

    @Steps
    HomeOpencartStep homeOpencartStep;

    @Steps
    RegisterOpencartStep registerOpencartStep;

    @Given("^I want to register on the opencart page$")
    public void iWantToRegisterOnTheOpencartPage() throws InterruptedException {
        homeOpencartStep.openBrowser();
        homeOpencartStep.selectCreateNewAccount();
        homeOpencartStep.pagesRestriction();
        Thread.sleep(3000);
    }

    @When("^I enter the registration data$")
    public void iEnterTheRegistrationData(List<DataUser> dataList) throws InterruptedException {
        registerOpencartStep.registerUser(dataList.get(0));
        Thread.sleep(3000);
    }

    @Then("^He verifies the (.*) on the screen$")
    public void heVerifiesTheMessageOnTheScreen(String message) {
        registerOpencartStep.validateFailedMessage();
    }
}
