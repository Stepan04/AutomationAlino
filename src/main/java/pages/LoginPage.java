package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.By.xpath;
import static tests.BaseTest.driver;
import static tests.BaseTest.wait;

public class LoginPage {
    private By signInField = xpath("//android.widget.TextView[@text='sign in']");
    private By myAppField = xpath("//android.widget.TextView[@text='my-app']");
    private By emailField = xpath("//android.widget.EditText[@text='Email']");
    private By passwordField = xpath("//android.widget.EditText[@text='Password']");
    private By loginField = xpath("//android.widget.TextView[@text='Login']");



    public WebElement getSignInField() {
        return driver.findElement(signInField);
    }
    public WebElement getMyAppField() {
        return driver.findElement(myAppField);
    }
    public WebElement getEmailField() {
        return driver.findElement(emailField);
    }
    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }
    public WebElement getLoginField() {
        return driver.findElement(loginField);
    }
    public WebElement getWaitMyAppField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(myAppField));
    }
    public WebElement getWaitSignInField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(signInField));
    }
    public WebElement getWaitEmailField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(emailField));
    }
}
