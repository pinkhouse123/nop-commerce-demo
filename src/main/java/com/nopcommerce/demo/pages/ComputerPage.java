package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement title;

    public void VerifyPageTitle() {
        Reporter.log("Verify computer Title" + title.toString() + "<br>");
        String actualText = getTextFromElement(title);
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText, "Verify computer Title");
    }

    @FindBy(xpath = "(//a[normalize-space()='Desktops'])[3]")
    WebElement desktopLink;

    public void clickOnDesktopLink() {
        Reporter.log("Click on desktop link" + desktopLink.toString() + "<br>");
        clickOnElement(desktopLink);
    }
}