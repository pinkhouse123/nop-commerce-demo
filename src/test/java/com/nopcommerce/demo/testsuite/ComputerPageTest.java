package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourComputerPage buildYourComputerPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourComputerPage=new BuildYourComputerPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        //Click on Computer tab
        homePage.clickOnComputerTab();
        //Verify "Computer" text
        computerPage.VerifyPageTitle();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // Click on Computer tab
        homePage.clickOnComputerTab();
        // Click on Desktops link
        computerPage.clickOnDesktopLink();
        // Verify "Desktops" text
        desktopsPage.VerifyDesktopTitle();
    }

    @Test(dataProvider = "computer",dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {
        // Click on Computer tab
        homePage.clickOnComputerTab();
        // Click on Desktops link
        computerPage.clickOnDesktopLink();
        // Click on product name "Build your own computer"
        buildYourComputerPage.clickOnBuildYourOwnComputer();
        // Select processor "processor"
        buildYourComputerPage.processorDropDown(processor);
        // Select RAM "ram"
        buildYourComputerPage.ramDropDown(ram);
        // Select HDD "hdd"
        buildYourComputerPage.selectHddButton(hdd);
        // Select OS "os"
        buildYourComputerPage.selectOsButton(os);
        // Select Software "software"
        buildYourComputerPage.selectSoftwareButton(software);
        // Click on "ADD TO CART" Button
        buildYourComputerPage.clickOnAddToCartButton();
        // Verify message "The product has been added to your shopping cart"
        buildYourComputerPage.verifyAddedToYourShoppingCartMessage();


    }
}