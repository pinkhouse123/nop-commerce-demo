package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Click on login link
        homePage.clickOnLoginLink();
        // verify that "Welcome, Please Sign In!" message display
        loginPage.verifyWelcomeText();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        //Click on login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.enterEmailId("umipatel@gmail.com");
        //Enter Password
        loginPage.enterPassword("umi123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //Verify that the Error message
        loginPage.verifyErrorMessage();
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        // Click on login link
        homePage.clickOnLoginLink();
        // Enter EmailId
        loginPage.enterEmailId("umi123@gmail.com");
        // Enter Password
        loginPage.enterPassword("umi123");
        // Click on Login Button
        loginPage.clickOnLoginButton();
        // Verify that LogOut link is display
        homePage.verifyLogOutText();
    }

    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
        //Click on login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.enterEmailId("umi123@gmail.com");
        //Enter Password
        loginPage.enterPassword("umi123");
        //Click on Login Button
        loginPage.clickOnLoginButton();
        //Click on LogOut Link
        homePage.clickOnLogOutButton();
        //Verify that LogIn Link Display
        homePage.verifyLogInLink();


    }


}