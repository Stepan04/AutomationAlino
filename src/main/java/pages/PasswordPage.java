package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.By.xpath;
import static tests.BaseTest.driver;
import static tests.BaseTest.wait;

public class PasswordPage {
    private By myAppField = xpath("//android.widget.TextView[@text='my-app']");
    private By signInField = xpath("//android.widget.TextView[@text='sign in']");
    private By forgotPasswordField = xpath("//android.widget.TextView[@text='Forgot Password?']");
    private By errorField = xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]");



    public WebElement getMyAppField() {
        return driver.findElement(myAppField);
    }
    public WebElement getSignInField() {
        return driver.findElement(signInField);
    }
    public WebElement getForgotPasswordField() {
        return driver.findElement(forgotPasswordField);
    }
    public WebElement getErrorField() {
        return driver.findElement(errorField);
    }
    public WebElement getWaitErrorField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(errorField));
    }
    public WebElement getWaitSignInField() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(signInField));
    }
}
