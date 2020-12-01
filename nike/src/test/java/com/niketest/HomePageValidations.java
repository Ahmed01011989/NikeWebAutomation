package com.niketest;

import com.base.TestBase;
import com.nike.data.DataProviders;
import com.nike.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {
    @Test(dataProviderClass = DataProviders.class, dataProvider = "searchData", enabled = false)
    public void validateUserBeingAbleToSearchForAnItem(String data) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar(data);
        homePage.clickOnSearchButton();

    }

    @Test(enabled = false)
    public void validateUserBeingAleToClickOnSearchBtn() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchButton();
    }


    @Test(enabled = false)
    public void validateUserCanClickOnRealeaseButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnRealeasButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAleToClickOnJoinUsBtn() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateJoinUsBtn();
    }

    @Test(enabled = false)
    public void validateUserBeingAleToToSeeForYouandYourCrew() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateURL();
        homePage.ForYouandYourCrewDisplayed();
    }
}
