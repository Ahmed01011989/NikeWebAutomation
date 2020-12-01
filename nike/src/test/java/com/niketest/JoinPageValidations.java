package com.niketest;

import com.base.TestBase;
import com.nike.pages.HomePage;
import com.nike.pages.JoinPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JoinPageValidations extends TestBase {
    @Test
    public void validateUserBeingAleToClickOnSearchBtn() {
        JoinPage joinPage = PageFactory.initElements(driver, JoinPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateJoinUsBtn();
        joinPage.validateJoinUsNikeMembershipDisplayed();
        joinPage.validateURL();
        joinPage.clickOnJoinUsBtn();

    }

    @Test
    public void validateUserBeingAleToClickOnJoinUsBtn() {
        JoinPage joinPage = PageFactory.initElements(driver, JoinPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateJoinUsBtn();
        joinPage.clickOnJoinUsBtn();

    }

    @Test
    public void fieldValidationOnJoinUsPage() {
        JoinPage joinPage = PageFactory.initElements(driver, JoinPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateJoinUsBtn();
        joinPage.clickOnJoinUsBtn();
        joinPage.validateField();


    }

    @Test(enabled = false)
    public void fieldValidationOnJoinUsPageSofAss() {
        JoinPage joinPage = PageFactory.initElements(driver, JoinPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateJoinUsBtn();
        joinPage.clickOnJoinUsBtn();
        joinPage.validateFieldUsingSoAssert();

    }

    @Test
    public void sendDatafieldJoinUsPage() {
        JoinPage joinPage = PageFactory.initElements(driver, JoinPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.validateJoinUsBtn();
        joinPage.clickOnJoinUsBtn();
        joinPage.joinUsField();


    }

}
