package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public static WebDriverWait wait;
    public static AndroidDriver driver;

    @BeforeSuite
    public void createDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.1.101:5555");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("app", "D:\\1project\\MyProject\\src\\main\\resources\\apk\\Expo_2.26.6_Apkpure.apk");
        capabilities.setCapability("noReset", "true");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);

        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }

    //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
    // driver.findElement(By.xpath("")).click();
    // driver.findElement(By.xpath("")).sendKeys("");
    //        Thread.sleep(Duration.ofSeconds(2));
}
