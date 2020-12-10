package com.niketest;

import com.base.TestBase;
import com.nike.data.DataProviders;
import com.nike.pages.HomePage;
import com.nike.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageValidations extends TestBase {
    @Test(enabled = false )
    public void validateUserBeingAleToClickOnJoinUsBtn() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        loginPage.YOURACCOUNTFOREVERYTHINGNIKEDisplayed();
        loginPage.validateURL();

    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials",enabled = false)
    public void validateUserBeingAbleToLogin(String username, String password) {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        homePage.clickOnSignInButton();
        loginPage.typeOnEmailField(username);
        loginPage.typeOnPasswordField(password);
        loginPage.clickOnSignInBtn();
    }

    @Test(enabled = false)
    public void fieldValidationOnLogInPageSofAss() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        loginPage.validateFieldUsingSoAssert();

    }
}
