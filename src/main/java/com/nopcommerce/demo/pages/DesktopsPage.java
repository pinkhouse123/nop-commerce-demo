package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DesktopsPage extends Utility {
    public DesktopsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//h1[normalize-space()='Desktops'])[1]")
    WebElement title;
    public void VerifyDesktopTitle(){
        String actualText=getTextFromElement(title);
        String expectedText="Desktops";
        Assert.assertEquals(actualText,expectedText,"Verify desktop title");
    }

}