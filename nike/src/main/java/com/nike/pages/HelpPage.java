package com.nike.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HelpPage extends TestBase{

    private static Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(xpath = "//a[text()='GET HELP']")
    private WebElement getHelpdisplayed;

    @FindBy(xpath = "//span[text()='What can we help you with?']")
    private WebElement validateText;

    @FindBy(xpath = "//input[@id='searchInput']")
    private WebElement helpsearchbar;
    public void validateGetHelpDisplayed() {
        Assert.assertTrue(getHelpdisplayed.isDisplayed());
        ExtentTestManager.log("Get Help  is being displayed");
    }

    public void validateURL() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.nike.com/help";
        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated : " + actualURL);

    }

    public void validateFieldUsingSoAssert() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(validateText.isDisplayed());
        String actualText = validateText.getText();
        String expectedText = "What can we help you with?";
        softAssert.assertEquals(actualText, expectedText);
        ExtentTestManager.log("Text is displayed");
        softAssert.assertAll();
    }
    public void validateMouseHoverForHelpBtn() {
        WebElement help = driver.findElement(By.linkText("Help"));
        Actions actions = new Actions(driver);
        actions.moveToElement(help).build().perform();
        driver.findElement(By.linkText("Privacy Policy")).click();
        ExtentTestManager.log("Clicked on Privacy Policy Button");
    }

    public void validateHelpSearchBar() {
        helpsearchbar.sendKeys("Orders");
        ExtentTestManager.log("Get Help  is being displayed");
    }

}