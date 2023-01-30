package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.RegistrationPage;

import static org.testng.Assert.*;

public class AutomationSignUp extends BaseTest {
    private final RegistrationPage registrationPage;

    public AutomationSignUp() {
        this.registrationPage = new RegistrationPage();
    }

    @Test(description = "Sign up test")
    public void testSignUp() {
        System.out.println("1 step");
        registrationPage.getWaitMyAppField();
        registrationPage.getMyAppField().click();

        System.out.println("2 step");
        //close error
        registrationPage.getWaitErrorField();
        registrationPage.getErrorField().click();

        //click on sign in
        registrationPage.getWaitSignInField();
        registrationPage.getSignInField().click();

        System.out.println("3 step sign-up");
        registrationPage.getWaitSignUpField();
        registrationPage.getSignUpField().click();

        System.out.println("4 step-first last name");
        registrationPage.getWaitNextField();
        registrationPage.getFirstNameField().sendKeys("Firsts_User");
        registrationPage.getLastNameField().sendKeys("Lasts_User");

        System.out.println("5 step-click-next(close)");
        registrationPage.getNextField().click();

        System.out.println("6 step-email-phone");
        registrationPage.getWaitEmailField();
        registrationPage.getEmailField().sendKeys("user@gmail.com");
        registrationPage.getPhoneNumberField().sendKeys("+38096999999");


        System.out.println("7 step-click-next");
        registrationPage.getNextField().click();

        System.out.println("8 step-password");
        registrationPage.getWaitPasswordField();
        registrationPage.getPasswordField().sendKeys("password123");
        registrationPage.getConfirmPasswordField().sendKeys("password123");


        System.out.println("9 step-sign up");
        registrationPage.getFinishSignUpField().click();
        System.out.println("Finish");


        assertTrue(driver.findElement(By.xpath("path to home page element")).isDisplayed(),
                "User is not successfully registered.");
    }
}


