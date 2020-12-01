package com.nike.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage {

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='button']")
    private WebElement clickSignInBtn;

    @FindBy(xpath = "//div[text()='YOUR ACCOUNT FOR EVERYTHING NIKE']")
    private WebElement YOURACCOUNTFOREVERYTHINGNIKE;


    public void validateURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.nike.com/";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated : " + actualURL);

    }

    public void YOURACCOUNTFOREVERYTHINGNIKEDisplayed() {
        Assert.assertTrue(YOURACCOUNTFOREVERYTHINGNIKE.isDisplayed());
        ExtentTestManager.log("YOUR ACCOUNT FOR EVERYTHING NIKE is being displayed");

        //boolean flag =joinUsNikeMembershipHeading.isDisplayed();
        //Assert.assertTrue(flag);
        //Assert.assertEquals(joinUsNikeMembershipHeading.isDisplayed(),true);

    }

    public void validateFieldUsingSoAssert() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(emailField.isDisplayed());
        String actualemail = emailField.getAttribute("placeholder");
        String expectedemail = "Email address";
        softAssert.assertEquals(actualemail, expectedemail);
        ExtentTestManager.log("Email Address name is displayed");

        softAssert.assertTrue(passwordField.isDisplayed());
        String actualpassword = passwordField.getAttribute("placeholder");
        String expectedpassword = "Password";
        softAssert.assertEquals(actualemail, expectedemail);
        ExtentTestManager.log("Password name is displayed");


        softAssert.assertAll();

    }

    public void typeOnEmailField(String username) {
        emailField.sendKeys(username);
        ExtentTestManager.log("Type On Email Field");
    }

    public void typeOnPasswordField(String password) {
        passwordField.sendKeys(password);
        ExtentTestManager.log("Type On Password Field ");
    }

    public void clickOnSignInBtn() {
        clickSignInBtn.click();
        ExtentTestManager.log("Clicked on Sign In Button");
    }
}
