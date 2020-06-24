package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By submitButton = By.cssSelector("[type='image']");
//    private By firstNameTextBox = By.name("firstName");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
//        this.wait = new WebDriverWait(driver, 30);
//        FluentWait wait = new FluentWait(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.visibilityOf(
//                driver.findElement(firstNameTextBox)));
    }

    public CreateAccountSuccessPage clickSubmit() {
        driver.findElement(submitButton).click();
        return new CreateAccountSuccessPage(driver);
    }
}
