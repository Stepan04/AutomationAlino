package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.LoginPage;


import static org.testng.Assert.assertTrue;

public class AutomationLogin extends BaseTest {
    private final LoginPage loginPage;

    public AutomationLogin(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Test
    public void testLogin() {

        System.out.println("1 step");
        loginPage.getWaitMyAppField();
        loginPage.getMyAppField().click();

        System.out.println("2 step");
        //close error
        loginPage.getWaitErrorField();
        loginPage.getErrorField().click();

        System.out.println("3 step");
        //click on sign in
        loginPage.getWaitSignInField();
        loginPage.getSignInField().click();

        loginPage.getWaitEmailField();
        loginPage.getEmailField().sendKeys("user@gmail.com");
        loginPage.getPasswordField().sendKeys("password123");
        loginPage.getLoginField().click();
        System.out.println("Finish");
        assertTrue(driver.findElement(By.xpath("path to home page element")).isDisplayed(),
                "User is not successfully registered.");
    }
}
