package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooks extends Utility {
    //Click on “Show All Laptops & Notebooks”
    By laptopLink = By.linkText("Laptops & Notebooks");
    public void clickOnLaptoptopLink() {
        clickOnElement(laptopLink);
    }
    //Select Sort By "Price (High > Low)"
    public String shortPriceLowToHigh() {
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (Low > High)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
        // Assert.assertEquals("Product not sorted by price High to Low",
        // originalProductsPrice, afterSortByPrice);

        return null;
    }
    public void changeCurrency() {
        // clickOnElement(By.xpath("//span[contains(text(),'Currency')]"));
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }
   //Click on “Show All Laptops & Notebooks”
   By allLaptopAndNotebooksLink = By.linkText("Show All Laptops & Notebooks");
    public void clickOnAllLaptopAndNotebooksLink() {
        clickOnElement(allLaptopAndNotebooksLink);
    }
    //Select Sort By "Price (High > Low)"
    By sortByPriceHighToLow = By.id("input-sort");
    public void sortByPriceHighToLowfromDropdown() {
        sendTextToElement(sortByPriceHighToLow, "Price (High > Low)");
    }
    //Select Product “MacBook”
    By macbookLink = By.linkText("MacBook");
    public void clickOnMacbookLink() {
        clickOnElement(macbookLink);
    }
    //Verify the text “MacBook”
    By varifyMacbook = By.linkText("MacBook");
    public String getVerifyMacbook() {
        return getTextFromElement(varifyMacbook);
    }
    //Click on ‘Add To Cart’ button
    By addToCart = By.xpath("//button[@id='button-cart']");
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
    //Verify the message “Success: You have added MacBook to your shopping cart!”
    By varifySusccess = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public String getVerifySuccess() {
        return getTextFromElement(varifySusccess);
    }
    //Click on link “shopping cart” display into success message
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    public void clickOnShoppingCart() {
        clickOnElement(addToCart);
    }
    //Verify the text "Shopping Cart"
    By varifyCart = By.xpath("//a[contains(text(),'shopping cart')]");
    public String getVerifyCart() {
        return getTextFromElement(varifyCart);
    }
    //Verify the Product name "MacBook"
    By varifyProductMacbook = By.xpath("//div[@id='content']//h1");
    public String getVerifyProductMacbook() {
        return getTextFromElement(varifyProductMacbook);
    }
    //Verify the message “Success: You have modified your shopping cart!”
    By updateCart = By.xpath("//button[@id='button-cart']");
    public void clickOnUpdateCart() {
        clickOnElement(updateCart);
    }
    //Verify the message “Success: You have modified your shopping cart!”
    By varifyCartText = By.xpath("//body/div[@id='product-product']/div[1]");
    public String getVerifyCarttext() {
        return getTextFromElement(varifyCartText);
    }
    //Verify the Total £737.45
    By varifyTotal = By.xpath("//header/div[1]/div[1]/div[3]/div[1]/button[1]");
    public String getVerifyTotal() {
        return getTextFromElement(varifyTotal);
    }
    //Click on Cart
    By clickonCart = By.xpath("//header/div[1]/div[1]/div[3]/div[1]/button[1]");
    public void clickOnCheckoutCart() {
        clickOnElement(clickonCart);
    }
    //Click on “Checkout” button
    By clickonCheckout = By.xpath("//body[1]/header[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[1]/p[1]/a[2]/strong[1]");
    public void clickOnFinalCheckout() {
        clickOnElement(clickonCheckout);
    }
    //Verify the text “Checkout”
    By varifyCheckout = By.xpath("//a[contains(text(),'Checkout')]");
    public String getVerifyCheckout() {
        return getTextFromElement(varifyCheckout);
    }
    //Verify the Text “New Customer”
    By varifyNewCustomer = By.xpath("//div[@class='col-sm-6']//h2");
    public String getVerifyNewCustomer() {
        return getTextFromElement(varifyNewCustomer);
    }
    //Click on “Guest Checkout” radio button
    By guestCheckout = By.xpath("//label[text()[normalize-space()='Guest Checkout']]");
    public void clickOnGuestCheckout() {
        clickOnElement(guestCheckout);
    }
    //Click on “Continue” tab
    By continueTab = By.xpath("//input[@id='button-account']");
    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }
    //Fill the mandatory fields
    //FirstName
    By nameField = By.name("firstname");
    public void enterName(String name) {
        sendTextToElement(nameField, name);
    }
    //LastName
    By lastnameField = By.name("lastname");
    public void enterLastName(String lastname) {
        sendTextToElement(lastnameField, lastname);
    }
    //Email
    By emaileField = By.id("input-payment-email");
    public void enterEmail(String email) {
        sendTextToElement(emaileField, email);
    }
    //telephone
    By telePhone = By.name("telephone");
    public void enterTelephone(String phone) {
        sendTextToElement(telePhone, phone);
    }
    //Address
    By addressLine = By.name("address_1");
    public void enterAddress(String street) {
        sendTextToElement(addressLine, street);
    }
    //CityName
    By cityName = By.name("city");
    public void enterCity(String city) {
        sendTextToElement(cityName, city);
    }
    //postcode
    By postCode = By.name("postcode");
    public void enterPostcode(String code) {
        sendTextToElement(postCode, code);
    }
    //country
    By countryName = By.id("input-payment-country");
    public void enterCountry(String country) {
        sendTextToElement(countryName, country);
    }
    //Zone
    By zoneName = By.xpath("//select[@id='input-payment-zone']");
    public void enterState(String state) {
        sendTextToElement(zoneName, state);
    }
    //Click on “Continue” Button
    By continueCheckout = By.xpath("(//input[@value='Continue'])[2]");
    public void clickOnCheckout() {
        clickOnElement(continueCheckout);
    }
    //Add Comments About your order into text area
    By passtext = By.xpath("//textarea[@name='comment']");
    public void enterText(String msg) {
        sendTextToElement(passtext, msg);
    }
    //Check the Terms & Conditions check box
    By termsCondition = By.xpath("//input[@type='checkbox']");
    public void clickOnTerms() {
        clickOnElement(termsCondition);
    }
    //Click on “Continue” button
    By lastContinue = By.xpath("//input[@id='button-payment-method']");
    public void clickContinue() {
        clickOnElement(lastContinue);
    }
    //Verify the message “Warning: Payment method required!”
    By warningMsg = By.xpath("//div[contains(@class,'alert alert-danger')]");
    public String getVerifyWarningMsg() {
        return getTextFromElement(warningMsg);
    }

}
