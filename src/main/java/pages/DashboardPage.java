package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    WebDriver driver;
    WebDriverWait wait;

    By logoutLink = By.cssSelector("a[href='/users/sign_out']");

    public DashboardPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out"))).isDisplayed();
    }

}
