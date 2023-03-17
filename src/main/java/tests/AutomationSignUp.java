package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import lombok.extern.log4j.Log4j2;

import static org.testng.Assert.*;
@Log4j2
public class AutomationSignUp extends BaseTest {
    private final RegistrationPage registrationPage;

    public AutomationSignUp() {
        this.registrationPage = new RegistrationPage();
    }

    @Test(description = "Sign up test")
    public void testSignUp() {
        log.info("1 step sign-up");
        registrationPage.getWaitSignUpField();
        registrationPage.getSignUpField().click();

        log.info("2 step-first last name");
        registrationPage.getWaitNextField();
        registrationPage.getFirstNameField().sendKeys("Firsts_User");
        registrationPage.getLastNameField().sendKeys("Lasts_User");

        log.info("3 step-click-next(close)");
        registrationPage.getNextField().click();

        log.info("4 step-email-phone");
        registrationPage.getWaitEmailField();
        registrationPage.getEmailField().sendKeys("user@gmail.com");
        registrationPage.getPhoneNumberField().sendKeys("+38096999999");


        log.info("5 step-click-next");
        registrationPage.getNextField().click();

        log.info("6 step-password");
        registrationPage.getWaitPasswordField();
        registrationPage.getPasswordField().sendKeys("password123");
        registrationPage.getConfirmPasswordField().sendKeys("password123");


        log.info("7 step-sign up");
        registrationPage.getFinishSignUpField().click();
        log.info("Finish");


        assertTrue(driver.findElement(By.xpath("path to home page element")).isDisplayed(),
                "User is not successfully registered.");
    }
}


