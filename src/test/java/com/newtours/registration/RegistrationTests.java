package com.newtours.registration;

import com.newtours.base.BaseTests;
import com.newtours.pages.CreateAccountSuccessPage;
import com.newtours.pages.RegistrationPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegistrationTests extends BaseTests {

    @Test
    public void testSuccessfulRegistration() {
        RegistrationPage registrationPage = homePage.clickRegister();
        CreateAccountSuccessPage createAccountSuccessPage = registrationPage.clickSubmit();
        assertEquals(createAccountSuccessPage.getConfirmationMessage(), "© 2005, Mercury Interactive (v. 011003-1.01-058)", "Account creation confirmation message is incorrect");
    }

}
