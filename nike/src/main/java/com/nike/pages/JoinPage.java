package com.nike.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class JoinPage {
    @FindBy(xpath = "(//div[text()='Join Us: Nike Membership'])[3]")
    private WebElement joinUsNikeMembershipHeading;

    @FindBy(xpath = "(//a[text()='Join Us'])[3]")
    private WebElement clickOnJoinUs;

    @FindBy(xpath = "//input[@name='emailAddress']")
    private WebElement emailaddress;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstname;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastname;

    @FindBy(xpath = "//input[@name='dateOfBirth']")
    private WebElement dateofbirth;


    public void validateJoinUsNikeMembershipDisplayed() {
        Assert.assertTrue(joinUsNikeMembershipHeading.isDisplayed());
        ExtentTestManager.log("Create Account is being displayed");

        //boolean flag =joinUsNikeMembershipHeading.isDisplayed();
        //Assert.assertTrue(flag);
        //Assert.assertEquals(joinUsNikeMembershipHeading.isDisplayed(),true);

    }

    public void validateURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.nike.com/membership";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated : " + actualURL);

    }

    public void clickOnJoinUsBtn() {
        clickOnJoinUs.click();
        ExtentTestManager.log("Clicked on Join Us Button");
    }

    public void validateField() {
        Assert.assertTrue(emailaddress.isDisplayed());
        ExtentTestManager.log("email is displayed");

        Assert.assertTrue(password.isDisplayed());
        ExtentTestManager.log("Password is displayed");

        Assert.assertTrue(firstname.isDisplayed());
        ExtentTestManager.log("first name is displayed");

        Assert.assertTrue(lastname.isDisplayed());
        ExtentTestManager.log("last name is displayed");


        Assert.assertTrue(dateofbirth.isDisplayed());
        ExtentTestManager.log("Data Of Birth is displayed");

    }

    public void validateFieldUsingSoAssert() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(emailaddress.isDisplayed());
        String actualemail = emailaddress.getAttribute("placeholder");
        String expectedemail = "Email address";
        softAssert.assertEquals(actualemail, expectedemail);
        ExtentTestManager.log("Email Address name is displayed");

        softAssert.assertTrue(password.isDisplayed());
        String actualpassword = password.getAttribute("placeholder");
        String expectedpassword = "Password";
        softAssert.assertEquals(actualemail, expectedemail);
        ExtentTestManager.log("Password name is displayed");

        softAssert.assertTrue(firstname.isDisplayed());
        String actualfirstname = emailaddress.getAttribute("placeholder");
        String expectedfirstname = "First Name";
        softAssert.assertEquals(actualemail, expectedemail);
        ExtentTestManager.log("first name is displayed");


        String actuallastname = lastname.getAttribute("placeholder");
        String expectedlastname = "Last Name";
        softAssert.assertEquals(actuallastname, expectedlastname);
        ExtentTestManager.log("last name is displayed");

        softAssert.assertTrue(dateofbirth.isDisplayed());
        ExtentTestManager.log("Date Of Birth is displayed");

        softAssert.assertAll();

    }

    public void joinUsField() {
        emailaddress.sendKeys("test1@gmail.com");
        password.sendKeys("test1234");
        firstname.sendKeys("ahmed");
        lastname.sendKeys("jamal");
        dateofbirth.sendKeys("01.01.1989");
        ExtentTestManager.log("Clicked on Join Us Button");
    }

}
