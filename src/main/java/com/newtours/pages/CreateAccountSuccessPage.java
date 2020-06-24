package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountSuccessPage {
    private WebDriver driver;
    public By confirmationText = By.xpath("//div[contains(@class, 'footer')]");

    public CreateAccountSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationText).getText();
    }
}
