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
    public void registerUser(DataUser dataUser){
        registerOpencartPage.setInputFirstNameRegister(dataUser.getFirstNameUser());
        registerOpencartPage.setInputLastNameRegister(dataUser.getLastNameUser());
        registerOpencartPage.setInputEmailRegister(dataUser.getEmailUser());
        registerOpencartPage.setInputTelephoneRegister(dataUser.getTelephoneUser());
        registerOpencartPage.setInputPasswordRegister(dataUser.getPasswordUser());
        registerOpencartPage.setInputPasswordConfirmRegister(dataUser.getPasswordConfirm());
        registerOpencartPage.clickCheckboxPrivacyPolicyRegister();
        registerOpencartPage.clickButtonContinueRegister();
    }

    public void validateFailedMessage(){
        registerOpencartPage.waitForCondition().until(ExpectedConditions.invisibilityOfElementLocated(registerOpencartPage.getMessageFailure()));
    }
}
