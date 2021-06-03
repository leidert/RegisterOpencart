package com.sqa.opencartAutomation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature",
        glue = {"com.sqa.opencartAutomation.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RegisterOpencartRunner {
}
