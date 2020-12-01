package com.nike.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(id = "VisualSearchInput")
    private WebElement searchBar;

    @FindBy(xpath = "//button[@aria-label='Search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//span[@id='hf_title_signin_membership'][1]")
    private WebElement signInBtn;

    @FindBy(xpath = "//a[text()='New Releases'][1]")
    private WebElement realesbtn;

    @FindBy(xpath = "(//span[text()='Join Us'])[1]")
    private WebElement joinUsBtn;

    @FindBy(xpath = "//h2[text()='For You and Your Crew']")
    private WebElement ForYouandYourCrew;


    public void typeOnSearchBar(String data) {
        LOGGER.info("sending keys : " + data);
        searchBar.sendKeys(data);
        ExtentTestManager.log("Type On Search Bar");


    }

    public void validateURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.nike.com/";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated : " + actualURL);

    }

    public void ForYouandYourCrewDisplayed() {
        Assert.assertTrue(ForYouandYourCrew.isDisplayed());
        ExtentTestManager.log("YOUR ACCOUNT FOR EVERYTHING NIKE is being displayed");

        //boolean flag =joinUsNikeMembershipHeading.isDisplayed();
        //Assert.assertTrue(flag);
        //Assert.assertEquals(joinUsNikeMembershipHeading.isDisplayed(),true);

    }

    public void clickOnSearchButton() {
        searchBtn.click();
        ExtentTestManager.log("Clicked on Search Button");

    }

    public void clickOnSignInButton() {
        signInBtn.click();
        ExtentTestManager.log("Clicked on Sign In Button");
    }

    public void clickOnRealeasButton() {
        realesbtn.click();
        ExtentTestManager.log("Clicked on New Release Button");

    }

    public void validateJoinUsBtn() {
        joinUsBtn.click();
        ExtentTestManager.log("Clicked on Join Us Button");
    }
}
