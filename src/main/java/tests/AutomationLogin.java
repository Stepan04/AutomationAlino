package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.LoginPage;


import static org.testng.Assert.assertTrue;
@Log4j2
public class AutomationLogin extends BaseTest {
    private final LoginPage loginPage;

    public AutomationLogin(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Test (description = "Sign in test")
    public void testLogin() {

        log.info("1 step");
        loginPage.getWaitMyAppField();
        loginPage.getMyAppField().click();

        log.info("2 step");
        //click on sign in
        loginPage.getWaitSignInField();
        loginPage.getSignInField().click();

        loginPage.getWaitEmailField();
        loginPage.getEmailField().sendKeys("user@gmail.com");
        loginPage.getPasswordField().sendKeys("password123");
        loginPage.getLoginField().click();
        log.info("Finish");

        assertTrue(driver.findElement(By.xpath("path to home page element")).isDisplayed(),
                "User is not successfully registered.");
    }
}
