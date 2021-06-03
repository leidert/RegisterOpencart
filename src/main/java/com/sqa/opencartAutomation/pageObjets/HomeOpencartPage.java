package com.sqa.opencartAutomation.pageObjets;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://opencart.abstracta.us/index.php")
public class HomeOpencartPage extends PageObject {

    By userButton = By.xpath("//a[@class = 'dropdown-toggle']/span[1]");
    By creteNewAccountOption = By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=account/register']");
    By buttonAccessRestrictionConfiguration = By.xpath("//button[@id='details-button']");
    By buttonAccessRestriction = By.xpath("//a[@id='proceed-link']");

    //*[@id="details-button"]

    public void clickUserButton() {
        getDriver().findElement(userButton).click();
    }

    public void clickCreteNewAccountOption() {
        getDriver().findElement(creteNewAccountOption).click();
    }

    public void clickButtonAccessRestrictionConfiguration() {
        getDriver().findElement(buttonAccessRestrictionConfiguration).click();
    }

    public void clickButtonAccessRestriction() {
        getDriver().findElement(buttonAccessRestriction).click();
    }
}
