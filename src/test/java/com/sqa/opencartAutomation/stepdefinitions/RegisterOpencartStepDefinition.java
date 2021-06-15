package com.sqa.opencartAutomation.stepdefinitions;

import com.sqa.opencartAutomation.models.DataUser;
import com.sqa.opencartAutomation.steps.HomeOpencartStep;
import com.sqa.opencartAutomation.steps.RegisterOpencartStep;
import com.sqa.opencartAutomation.steps.ValidateAccountStep;
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

    @Steps
    ValidateAccountStep validateAccountStep;

    @Given("^that want to register on the opencart page$")
    public void thatWantToRegisterOnTheOpencartPage() {
        homeOpencartStep.openBrowserStep();
        homeOpencartStep.selectCreateNewAccountStep();
        homeOpencartStep.pagesRestrictionStep();
    }

    @When("^enter the registration data$")
    public void enterTheRegistrationData(List<DataUser> dataList) {
        registerOpencartStep.registerUserStep(dataList.get(0));
    }

    @Then("^He verifies the (.*) on the screen$")
    public void heVerifiesTheMessageOnTheScreen(String message) {
        registerOpencartStep.validateFailedMessageStep();
        validateAccountStep.validateMessageSuccessfullyRegisterStep(message);
    }
}
