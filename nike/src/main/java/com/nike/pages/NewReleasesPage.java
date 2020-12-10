package com.nike.pages;

import com.base.TestBase;
import com.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewReleasesPage extends TestBase {
    private static Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(xpath = "(//a[text()='New For Men'])[1]")
    private WebElement newformenbtn;


    public void clickonnewformenbtn() {
        newformenbtn.click();
        ExtentTestManager.log("Clicked on New For Men Button");
    }

    public void validateMouseHoverForNewReleases() {
        WebElement newreleases = driver.findElement(By.linkText("New Releases"));
        Actions actions = new Actions(driver);
        actions.moveToElement(newreleases).build().perform();
        driver.findElement(By.linkText("Shoes")).click();
        ExtentTestManager.log("Clicked on New For Men Button");
    }

    public void validateScrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        ExtentTestManager.log("Scroll Window");
    }

    public void validateScrollToElement() {

        WebElement element = driver.findElement(By.xpath("//a[text()='News']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);


    }

    public void validateDropDown() {

        WebElement element = driver.findElement(By.xpath("//span[text()='Sort By']"));
        element.click();
        List<WebElement> dropDown = driver.findElements(By.xpath("//div[contains(@class,'dropdown__options-wrapper')]//div[contains(@class,'dropdown__options-list')]//button[contains(@class,'dropdown__option  css-hrsjq4')]"));
        dropDown.get(0).click();
        sleepFor(3);
        ExtentTestManager.log("DropDown list Sort By is   " + dropDown.size());


    }
}