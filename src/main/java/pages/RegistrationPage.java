package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.By.xpath;
import static tests.BaseTest.driver;
import static tests.BaseTest.wait;

public class RegistrationPage {
    private By signInField = xpath("//android.widget.TextView[@text='sign in']");
    private By signUpField = xpath("//android.widget.TextView[@text='Sign Up']");
    private By myAppField = xpath("//android.widget.TextView[@text='my-app']");
    private By firstNameField = xpath("//android.widget.EditText[@text='First Name']");
    private By lastNameField = xpath("//android.widget.EditText[@text='Last Name']");
    private By nextField = xpath("//android.widget.TextView[@text='Next']");
    private By emailField = xpath("//android.widget.EditText[@text='Email']");
    private By phoneNumberField = xpath("//android.widget.EditText[@text='Phone number']");
    private By passwordField = xpath("//android.widget.EditText[@text='Password']");
    private By confirmPasswordField = xpath("//android.widget.EditText[@text='Confirm Password']");
    private By finishSignUpField = xpath("//android.widget.TextView[@text='Sign Up']");
    private By errorField = xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]");

    public WebElement getFirstNameField() {
        return driver.findElement(firstNameField);
    }
    public WebElement getSignInField() {
        return driver.findElement(signInField);
    }
    public WebElement getSignUpField() {
        return driver.findElement(signUpField);
    }
    public WebElement getMyAppField() {
        return driver.findElement(myAppField);
    }
    public WebElement getLastNameField() {
        return driver.findElement(lastNameField);
    }
    public WebElement getNextField() {
        return driver.findElement(nextField);
    }
    public WebElement getEmailField() {
        return driver.findElement(emailField);
    }
    public WebElement getPhoneNumberField() {
        return driver.findElement(phoneNumberField);
    }
    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }
    public WebElement getConfirmPasswordField() {
        return driver.findElement(confirmPasswordField);
    }
    public WebElement getFinishSignUpField() {
        return driver.findElement(finishSignUpField);
    }
    public WebElement getErrorField() {
        return driver.findElement(errorField);
    }
    public WebElement getWaitMyAppField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(myAppField));
    }
    public WebElement getWaitErrorField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(errorField));
    }
    public WebElement getWaitSignInField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(signInField));
    }
    public WebElement getWaitSignUpField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(signUpField));
    }
    public WebElement getWaitNextField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(nextField));
    }
    public WebElement getWaitEmailField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(emailField));
    }
    public WebElement getWaitPasswordField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(passwordField));
    }
}
