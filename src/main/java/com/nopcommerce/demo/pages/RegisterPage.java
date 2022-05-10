package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.Random;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    public void verifyRegisterText() {
        Reporter.log("Verify Register Text" + registerText.toString() + "<br>");
        String actualText = getTextFromElement(registerText);
        String expectedText = "Register";
        Assert.assertEquals(actualText, expectedText, "Verify Register Text");
    }

    @FindBy(id = "register-button")
    WebElement registerButton;

    public void clickOnRegisterButton() {
        Reporter.log("Click on Register button" + registerButton.toString() + "<br>");
        clickOnElement(registerButton);
    }

    @FindBy(id = "FirstName-error")
    WebElement firstNameError;

    public void verifyFirstNameIsRequired() {
        Reporter.log("Verify firstname error" + firstNameError.toString() + "<br>");
        String actualText = getTextFromElement(firstNameError);
        String expectedText = "First name is required.";
        Assert.assertEquals(actualText, expectedText, "Verify first name error");
    }

    @FindBy(id = "LastName-error")
    WebElement lastNameError;

    public void verifyLastNameIsRequired() {
        Reporter.log("Verify Lastname error" + lastNameError.toString() + "<br>");
        String actualText = getTextFromElement(lastNameError);
        String expectedText = "Last name is required.";
        Assert.assertEquals(actualText, expectedText, "Verify Last name error");
    }

    @FindBy(id = "Email-error")
    WebElement emailError;

    public void verifyEmailIsRequired() {
        Reporter.log("Verify email erroe" + emailError.toString() + "<br>");
        String actualText = getTextFromElement(emailError);
        String expectedText = "Email is required.";
        Assert.assertEquals(actualText, expectedText, "Email is required message");
    }

    @FindBy(id = "Password-error")
    WebElement password;

    public void verifyPasswordIsRequired() {
        Reporter.log("Password is required" + password.toString() + "<br>");
        String actualText = getTextFromElement(password);
        String expectedText = "Password is required.";
        Assert.assertEquals(actualText, expectedText, "password is required");
    }

    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmedPassword;

    public void verifyConfirmedPasswordIsRequired() {
        Reporter.log("Confirmed Password is required is error" + confirmedPassword.toString() + "<br>");
        String actualText = getTextFromElement(confirmedPassword);
        String expectedText = "Password is required.";
        Assert.assertEquals(actualText, expectedText, "Confirmed message is required error");
    }

    @FindBy(xpath = "//div[@id='gender']/span[2]/input")
    WebElement femaleRadioBtn;

    public void selectFemaleRadioButton() {
        Reporter.log("select Radio Button" + femaleRadioBtn.toString() + "<br>");
        clickOnElement(femaleRadioBtn);
    }

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    public void enterFirstName(String name) {
        Reporter.log("Enter first name" + firstName.toString() + "<br>");
        sendTextToElement(firstName, name);
    }

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName1;

    public void enterLastName(String lastname) {
        Reporter.log("Enter last name" + lastName1.toString() + "<br>");
        sendTextToElement(lastName1, lastname);
    }

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;

    public void selectDateOfBirth(String date) {
        Reporter.log("Select Date of Birth" + day.toString() + "<br>");
        selectByVisibleTextFromDropDown(day, date);
    }

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month1;

    public void selectMonthOfBirth(String month) {
        Reporter.log("Select month of birth" + month1.toString() + "<br>");
        selectByVisibleTextFromDropDown(month1, month);
    }

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year1;

    public void selectYearOfBirth(String year) {
        Reporter.log("select Year of birth " + year1.toString() + "<br>");
        selectByVisibleTextFromDropDown(year1, year);

    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    public void enterEmailId(){
        Reporter.log("Enter email id"+ email.toString()+ "<br>");
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(email,"username" + randomInt + "@gmail.com");
        System.out.println("username" + randomInt + "@gmail.com" );
    }

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password2;
    public void enterPassword(String password){
        Reporter.log("Enter password"+ password2.toString()+"<br>");
        sendTextToElement(password2,password);
    }

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmedPassword2;
    public void enterConfirmedPassword(String password){
        Reporter.log("Enter confirmed Password"+confirmedPassword2.toString()+"<br>");
        sendTextToElement(confirmedPassword2,password);
    }

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement text;
    public void verifyRegistrationCompletedText(){
        Reporter.log("Verify registration Text"+ text.toString()+ "<br>");
        String actualText=getTextFromElement(text);
        String expectedText="Your registration completed";
        Assert.assertEquals(actualText,expectedText,"Verify Registration text");
    }


}