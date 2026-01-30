package e2e;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginTest extends BaseTest {

    @Test
    public void userCanLoginWithValidCredentials() {
        driver.get("https://povio-at.herokuapp.com/");

        HomePage home = new HomePage(driver, wait);
        home.goToLogin();

        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.login("dgashi.email@gmail.com", "12345678");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
        boolean isLogged = driver.findElement(By.linkText("Sign out")).isDisplayed();
        Assert.assertTrue(isLogged, "Login failed: Sign out button not visible.");
    }
}