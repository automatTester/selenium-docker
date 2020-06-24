package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public RegistrationPage clickRegister(){
        driver.findElement(By.linkText("REGISTER"));
        return new RegistrationPage(driver);
    }



//    //a[@href='mercuryregister.php?osCsid=9cbe1a3d96b47dce3929eb10f9ba2ece']
}
