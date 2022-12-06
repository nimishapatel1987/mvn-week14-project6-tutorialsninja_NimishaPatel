package com.tutorialsninja.pages;

import com.google.common.base.Verify;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccount extends Utility {
   // Clickr on My Account Link.
    By myAccount = By.xpath("//span[contains(text(),'My Account')]");
    public void clickonMyAccount() {
        clickOnElement(myAccount);
    }
    //Verify the text “Register Account”
    By varifyRegister = By.xpath("//h1[contains(text(),'Register Account')]");
    public String getVerifyRegister() {
        return getTextFromElement(varifyRegister);
    }
    //Verify the text “Returning Customer”.
    By varifyReturning = By.xpath("//h2[contains(text(),'Returning Customer')]");
    public String getVerifyReturning() {
        return getTextFromElement(varifyReturning);
    }
    //Enter First Name
    By firstName = By.id("input-firstname");
    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }
    //Enter Last Name
    By lastName = By.id("input-lastname");
    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }
    //Enter Email
    By enterEmail = By.id("input-email");
    public void enterEmailAdd(String email) {
        sendTextToElement(enterEmail, email);
    }
    //Enter Telephone
    By enterPhone = By.id("input-telephone");
    public void enterPhone(String phone) {
        sendTextToElement(enterPhone, phone);
    }
    //Enter password
    By enterPass = By.id("input-password");
    public void enterPassword(String phone) {
        sendTextToElement(enterPass, phone);
    }
    //Enter confirm Password
    By confirmPass = By.id("input-confirm");
    public void enterConfirmPass(String phone) {
        sendTextToElement(confirmPass, phone);
    }
    //Select Subscribe Yes radio button
    By newsLetter = By.xpath("//input[@name='newsletter']");
    public void clickYesonNewsLetter() {
        clickOnElement(newsLetter);
    }
    //Click on Privacy Policy check box
    By privacyPolicy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    public void clickOnPrivacy() {
        clickOnElement(privacyPolicy);
    }
    //Click on Continue button
    By clickOnContinue = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    public void clickFinalContinue() {
        clickOnElement(clickOnContinue);
    }
    //Clickr on My Account Link.
    By varifymessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    public String getVerifyMessage() {
        return getTextFromElement(varifymessage);
    }
    //Click on Continue button
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
    //Call the method “selectMyAccountOptions” method and pass the parameter
    //“Logout”
    By myAccountTab = By.xpath("//span[contains(text(),'My Account')]");
    public void clickOnMyAccountTab() {
        clickOnElement(myAccountTab);
    }
    //Verify the text “Account Logout”
    By varifyLogout = By.xpath("//h1[contains(text(),'Account Logout')]");
    public String getVerifyLogout() {
        return getTextFromElement(varifyLogout);
    }
    //Click on Continue button
    By continueButtonTab = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnContinueTab() {
        clickOnElement(continueButton);
    }
    //Call the method “selectMyAccountOptions” method and pass the parameter
    //“Login”
    By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");
    public void clickOnLogin() {
        clickOnElement(loginButton);
    }
    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }
}
