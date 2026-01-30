package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.RegisterPage;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Inside BaseTest.java
    // Inside BaseTest.java
    public void registerAndLogin() {
        driver.get("https://povio-at.herokuapp.com/users/sign_up");
        RegisterPage register = new RegisterPage(driver, wait);

        String email = "user" + System.currentTimeMillis() + "@mail.com";
        String password = "Test1234!";

        // FIX: You MUST add a name string here (e.g., "Test User")
        // to satisfy the 3-parameter requirement
        register.register("Test User", email, password);
    }

    @AfterMethod
    public void postTestCleanup() {
        if (driver != null) {
            driver.quit();
        }
    }
}