package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desktops extends Utility {
    By currencyLink = By.xpath("//span[contains(text(),'Currency')]");

    public void clickOnCurrencyLink() {
        clickOnElement(currencyLink);
    }

    //Click on “Show All Desktops”
    By clickOnShowAllDeskTop = By.xpath("//a[contains(text(),'Show All Desktops')]");

    public void clickOnAllDesktop() {
        clickOnElement(clickOnShowAllDeskTop);
    }

    //Select Sort By position "Name: Z to A"
    By sortByNameZtoA = By.id("input-sort");

    public void SortByNameZtoAfromDropdown() {
        sendTextToElement(sortByNameZtoA, "Name (Z - A)");
    }

    //Select product “HP LP3065”
    By clickOnHpLp3065 = By.xpath("//a[contains(text(),'HP LP3065')]");

    public void clickOnHPlp3065() {
        clickOnElement(clickOnHpLp3065);
    }

    //Verify the Text "HP LP3065"
    By verifyText = By.xpath("//h1[contains(text(),'HP LP3065')]");

    public String getVerifyText() {
        return getTextFromElement(verifyText);
    }
    //Select Delivery Date "2022-11-30"
    // By deliveryDate = By.xpath("//div[@class = 'input-group date']//button");
    //public void selectDeliveryDate() {
    //clickOnElement(deliveryDate);

    //Enter Qty "1” using Select class.
    By selectQuantity = By.name("quantity");

    public void changeQuantity(String quantity) {
        sendTextToElement(selectQuantity, quantity);
    }

    //Click on “Add to Cart” button
    By addToCart = By.xpath("//button[@id='button-cart']");

    public void clickOnAdToCart() {
        clickOnElement(addToCart);
    }

    //Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
    By verifyTextHplp3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");

    public String getVerifyTextHp() {
        return getTextFromElement(verifyTextHplp3065);
    }

    //SelectDate
    public void selectDeliveryDate() {
        //select delivery date
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        //desktops.selectDeliveryDate();
        //clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    //Click on link “shopping cart” display into success message
    By clickShoppingCart = By.xpath("//button[@id='button-cart']");

    public void clickOnShppingCart() {
        clickOnElement(clickShoppingCart);
    }

    //Verify the text "Shopping Cart"
    By verifyShoppingCart = By.xpath("//div[@id='content']//h1");

    public String getVerifyShoppingCart() {
        return getTextFromElement(verifyShoppingCart);
    }

    //Verify the Product name "HP LP3065"
    By verifyHPlp3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");

    public String getVerifyProductName() {
        return getTextFromElement(verifyHPlp3065);
    }

    //Verify the Delivery Date "2022-11-30"
    By verifyDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");

    public String getVerifyDeliveryDate() {
        return getTextFromElement(verifyDate);
    }

    //Verify the Model "Product21"
    By verifyModel = By.xpath("//li[contains(text(),'Product Code: Product 21')]");

    public String getVerifyModel() {
        return getTextFromElement(verifyModel);
    }

    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }

    public void verifyZtoAforDropDroDown() {
        // Get all the products name and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals("Product not sorted into Z to A order",
        //  originalProductsName, afterSortByZToAProductsName);

    }

}
