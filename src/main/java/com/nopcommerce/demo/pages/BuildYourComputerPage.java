package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class BuildYourComputerPage extends Utility {
    public BuildYourComputerPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerButton;
    public void clickOnBuildYourOwnComputer(){
        Reporter.log("Build your own computer"+buildYourOwnComputerButton.toString()+"<br>");
        clickOnElement(buildYourOwnComputerButton);
    }

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    public void processorDropDown(String processor){
        selectByVisibleTextFromDropDown(processorDropDown,processor);
    }

    @FindBy(xpath = "(//select[@id='product_attribute_2'])[1]")
    WebElement ramM;
    public void ramDropDown(String ram){
        selectByVisibleTextFromDropDown(ramM,ram);
    }

    @FindBy(xpath = "(//input[@id='product_attribute_3_7'])[1]")
    WebElement hddButton;
    public void selectHddButton(String hdd){
        clickOnElement(hddButton);
    }

    @FindBy(xpath = "(//input[@id='product_attribute_4_9'])[1]")
    WebElement osButton;
    public void selectOsButton(String os){
        clickOnElement(osButton);
    }

    @FindBy(xpath = "(//input[@id='product_attribute_5_12'])[1]")
    WebElement softwareButton;
    public void selectSoftwareButton(String software){
        clickOnElement(softwareButton);
    }

    @FindBy(xpath = "(//button[normalize-space()='Add to cart'])[1]")
    WebElement addToCartButton;
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    @FindBy(xpath = "//div[@id='bar-notification']/div/p")
    WebElement message1;
    public void verifyAddedToYourShoppingCartMessage(){
        String actualText=getTextFromElement(message1);
        String expectedText="The product has been added to your shopping cart";
        Assert.assertEquals(actualText,expectedText,"Verify shopping cart text");
    }

}