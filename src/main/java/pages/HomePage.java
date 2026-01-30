package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By signUpLink = By.cssSelector("a[href='/users/sign_up']");
    By loginLink = By.cssSelector("a[href='/users/sign_in']");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void goToRegister() {
        wait.until(ExpectedConditions.elementToBeClickable(signUpLink)).click();
    }

    public boolean isSignUpVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(signUpLink)).isDisplayed();
    }

    public void goToLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
    }


}
