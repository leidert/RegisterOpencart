package com.sqa.opencartAutomation.pageObjets;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidateAccountPage extends PageObject {

    By successfullyRegister = By.xpath("//div[@id = 'content']/p[1]");

    public String successfullyMessageRegister(){
        return getDriver().findElement(successfullyRegister).getText();
    }
}
