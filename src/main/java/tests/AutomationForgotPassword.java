package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.PasswordPage;

import static org.testng.Assert.assertTrue;


public class AutomationForgotPassword extends BaseTest{
    private final PasswordPage passwordPage;

    public AutomationForgotPassword(PasswordPage passwordPage) {
        this.passwordPage = passwordPage;
    }

    @Test
    public void testForgotPassword() {
        System.out.println("1 step");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='my-app']")));
        passwordPage.getMyAppField().click();

        System.out.println("2 step");
        //close error
        passwordPage.getWaitErrorField();
        passwordPage.getErrorField();
        //click on sign in
        passwordPage.getWaitSignInField();
        passwordPage.getSignInField().click();
        passwordPage.getForgotPasswordField().click();

        assertTrue(driver.findElement(By.xpath("path to home page element")).isDisplayed(),
                "User is not successfully registered.");
    }
}
