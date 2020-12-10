package com.niketest;

import com.base.TestBase;
import com.nike.pages.HelpPage;
import com.nike.pages.HomePage;
import com.nike.pages.NewReleasesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewReleasesPageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserBeingAleToClickOnToDropDownNewReleases() {
       HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        NewReleasesPage newReleasesPage = PageFactory.initElements(driver, NewReleasesPage.class);
    homePage.clickOnNewReleasesButton();
        newReleasesPage.clickonnewformenbtn();

    }
    @Test(enabled = false)
    public void validateUserBeingAleToMoveMoseHoverToShoes() {
        NewReleasesPage newReleasesPage = PageFactory.initElements(driver, NewReleasesPage.class);
        newReleasesPage.validateMouseHoverForNewReleases();
    }

    @Test(enabled = false)
    public void validateUserBeingAleToScrollNewReleases() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        NewReleasesPage newReleasesPage = PageFactory.initElements(driver, NewReleasesPage.class);
        homePage.clickOnNewReleasesButton();
        newReleasesPage.validateScrollPage();
        newReleasesPage.validateScrollToElement();
    }
    @Test(enabled = false)
    public void validateUserBeingAleToDropDownSortBy() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        NewReleasesPage newReleasesPage = PageFactory.initElements(driver, NewReleasesPage.class);
        homePage.clickOnNewReleasesButton();
      newReleasesPage.validateDropDown();
    }
}