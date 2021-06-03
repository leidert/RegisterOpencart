package com.sqa.opencartAutomation.steps;

import com.sqa.opencartAutomation.models.DataUser;
import com.sqa.opencartAutomation.pageObjets.RegisterOpencartPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;

public class RegisterOpencartStep {

    @Autowired
    RegisterOpencartPage registerOpencartPage;

    @Step
    public void registerUserStep(DataUser dataUser){
        registerOpencartPage.setInputFirstNameRegister(dataUser.getFirstNameUser());
        registerOpencartPage.setInputLastNameRegister(dataUser.getLastNameUser());
        registerOpencartPage.setInputEmailRegister(dataUser.getEmailUser());
        registerOpencartPage.setInputTelephoneRegister(dataUser.getTelephoneUser());
        registerOpencartPage.setInputPasswordRegister(dataUser.getPasswordUser());
        registerOpencartPage.setInputPasswordConfirmRegister(dataUser.getPasswordConfirm());
        registerOpencartPage.clickCheckboxPrivacyPolicyRegister();
        registerOpencartPage.clickButtonContinueRegister();
    }

    @Step
    public void validateFailedMessageStep(){
        registerOpencartPage.waitForCondition().until(ExpectedConditions.invisibilityOfElementLocated(registerOpencartPage.getMessageFailure()));
    }
}
