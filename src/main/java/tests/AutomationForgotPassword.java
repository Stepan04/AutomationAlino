package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.PasswordPage;

import static org.testng.Assert.assertTrue;
@Log4j2

public class AutomationForgotPassword extends BaseTest{
    private final PasswordPage passwordPage;

    public AutomationForgotPassword(PasswordPage passwordPage) {
        this.passwordPage = passwordPage;
    }

    @Test(description = "Forgot password test")
    public void testForgotPassword() {
        log.info("1 step");
        passwordPage.getMyAppField();
        passwordPage.getMyAppField().click();

        log.info("2 step");
        //click on sign in
        passwordPage.getWaitSignInField();
        passwordPage.getSignInField().click();
        passwordPage.getForgotPasswordField().click();

        assertTrue(driver.findElement(By.xpath("path to home page element")).isDisplayed(),
                "User is not successfully registered.");
    }
}
