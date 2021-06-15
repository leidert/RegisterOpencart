package com.sqa.opencartAutomation.steps;

import com.sqa.opencartAutomation.pageObjets.ValidateAccountPage;
import cucumber.runtime.junit.Assertions;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidateAccountStep {

    //@Autowired
    ValidateAccountPage validateAccountPage;

    @Step
    public void validateMessageSuccessfullyRegisterStep(String message){
        Assert.assertEquals(validateAccountPage.successfullyMessageRegister(),message);
    }
}
