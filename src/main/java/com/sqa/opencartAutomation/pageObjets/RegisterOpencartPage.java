package com.sqa.opencartAutomation.pageObjets;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterOpencartPage extends PageObject {

    By inputFirstNameRegister = By.id("input-firstname");
    By inputLastNameRegister = By.id("input-lastname");
    By inputEmailRegister = By.id("input-email");
    By inputTelephoneRegister = By.id("input-telephone");
    By inputPasswordRegister = By.id("input-password");
    By inputPasswordConfirmRegister = By.id("input-confirm");
    By checkboxPrivacyPolicyRegister = By.xpath("//input[@type = 'checkbox']");
    By buttonContinueRegister = By.xpath("//input[@type = 'submit']");
    By messageFailure = By.xpath("//div[contains(text(), ' Warning: E-Mail Address is already registered!')]");

    public void setInputFirstNameRegister(String data) {
        getDriver().findElement(inputFirstNameRegister).sendKeys(data);
    }

    public void setInputLastNameRegister(String data) {
        getDriver().findElement(inputLastNameRegister).sendKeys(data);
    }

    public void setInputEmailRegister(String data) {
        getDriver().findElement(inputEmailRegister).sendKeys(data);
    }

    public void setInputTelephoneRegister(String data) {
        getDriver().findElement(inputTelephoneRegister).sendKeys(data);
    }

    public void setInputPasswordRegister(String data) {
        getDriver().findElement(inputPasswordRegister).sendKeys(data);
    }

    public void setInputPasswordConfirmRegister(String data) {
        getDriver().findElement(inputPasswordConfirmRegister).sendKeys(data);
    }

    public void clickCheckboxPrivacyPolicyRegister(){
        getDriver().findElement(checkboxPrivacyPolicyRegister).click();
    }

    public void clickButtonContinueRegister(){
        getDriver().findElement(buttonContinueRegister).click();
    }

    public By getMessageFailure(){
        return messageFailure;
    }
}
