package com.sqa.opencartAutomation.steps;

import com.sqa.opencartAutomation.pageObjets.HomeOpencartPage;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeOpencartStep {

    @Autowired
    HomeOpencartPage homeOpencartPage;

    @Step
    public void openBrowser(){
        homeOpencartPage.open();
    }

    @Step
    public void selectCreateNewAccount(){
        homeOpencartPage.clickUserButton();
        homeOpencartPage.clickCreteNewAccountOption();
    }

    public void pagesRestriction(){
            homeOpencartPage.clickButtonAccessRestrictionConfiguration();
            homeOpencartPage.clickButtonAccessRestriction();
    }
}
