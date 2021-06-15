package com.sqa.opencartAutomation.steps;

import com.sqa.opencartAutomation.pageObjets.HomeOpencartPage;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeOpencartStep {

    //@Autowired
    HomeOpencartPage homeOpencartPage;

    @Step
    public void openBrowserStep(){
        homeOpencartPage.open();
    }

    @Step
    public void selectCreateNewAccountStep(){
        homeOpencartPage.clickUserButton();
        homeOpencartPage.clickCreteNewAccountOption();
    }

    @Step
    public void pagesRestrictionStep(){
            homeOpencartPage.clickButtonAccessRestrictionConfiguration();
            homeOpencartPage.clickButtonAccessRestriction();
    }
}
