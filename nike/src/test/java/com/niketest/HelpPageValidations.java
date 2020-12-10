package com.niketest;

import com.base.TestBase;
import com.nike.pages.HelpPage;
import com.nike.pages.HomePage;
import com.nike.pages.NewReleasesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HelpPageValidations extends TestBase {
    @Test(enabled = false)
    public void validateUserBeingAleToClickOnToHelpBtn() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
        homePage.clickOnHelpBtn();
        helpPage.validateGetHelpDisplayed();
        helpPage.validateURL();
        helpPage.validateFieldUsingSoAssert();
    }
    @Test
    public void validateUserBeingAleToMoveMoseHoverToPrivacyPolicy() {
        HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
        helpPage.validateMouseHoverForHelpBtn();
    }
    @Test
    public void validateUserBeingAleToTypeOnSearchBar() {
        HelpPage helpPage = PageFactory.initElements(driver, HelpPage.class);
        helpPage.validateHelpSearchBar();
    }
}
